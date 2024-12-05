package com.gn.practice06.run;

import com.gn.practice06.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setId("user01");
		p.setPwd("1234");
		p.setName("김철수");
		p.setAge(43);
		p.setGender('M');
		p.setPhone("010-111-1111");
		p.setEmail("kcs@gmail.com");
		
		String data = p.information();
		System.out.println(data);
		
	}
}
