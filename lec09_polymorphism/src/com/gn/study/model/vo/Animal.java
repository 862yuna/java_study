package com.gn.study.model.vo;

// 추상 클래스 
// -> abstract 메소드가 없어도 abstract 클래스 선언 가능
public abstract class Animal {
	// 추상 메소드 -> 클래스 내부에 하나라도 추상 메소드가 있으면 무조건 추상 클래스여야함.
	public abstract void sound();
	
	public void breath() {
		System.out.println("동물은 숨을 쉽니다.");
	}
	
	
}
