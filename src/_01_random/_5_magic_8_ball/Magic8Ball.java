//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
		JOptionPane.showInputDialog("Ask any question, and the Magic 8 Ball will answer!");
		Random randomMaker = new Random();
		int randomNumber = randomMaker.nextInt(3);

		if (randomNumber == 0){
			JOptionPane.showMessageDialog(null, "Yes");
		}
		if (randomNumber == 1){
			JOptionPane.showMessageDialog(null, "No");
		}
		if (randomNumber == 2){
			JOptionPane.showMessageDialog(null, "Reply hazy. Try again later.");
		}
	}
	// 2. Get the user to enter a question for the 8 ball to answer
	
	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
