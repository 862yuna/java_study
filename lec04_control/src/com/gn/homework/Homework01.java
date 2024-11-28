package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		// 놀이동산 요금 : 5개의 연령으로 나누어서 부여
		// 3살 미만 : 무료, 3~12세 : 10,000원
		// 13~18세 : 20,000원, 19~64세 : 30,000원
		// 65세 이상 : 무료
		// 나이를 입력하면 요금을 출력하는 시스템 만들기
		// if ~ else if ~ else문 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age < 3) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		} else if(age <= 12) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다");
		} else if(age <= 18) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다");
		} else if(age <= 64) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다");
		} else {
			System.out.println("당신의 놀이동산 요금은 무료입니다");
		}

	}

}
