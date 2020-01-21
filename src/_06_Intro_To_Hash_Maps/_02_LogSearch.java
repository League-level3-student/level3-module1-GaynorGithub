package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Create a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	HashMap<Integer, String> ids = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton aEntry = new JButton("Add Entry");
	JButton sID = new JButton("Search by ID");
	JButton vList = new JButton("View List");
	
	
	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
		log.start();
	}
	
	void start() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(aEntry);
		panel.add(sID);
		panel.add(vList);
		aEntry.addActionListener(this);
		sID.addActionListener(this);
		vList.addActionListener(this);
		
		
		
		
		
		
		frame.pack();
	}
	
	void addEntry() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID number"));
		String name = JOptionPane.showInputDialog("Please enter a name");
		ids.put(id, name);
	}
	
	void searchID() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID number"));
		if(ids.containsKey(id)) {
			JOptionPane.showMessageDialog(null, "The name that coorosponds to the entered key is: " + ids.get(id) + ".");
		} else {
			JOptionPane.showMessageDialog(null, "This entry does not exist.");
		}
		
	}
	
	void viewList() {
		if(!ids.isEmpty()) {
			System.out.println(ids.keySet());
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(aEntry)) {
			addEntry();
		}
		if(e.getSource().equals(sID)) {
			searchID();
		}
		if(e.getSource().equals(vList)) {
			viewList();
		}
	}
	
	
	
	
}













