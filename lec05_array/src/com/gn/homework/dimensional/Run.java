package com.gn.homework.dimensional;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Practice practice = new Practice();
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 키순서대로 앉으세요.");
		System.out.println("2. 값 입력 받아 배열 만들기.");
		System.out.println("3. 올라갔다 내려갔다.");
		System.out.println("4. 로또 번호 자동 생성기.");
		System.out.println("5. 컴퓨터와 가위바위보.");
		System.out.println("6. 배열 늘리기.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 :
				practice.practice01();
				break;
			case 2 :
				practice.practice02();
				break;
			case 3 :
				practice.practice03();
				break;
			case 4 :
				practice.practice04();
				break;
			case 5 :
				practice.practice05();
				break;
			case 6 :
				practice.practice06();
				break;
			case 7 :
				practice.practice07();
				break;
			case 8 :
				practice.practice08();
				break;
		}
		sc.close();
	}

}
