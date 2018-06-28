package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String q1 = JOptionPane.showInputDialog("what is the square root of nine ?");
		if (q1.equals("three") || q1.equals("3")) {
			JOptionPane.showMessageDialog(null, "you got it right!!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "sorry  you were wrong");
		}
		String q2 = JOptionPane.showInputDialog("12 x 12");
		if (q2.equals("144")) {
			JOptionPane.showMessageDialog(null, "you got it right!!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "sorry  you were wrong");
		}
		String q3 = JOptionPane.showInputDialog("what is 1+2+3+4+5+6+7+8+9+10 ?");
		if (q3.equals("55")) {
			JOptionPane.showMessageDialog(null, "you got it right!!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "sorry  you were wrong");
		}
		String q4 = JOptionPane.showInputDialog("what is the strongest substance on earth ?");
		if (q4.equals("diamond")) {
			JOptionPane.showMessageDialog(null, "you got it right!!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "sorry  you were wrong");
		}
		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "you got " + score + " out of 4, great job!");
	}
}
