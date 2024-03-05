package com.hughes.model;

public class Aadhar {

	private Long aadharNo;
	private String citizenName;
	private Long mobileNo;
	private String address;
	private double income;
	private String state;
	
	public Aadhar()
	{
		
	}

	public Aadhar(Long aadharNo, String citizenName, Long mobileNo, String address, double income, String state) {
		this.aadharNo = aadharNo;
		this.citizenName = citizenName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.income = income;
		this.state = state;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
