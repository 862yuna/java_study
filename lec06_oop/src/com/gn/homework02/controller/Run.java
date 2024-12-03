package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.phoneNumber = "01012345678";
		p1.length = 190.5;
		p1.weigth = 100.2;
		
		p2.phoneNumber = "01056434563";
		p2.length = 175.4;
		p2.weigth = 65.6;
		
		System.out.println("전화번호 : "+p1.phoneNumber+" /"+"키 : "+p1.length+" /"+"몸무게 : "+p1.weigth);
		System.out.println("전화번호 : "+p2.phoneNumber+" /"+"키 : "+p2.length+" /"+"몸무게 : "+p2.weigth);
	}

}
