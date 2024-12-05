package com.gn.study.constructor.model.vo;

public class Cake {
	public String flavor = "Choco"; // 명시적 초기화 > 변수 기본값
	
	public static int price = 27000; //(static) 명시적 초기화
	
	{flavor = "딸기";} //초기화 블록 > 명시적 초기화 (우선순위)
	static {price = 32000;}
	
	public Cake() {
		this.flavor = "녹차"; // 생성자를 통한 초기화 > 초기화 블록
		//this.price = 40000; //클래스 변수는 생성자를 통한 초기화X
	}

}
