package com.gn.practice07;

public class Run {
	public static void main(String[] args) {
		double num = 5.13824;
		// 소수점 첫째자리까지 반올림 : 5.1
		System.out.println("첫째자리 :"+
				(Math.round(num*Math.pow(10, 1))/Math.pow(10, 1)));
		System.out.println("둘째자리 : "+
				(Math.round(num*Math.pow(10, 2))/Math.pow(10, 2)));
		System.out.println("셋째자리 : "+
				(Math.round(num*Math.pow(10, 3))/Math.pow(10, 3)));
		
		// 소수점 둘째자리까지 반올림 : 5.14
		
		// 소수점 셋쨰자리까지 반올림 : 5.138
	}
}
