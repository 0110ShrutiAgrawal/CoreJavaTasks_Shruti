package com.hughes.exercises;

public class ConstructorExample {
	private String firstName;

	ConstructorExample() {
		// Unparametrised Constructor
		System.out.println("Unparametrised Constructor");
		return;
	}

	ConstructorExample(String first) {
		// Parametrised Constructor
		firstName = first;
		System.out.println("Parametrised Constructor: " + firstName);
	}

	public void display() {
		System.out.println("Function overloaded");
	}

	public void display(long mobile) {
		System.out.println("Function overloaded " + mobile);
	}

	public static void main(String[] args) {
		ConstructorExample p = new ConstructorExample("Shruti");
		p.display(123456789L);
	}
}
