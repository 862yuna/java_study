package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 철수가 여권을 만들려고 합니다.
		// 영어 이름 : Chulsu
		// 20대 이신가요?
		// 1. 철수의 영어 이름과 나이 정보를 입력받습니다.
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 2. 세 가지 논리형 데이터 출력
		// (1) 영어 이름이 일치하나요? true
		boolean a = name.equals("Chulsu");
		System.out.println("영어 이름이 일치하나요? " + a);
		// (2) 20대 인가요? false
		boolean b = 20<=age && age<30;
		System.out.println("20대인가요? " + b);
		// (3) 영어 이름이 일치하면서 동시에 20대인가요? false
		boolean c = a && b;
		System.out.print("영어 이름이 일치하면서 동시에 20대인가요? " + c);

		// 이니셜 "Cheolsu" 맞으신가요?
		// 아니요 "Chulsu"입니다.
		// 혹시 "30"대 이신가요?
		// "23"살입니다.
		
	}

}
