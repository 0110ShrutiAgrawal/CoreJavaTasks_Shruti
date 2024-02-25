package com.hughes.pojo;

public class PojoExample2 {

	private String fName;
	private String lName;

	public PojoExample2() {

	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String display() {
		return fName + lName;
	}

}
