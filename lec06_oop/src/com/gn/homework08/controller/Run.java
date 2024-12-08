package com.gn.homework08.controller;

import com.gn.homework08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();
		
		// 기본 생성자를 이용한 출력
		p.name="김철수";
		p.age = 20;
		System.out.println(p.name+"는 "+p.age+"살입니다.");
		
		// getter 와 setter 를 이용한 출력
		p.setName("김철수");
		p.setAge(20);
		System.out.println(p.getName()+"는 "+p.getAge()+"살 입니다.");
	
	
	}

}
