package com.gn.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		
		int min = num1 < num2 ? num1 : num2;
		System.out.println("두 수 중에서 작은 수는? " + min);
		
		// 더해보기
		// 사용자로부터 3개의 정수를 입력받으세요.
		// 중첩 삼항 연산자를 사용해서 세 개의 정수 중에서 가장 큰 수를 출력하세요.
		System.out.print("첫번째 : ");
		int a = sc.nextInt();
		System.out.print("두번째 : ");
		int b = sc.nextInt();
		System.out.print("세번째 : ");
		int c = sc.nextInt();
		
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.print("세 개의 수 중에 가장 큰 수는? " + max);

	}

}
