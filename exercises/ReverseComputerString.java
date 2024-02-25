package com.hughes.exercises;

//i/p:String a = "Computer"
//o/p: r e t u p m o C


/**
 * @author 91959
 *
 */
public class ReverseComputerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Computer";
		String output = " ";
		
		//Starting from end of string in reverse order decrementing.
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i)+ " "; // Add a space after each character;
		}
		
		System.out.println(output.trim()); // Trim to remove the trailing space

	}

}
