package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		_02_GuestBook book = new _02_GuestBook();
		book.method();

	}
	
	public void method() {
		
		
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		add = new JButton("Add Name");
		view = new JButton("View Names");
		add.addActionListener(this);
		view.addActionListener(this);
		panel.add(add);
		panel.add(view);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);
		frame.pack();
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			names.add(JOptionPane.showInputDialog("Please enter a name to add to the guest list."));
		}
		if(e.getSource().equals(view)) {
			String message = "";
			for (int i = 0; i < names.size(); i++) {
				String s = names.get(i);
				message += ("Guest #" + (i+1) + ": " + s + "\n");
			}
			JOptionPane.showMessageDialog(null, message);
		}
	}
	
	
	
}
