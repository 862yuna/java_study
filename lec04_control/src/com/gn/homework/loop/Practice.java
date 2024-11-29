package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(num = 1; num <=9; num++) {
			
		}
		sc.close();
	}
	
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String hello = sc.next();
		String text = "";
		for(int i =1; ;i++) {
			System.out.println(text);
		
			if(text == "탈출") {
				System.out.println(text+"프로그램 종료");
				
			}
		}
		
		
	}

}
