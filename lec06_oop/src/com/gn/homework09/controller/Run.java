package com.gn.homework09.controller;

import com.gn.homework09.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("김철수");
		s1.setClassName('A');
		
		Student s2 = new Student();
		s2.setName("홍길동");
		s2.setClassName('F');
		
		Student s3 = new Student();
		s3.setName("이영희");
		s3.setClassName('B');
		
		System.out.println(s1.getStudentNumber()+" "+s1.getName()+" "+s1.getClassName());
		System.out.println(s2.getStudentNumber()+" "+s2.getName()+" "+s2.getClassName());
		System.out.println(s3.getStudentNumber()+" "+s3.getName()+" "+s3.getClassName());
		
		
		
		
		
		
		
		
		
		
		
	}

}
