package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton surprise;
	
	
	Song demo = new Song("demo.mp3");
	Song harry = new Song("harrystyles.mp3");
	Song lights = new Song("lights.mp3");
	Song rodeo = new Song("rodeo.mp3");
	
	Random rand = new Random();
	
	ArrayList<Song> songs = new ArrayList<Song>();
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		
		_06_IPodShuffle joe = new _06_IPodShuffle();
		joe.itLives();
	}
	
	public void itLives() {
		songs.add(demo);
		songs.add(harry);
		songs.add(lights);
		songs.add(rodeo);
		frame = new JFrame();
		panel = new JPanel();
		surprise = new JButton("Surprise Me!");
		frame.add(panel);
		panel.add(surprise);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		surprise.addActionListener(this);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < songs.size(); i++) {
			songs.get(i).stop();
		}
		if(e.getSource() == surprise) {
			int a = rand.nextInt(4);
			songs.get(a).play();
		}
	}
	
}