package com.hughes.exercises;

import java.util.Scanner;

//Problem Statement
//Based on the i/p,you need to display whether it is integer or float or character or string.

/**
 * @author 91959
 *
 */
public class InputDataTypeQues {

	public static void main(String[] args) {

		// Created a scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// User will enter a value
		System.out.print("Enter a value: ");

		String input = scanner.nextLine();
		scanner.close();

		// Check the type of input and print the result
		if (isInteger(input)) {
			System.out.println("Input is an integer.");
		} else if (isFloat(input)) {
			System.out.println("Input is a float.");
		} else if (isCharacter(input)) {
			System.out.println("Input is a character.");
		} else {
			System.out.println("Input is a string.");
		}
	}

	// Method to check if the input is an integer
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// Method to check if the input is a float
	public static boolean isFloat(String input) {
		try {
			Float.parseFloat(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// Method to check if the input is a character
	public static boolean isCharacter(String input) {
		return input.length() == 1;
	}

}