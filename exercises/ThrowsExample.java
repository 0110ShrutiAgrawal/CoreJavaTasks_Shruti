package com.hughes.exercises;

import java.io.IOException;

class Mat{
	public void mymethod() throws IOException,NullPointerException{
		throw new IOException("io error");
	}
}
public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Mat().mymethod();

	}

}
