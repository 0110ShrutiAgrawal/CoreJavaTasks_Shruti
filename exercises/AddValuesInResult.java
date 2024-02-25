package com.hughes.exercises;

//add values from 239 till 699 using for loop.
//example:
//2 till 8
// 
//2+3+4+5+6+7+8=?

/**
 * @author 91959
 *
 */

public class AddValuesInResult {

	public static void main(String[] args) {
		// Define the start and end values for the range
		
		int start = 239;
		int end = 699;
		int result = 0; // Initialize the result variable to store the sum

		// Loop through the numbers from start to end and add them to the result
		
		for (int i = start; i <= end; i++) {
			result += i;
		}

		// Print the final result
		
		System.out.println("After adding values from 239 to 699 the final result is :" + result);
	}

}
