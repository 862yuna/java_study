package com.gn.practice07;

public class Suppliment {
	public String name; //영양제
	public int dose; // 복용량
	public int price; //가격
	
	public Suppliment(String name, int dose, int price) {
		this.name = name;
		this.dose = dose;
		this.price = price;
	}
	
	public void infomation() {
		System.out.println("이름 : "+name+", 복용량 : "+dose+"알"+", 가격: "+price+"원");
		
	}
	
	
	
	
	
	
	
	
}
