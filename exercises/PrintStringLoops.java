package com.hughes.exercises;

//Display the given String as below.
//i/p: Computer
//o/p:
//c
//o
//m
//p
//u
//t
//e
//r

/**
 * @author 91959
 *
 */
public class PrintStringLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Computer";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
	}

}
