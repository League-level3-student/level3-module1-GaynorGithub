package _01_IntroToArrayLists;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class _04_RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
			public String type;
		}
		class Worm extends Stuff {
			public Worm() {
				type = "worm";
			}
		}
		class Dirt extends Stuff {
			public Dirt() {
				type = "dirt";
			}
		}
		ArrayList<Stuff> stuffIF = new ArrayList<Stuff>();
		stuffIF.add(new Worm());
		stuffIF.add(new Dirt());
		stuffIF.add(new Dirt());
		stuffIF.add(new Dirt());
		stuffIF.add(new Worm());
		stuffIF.add(new Dirt());

		System.out.println(stuffIF.size());

		/* TODO 1: Clean out the dirt but keep the delicious worms. */
		
		for (int i = 0; i < stuffIF.size(); i++) {
			System.out.println(stuffIF.get(i).type);
			if(stuffIF.get(i).type.equals("dirt")) {
				stuffIF.remove(i);
				i--;
			}
			
		}
		
		
		System.out.println(stuffIF.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('c');
		truth.add('a');
		truth.add('#');
		truth.add('l');
		truth.add('#');
		truth.add('i');
		truth.add('f');
		truth.add('o');
		truth.add('#');
		truth.add('r');
		truth.add('n');
		truth.add('#');
		truth.add('i');
		truth.add('#');
		truth.add('a');
		truth.add('#');
		truth.add(' ');
		truth.add('i');
		truth.add('#');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('w');
		truth.add('#');
		truth.add('a');
		truth.add('r');
		truth.add('#');
		truth.add('m');
		truth.add('e');
		truth.add('r');
		truth.add('#');
		/* TODO 2: Remove the hash symbols and print out the truth. */

		for (int i = 0; i < truth.size(); i++) {
			if(truth.get(i).equals('#')) {
				truth.remove(i);
				i--;
			}
		}
		
		System.out.println(truth);
	}
}
