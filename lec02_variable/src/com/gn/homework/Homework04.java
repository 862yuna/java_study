package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요 : ");
		String word = sc.nextLine(); // word = "A";
		char c = word.charAt(0); // c = 'A';
		int num = c;
		
		System.out.println(c+"의 유니코드 : " + num);

		

	}

}
