package section3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = showInputDialog("what is your name ?");
		showMessageDialog(null, "hi " + name);
		String address = showInputDialog("what is your address?");

		String credit = showInputDialog("what is your credit card number ?");

		String social = showInputDialog("what is your social security number ?");
		String security = showInputDialog("do you have a alarm, home security system or dog ? If so what?");
		String weapons = showInputDialog("do you posess any weapons ?");
		String car = showInputDialog("do you have a car ? If so what type and model?");
		String situation = showInputDialog("are you alone or a couple ?");
		String favoritefood = showInputDialog("what is your favorite drink? ");
		String favoriteac = showInputDialog(" what is your favorite show ?");
		JOptionPane.showMessageDialog(null,
				" well " + name + "we have deduced from our high tech computers that you would do anything \n to watch "
						+ favoriteac + "with a bottle of " + favoritefood
						+ "at your side,even if that mean't leaving your home at" + address + " in your \n" + car
						+ "with it unprotected except" + security + "leaving it un protected to burglars");

	}

}
