package com.gn.homework03;

// 기능 제공용
public class Calculator {
	
	public void sentence(String text1, String text2) {
		System.out.println(text1 + text2);
	}
	
	public void combine(int num1,int num2) {
		if(num1<num2) {
			System.out.println("계산할 수 없습니다.");
			System.out.println(0);
		} else {
			System.out.println(num1*num2);
		}
	}
	
	public void fullWord(String word1, String word2) {
		if(word1.equals(word2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
}
