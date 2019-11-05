package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("Joe");
		names.add("Nolan");
		names.add("Sam");
		names.add("Brenna");
		names.add("Laika");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			System.out.println("The name at " + i + " is " + s);
		}
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		
		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			if(i%2==0) {
				System.out.println(s);
			}
		}
		System.out.println("");
		
		//6. Print all the Strings in reverse order.
		for (int i = names.size()-1; i > -1; i--) {
			String s = names.get(i);
			System.out.println(s);
		}
		System.out.println("");
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)==('e')) {
					System.out.println(s);
				}
			}
		}
	}
}
