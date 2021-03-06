package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		
		Stack<Double> doubles = new Stack<Double>();
		Random rand = new Random();
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			double j = (rand.nextDouble()*100);
			doubles.push(j);
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String num1 = JOptionPane.showInputDialog(null, "Please enter a number between 0 and 100");
		double one = Double.parseDouble(num1);
		String num2 = JOptionPane.showInputDialog(null, "Please enter a number between 0 and 100");
		double two = Double.parseDouble(num2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < doubles.size(); i++) {
			Double k = doubles.pop();
			if((k < one && k > two) || (k < two && k > one)) {
				System.out.println(k);
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
