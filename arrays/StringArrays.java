package com.hughes.arrays;

import java.util.Arrays;

//"cat"
//
//"bat"
//
//"rat"
//
//"computer"
// 
//in an array
// 
//and display the contents in array in ascending order.

/**
 * @author 91959
 *
 */
public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = { "cat", "bat", "rat", "computer" };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("..........");
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
