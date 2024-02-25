package com.hughes.exercises;

public class Anchor {
	private boolean state;

	public void callFunction(boolean state) {
		this.state = state;
		if (this.state) {
			System.out.println("The switch is ON");
		} else {
			System.out.println("The switch is OFF");
		}
	}
}