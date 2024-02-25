package com.hughes.exercises;

/**
 * @author 91959
 *
 */
class A {
	void displayFuncA() {
		System.out.println("Displaying in Class A");
	}
}

class B extends A {
	void displayFuncB() {
		System.out.println("Displaying in Class B");
	}
}

class C extends A {
	void displayFuncC() {
		System.out.println("Displaying in Class C");
	}
}

public class HierarichalInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B objectB = new B();
		
		objectB.displayFuncB();

		C objectC = new C();
		
		objectC.displayFuncA();
		objectC.displayFuncC();

	}

}
