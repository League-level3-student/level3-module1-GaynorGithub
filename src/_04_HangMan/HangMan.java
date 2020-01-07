package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class HangMan implements KeyListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String word = "";
	Utilities u = new Utilities();
	Stack<String> words = new Stack<String>();
	char[] chars;
	char[] rchars;
	
	
	
	public static void main(String[] args) {
		HangMan h = new HangMan();
		h.hang();
		
	}
	
	void hang() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of words you want to solve."));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		
		for (int i = 0; i < num; i++) {
			String y = Utilities.readRandomLineFromFile("dictionary.txt");
			if (words.contains(y)) {
				i--;
			} else {
				words.push(y);
			}
		}
		
		word = popWord();
		chars = new char[word.length()];
		rchars = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			chars[i] = word.charAt(i);
			rchars[i] = '_';
		}
		
		
		
		frame.pack();
		
		
	}
	
	String popWord() {
		String y = "";
		if(!words.isEmpty()) {
			y = words.pop();
			System.out.println(y);
			System.out.println(y.length());
			String d = "";
			for (int j = 0; j < y.length(); j++) {
				d=d+"_";
				label.setText(d);
			}
		}
		
		
		return y;
	}
	
	String makeStringFrom(char[] r) {
		String g = "";
		for (int i = 0; i < r.length; i++) {
			g = g + r[i];
		}
		
		return g;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < word.length(); i++) {
			if(e.getKeyChar() == word.charAt(i)) {
				rchars[i] = chars[i];
				label.setText(makeStringFrom(rchars));
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
