package com.hughes.exercises;

/*
 * Question-i/p:Java Fullstack
 * expected o/p: jAVA fULLSTACK
 */

/**
 * @author 91959
 *
 */
public class CaseConversion {
    //Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalString = "Java Fullstack"; // Input string
		String modifiedString = ""; // Output string

		// Iterate through each character in the input string 
		for (int i = 0; i < originalString.length(); i++) {
			char c = originalString.charAt(i); 
		
			//Go through each character and append it to the output string
			
			//Use predefined methods
			if (Character.isUpperCase(c)) {
				modifiedString += Character.toLowerCase(c);
			} else {
				modifiedString += Character.toUpperCase(c);
			}
		}

		System.out.println(modifiedString); // Print the modified string

	}

}
