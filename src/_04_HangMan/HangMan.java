package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Utilities u = new Utilities();
	Stack<String> words = new Stack<String>();
	
	
	public static void main(String[] args) {
		HangMan h = new HangMan();
		h.hang();
		
	}
	
	void hang() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of words you want to solve."));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.add(label);
		for (int i = 0; i < num; i++) {
			String y = Utilities.readRandomLineFromFile("dictionary.txt");
			if (words.contains(y)) {
				i--;
			} else {
				words.push(y);
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
	
}
