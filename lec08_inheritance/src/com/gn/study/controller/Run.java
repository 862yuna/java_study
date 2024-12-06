package com.gn.study.controller;

import com.gn.study.model.vo.Dog;
import com.gn.study.model.vo.Juice;

public class Run {

	public static void main(String[] args) {
		Dog d = new Dog();
		
//		Parent p = new Parent();
//		System.out.println(p.getA());
//		Child c = new Child();
//		System.out.println(c.getA());
		
		Juice j = new Juice("트로피칼",500,"용과");
//		j.printInfo();
		j.juiceInfo();
		
		
		
		
		
	}
}
