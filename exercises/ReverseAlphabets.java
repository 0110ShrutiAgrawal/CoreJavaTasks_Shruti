package com.hughes.exercises;

//display Alphabets reverse order using do while.

/**
 * @author 91959
 *
 */
public class ReverseAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Simple do while loop using char datatype
		char alphabets = 'Z';
        do {
            System.out.print(alphabets + " ");
            alphabets--;
        } while (alphabets >= 'A');
        
        //using ascii values
        System.out.println("\n");
        int ascii = 90; // ASCII value of 'Z'
        do {
            char alphabet = (char) ascii;
            System.out.print(alphabet + " ");
            ascii--;
        } while (ascii >= 65); // ASCII value of 'A'

	}

}
