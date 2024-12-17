package com.gn.study.controller;

public class MathRun {
	public static void main(String[] args) {
		// 1. abs() : 절대값
		System.out.println("____________abs()_______________");
		int num = -37;
//		num = num<0 ? -num : num;
		num = Math.abs(num);
		System.out.println(num);
		// 2. pow() : n제곱 구하기
		System.out.println("____________Math.pow()_______________");
		double dNum = Math.pow(5, 4);
		System.out.println(dNum);
		int result = 1;
		for(int i = 1;i<=4;i++) {
			result *= 5;
		}
		System.out.println(result);
		// 3. 반올림
		System.out.println("____________Math.round()_______________");
		double pi = 3.141592653578;
		// (1) 원하는 자리수만큼 10의 지수 곱하기
		double multi = pi* Math.pow(10, 3); // pi * 1000;
		System.out.println("multi : "+multi); //3141.592653578
		// (2) 반올림 처리
		double half = Math.round(multi);
		System.out.println("half : "+half);//3142.0
		// (3) 10의 지수 만큼 나누기
		double div = half/Math.pow(10, 3);
		System.out.println("div : "+div);//3.142
		// 정리
		double after = Math.round(pi*Math.pow(10, 2))/100.0; // (1)->(2)->(3) 동시처리
		System.out.println("after : "+after);//3.14
		
		// 4. 올림
		System.out.println("____________Math.ceil()_______________");
		double up = Math.ceil(pi);
		System.out.println(up); //4.0
		System.out.println("____________Math.floor()_______________");
		// 5. 내림
		double down = Math.floor(pi);
		System.out.println(down); // 3.0
		
		// 주의사항
		System.out.println(Math.ceil(1/2));
		System.out.println(Math.ceil(1/2.0));
		// 소수점 처리 가능 3.141592 -> 3.15
		System.out.println(Math.ceil(pi*Math.pow(10, 2))/Math.pow(10, 2));
		
		
		System.out.println("____________Math.random()_______________");
		
		
	}
}
