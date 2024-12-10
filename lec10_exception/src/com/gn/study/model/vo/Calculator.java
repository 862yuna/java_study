package com.gn.study.model.vo;

public class Calculator {
	public int divide(int a, int b) {
// 1. 모든 블록에 return을 쓴다.		
//		try {
//			return a/b;
//		}catch(ArithmeticException e) {
//			return -1;
//		}
// 2. 임의의 변수를 활용한다.
		int answer = -1;
		try {
			answer = a/b;
		}catch(NullPointerException e) {
		// NullPointerException==ArithmeticException 동급이라 위치 상관X
		}catch(ArithmeticException e) { //Exception 만 써도 됨.
//			e.printStackTrace();
			System.out.println("오류 : "+e.getMessage());
//			System.out.println(e);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace(); // 위에서 부터 아래로 낮은순->높은순
		}
		
		System.out.println("확인");
		return answer;
		
		
		
	}
	
	
	
	
}
