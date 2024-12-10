package com.gn.study.controller;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		try {
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
		}finally {
			System.out.println("계산끝!!");
		}
	}
}
