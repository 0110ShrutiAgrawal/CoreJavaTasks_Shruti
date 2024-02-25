package com.hughes.arrays;
//Display 'a','b','c','d' in reverse order using Arrays.

/**
 * @author 91959
 *
 */
public class ReverseArray {
	public static void main(String[] args) {
		char[] chars = { 'a', 'b', 'c', 'd' };

		// Print the array in reverse order
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i] + " ");
		}
	}
}
