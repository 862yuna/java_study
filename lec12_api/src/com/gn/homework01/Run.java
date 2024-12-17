package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
//		String[] dst = new String[str.length()/3];
//		System.arraycopy(str, 0, dst, 0, dst.length);
//		Person[] p = str.split("\n");
		String[] person = new String[3];
		person = str.split("\n");
//		for(String p : person) {
//			System.out.println(p);
//		}
//		System.out.println(person[2]);
//		for(int i = 0;i<str.length();i++) {
//			person[i] = str.substring(i,str.indexOf(","));
//		}
//		System.out.println(person[0]);
		for(String p : person) {
			String[] info  = p.split(",");
			String name = info[0];
			int age = Integer.parseInt(info[1]);
			String address = info[2];
			char gender = info[3].charAt(0);
			Person personInfo = new Person(name, age, address, gender);
//			personInfo.setName(name);
//			personInfo.setAge(age);
//			personInfo.setAddress(address);
//			personInfo.setGender(gender);
			
			System.out.println(personInfo);
		}
	}
}
