package com.gn.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		char word1 = fruit.charAt(0);
		char word2 = fruit.charAt(1);
		char word3 = fruit.charAt(2);
		System.out.println("첫번째 문자 : " + word1);
		System.out.println("두번째 문자 : " + word2);
		System.out.println("세번째 문자 : " + word3);
		
		
	}

}
