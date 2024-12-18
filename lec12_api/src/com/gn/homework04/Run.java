package com.gn.homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		while(true) {
			System.out.print("문자열 : ");
			String text = sc.next();
			sc.nextLine();
			String answer = text.toUpperCase();
			if(answer.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				result += text;
			}
		}
		System.out.println("최종 문자열 : "+result);
		sc.close();
	}

}
