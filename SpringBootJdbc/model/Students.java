package org.edu.model;

public class Students {
	private int studentId;
	private String studentName;
	private int age;

	public Students() {
	}

	public Students(int StudentId, String StudentName, int age) {
		this.studentId = StudentId;
		this.studentName = StudentName;
		this.age = age;
	}

	public Students(int StudentId, String StudentName) {
		this.studentId = StudentId;
		this.studentName = StudentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}