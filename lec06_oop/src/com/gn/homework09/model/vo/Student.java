package com.gn.homework09.model.vo;

public class Student {
	private int studentNumber;
	private String name;
	private char className;
	
	public Student() {
		studentNumber++;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber=studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public char getClassName() {
		return className;
	}
	public void setClassName(char className) {
		this.className=className;
	}
	
}
