package com.edu.spring;

import java.util.Map;

public class MapSpring {
	private String fullname;
	private Map<String, String> ls;

	public MapSpring() {
	}

	public MapSpring(String name, Map<String, String> m) {
		fullname = name;
		ls = m;
	}

	public void display() {
		System.out.println(ls);
	}
}
