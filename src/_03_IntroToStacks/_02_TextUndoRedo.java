package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> on = new Stack<Character>();
	Stack<Character> off = new Stack<Character>();
	
	
	public static void main(String[] args) {
		_02_TextUndoRedo tur = new _02_TextUndoRedo();
		tur.method();
	}
	
	void method() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		label.setText(on.toString());
		System.out.println(on.toString());
		frame.addKeyListener(this);
		label.repaint();
		frame.repaint();
		frame.pack();
		
		
	}
	
	void stackToLabel() {
		String l = "";
		for (int i = 0; i < on.size(); i++) {
			l = l + on.get(i);
		}
		label.setText(l);
		System.out.println("on size:" + on.size() + "off size:" + off.size());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() != KeyEvent.VK_BACK_SPACE && e.getKeyCode() != KeyEvent.VK_RIGHT) {
			on.push(e.getKeyChar());
			System.out.println(e.getKeyChar());
			stackToLabel();
		}
		else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if(!on.isEmpty()) {
				char c = on.pop();
				off.push(c);
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(!off.isEmpty()) {
				char c = off.pop();
				on.push(c);
			}
		}
		stackToLabel();
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
