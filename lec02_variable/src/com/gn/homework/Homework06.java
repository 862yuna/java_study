package com.gn.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("한 자리 숫자를 입력하세요: ");
	String num1 = sc.nextLine();
	
	char a = num1.charAt(0);
	int b = a-'0';
	int c = b*b;
	System.out.println("입력한 숫자의 제곱은" + c + "입니다.");

	}

}
