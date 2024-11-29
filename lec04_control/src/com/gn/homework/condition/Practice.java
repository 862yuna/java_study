package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String cash = "";
		
		if(age<3) {
			cash = "무료입니다.";
		} else if(age<=12) {
			cash = "10000원입니다.";
		} else if(age<=18) {
			cash = "20000원입니다.";
		} else if(age<=64) {
			cash = "30000원입니다.";
		} else {
			cash = "무료입니다.";
		} 
		System.out.println("당신의 놀이동산 요금은 "+cash);
		sc.close();
	}
	
	public void practice02() {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int tem = sc.nextInt();
		
		String season = "";		
		String watch = "";
		if(month==1&&month==2&&month==12) {
			season = "겨울";
			if(tem<=-15) {
				watch = " 한파 경보";
			} else if(tem<=-12) {
				watch = " 한파 주의보";
			}
		} else if(3<=month&&month<=5) {
			season = "봄";
		} else if(6<=month&&month<=8) {
			season = "여름";
			if(tem>=35) {
				watch = " 폭염 경보";
			} else if(tem>=33) {
				watch = " 폭염 주의보";
			}
		} else if(9<=month&&month<=11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season + " " + watch);
		sc.close();
	}
	
	public void practice03() {
		System.out.println("=== 세개의 정수 비교하기 ===");
		
		
	}

}
