package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int rand = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(rand);
		// 4. Get the user to enter something that they think is awesome
		String s1 = JOptionPane.showInputDialog("Enter something you think is awesome ");
		// 5. If the random number is 0
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, " That's awesome!!");
		}
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "eh, that's ok");
		}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "That's BORING!!");
		}
		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Why would anyone want to do that!!");
		}
		// -- write your own answer

	}
}
