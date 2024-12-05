package com.gn.homework04.controller;
// 기능 수행
public class ExMethodController {
	// 전달된 메세지 출력 메소드
	public void messege() {
		System.out.println("Hi");
	}
	
	// 1~100까지 합을 반환하는 메소드
	public void numberSum() {
		int sum = 0;
		for(int i =1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	// 전달된 정수가 홀/짝 인지 반환하는 메소드
	public void checkNum(int num1, int num2) {
		int su1 = num1%2;
		int su2 = num2%2;
		String result1 = "";
		String result2 = "";
		if(0<num1&&num2>0) {
			if(su1==0) {
				result1 = "짝수";
			} else {
				result1 = "홀수";
			}
			if(su2==0) {
				result2 = "짝수";
			} else {
				result2 = "홀수";
			}
		}
		System.out.println(result1+", "+result2);
	}
	
	// 전달된 문자열에 영문자 확인결과 반환 메소드
	public void checkText(String text1,String text2) {
//		char result1 = ' ';
//		char result2 = ' ';
//		while(true) {
//			for(int i = 0;i<text1.charAt(i);i++) {
//				if(97<=text1.charAt(i)&&text1.charAt(i)<=122) {
//					if(65<=text1.charAt(i)&&text1.charAt(i)<=90) {
//						result1 = text1.charAt(i);
//					}
//				}
//			}
//			for(int j = 0;j<text2.charAt(j);j++) {
//				if(97<=text2.charAt(j)&&text2.charAt(j)<=122) {
//					if(65<=text2.charAt(j)&&text2.charAt(j)<=90) {
//						result2 = text2.charAt(j);
//					}
//				}
//			}
//			System.out.println("영문자 확인 결과 : " + result1+result2);
//		}
	}
	
	// 문자열,문자 전달받아 문자가 몇개있는지 출력하는 메소드
	public void countText() {
		
	}
	
	//전달된 정수의 구구단 출력하는 메소드
	public void multiplication(int number1, int number2) {
		int result1 = 0;
		int result2 = 0;
		System.out.println("=== "+number1+"단 ===");
		for(int i=1;i<10;i++) {
			result1 = number1*i;
			System.out.println(number1+" * "+i+" = "+result1);
		}
		System.out.println("=== "+number2+"단 ===");
		for(int i=1;i<10;i++) {
			result2 = number2*i;
			System.out.println(number2+" * "+i+" = "+result2);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
