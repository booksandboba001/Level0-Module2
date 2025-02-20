//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		if (randomNumber == 1){
			JOptionPane.showMessageDialog(null, "Looking good today!");
		}
		if ( randomNumber == 2){
			JOptionPane.showMessageDialog(null, "You've been to the gym, haven't you?");
		}
		if (randomNumber == 3){
			JOptionPane.showMessageDialog(null, "You look like a lean, mean, coding machine!");
		}
		if (randomNumber == 4){
			JOptionPane.showMessageDialog(null, "Have a great day!");
		}
		if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "ftsábkíkaaaaaaaaaaaaaa (This means, 'sorry, brain was dying. Hope you have a good day')");
		}
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
