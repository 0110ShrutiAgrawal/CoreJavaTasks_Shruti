package com.edu.spring;

public class Subtraction {
	private int num1;
    private int num2;

    public Subtraction(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int doSubtraction() {
        return num1 - num2;
    }

}
