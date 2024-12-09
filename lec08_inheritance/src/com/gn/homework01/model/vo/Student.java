package com.gn.homework01.model.vo;

public class Student extends Person{
	private int grade; // 학년
	private String major; // 전공
	
	public Student() {
		
	}
	public Student(String name,int age,double height,double weight,int grade,String major) {
		super(age,height,weight);
		this.name=name;
		this.grade=grade;
		this.major=major;
	}
//	public String toString() {
//		return "=== "+name+" ==="+"\n"+"나이 : "+age+
//				"키 : "+height+"\n"+"몸무게 : "+weight+"\n"+
//				"학년 : "+grade+"\n"+"전공 : "+major;
//	}
	
	
	
	

}
