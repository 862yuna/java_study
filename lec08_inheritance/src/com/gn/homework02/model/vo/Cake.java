package com.gn.homework02.model.vo;

public class Cake {
	private double flour;
	private double cream;
	
	public Cake() {
		
	}
	public Cake(double flour,double cream) {
		
	}
	public double getFlour() {
		return flour;
	}
	public double getCream() {
		return cream;
	}
	
	public void setFlour(double flour) {
		this.flour = flour;
	}
	
	public void setCream(double cream) {
		this.cream = cream;
	}
	
	
	public String toString() {
		return "===== 어떤 케이크를 만드시겠습니까? ====="+"\n"+
		"1. 초콜릿 케이크(밀가루: 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)"+"\n"+
		"2. 녹차 케이크(밀가루: 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)"+"\n"+
		"9. 취소";
		
		
	}
	
	
	
	
	

}
