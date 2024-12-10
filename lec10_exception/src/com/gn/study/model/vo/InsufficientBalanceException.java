package com.gn.study.model.vo;
// 사용자 정의 예외
// 1. 클래스 선언
// 2. Exception 상송
public class InsufficientBalanceException extends Exception{
	// 3. 매개변수 생성자
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
