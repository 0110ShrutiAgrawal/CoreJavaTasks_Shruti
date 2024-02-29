package com.hughes.java8;

@FunctionalInterface // Annotation
interface SamExample1 {
	void display();// abstract method

	public default void hi() {
		System.out.println("Hi");
	}
}

public class Task1 implements SamExample1 {
	public static void main(String... a) {
		new Task1().display();
		new Task1().hi();
	}

	public void display() {
		System.out.println("Display");
	}
}