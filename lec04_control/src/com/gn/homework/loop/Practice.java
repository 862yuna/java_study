package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	
	public void practice02() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			i = sc.nextInt();
			if(i==0) {
				break;
			} else if(i>9) {
				System.out.println("9이하의 숫자를 입력해주세요");
			} 
			for(;i<=9;i++) {
				if(i<0) {
					System.out.println("양수만 입력해주세요.");
					break;
					}
				System.out.println("=== "+i+"단 ===");
				for(int j =1;j<=9;j++) {
					System.out.println(i+" * "+j+" = "+(i*j));	
					}
				}
			} 
			sc.close();
		}

	public void practice03() {
		for(int j =1; ;j++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String hello = sc.next();
			System.out.println(hello);

			if(hello.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
			sc.close();
		}
	}

	public void practice06() {
		for(int i=1;i<2;i++) {
			System.out.println(" "+" "+" "+" "+"*"+" "+" "+" "+" ");
			System.out.println(" "+" "+" "+"***"+" "+" "+" ");
			System.out.println(" "+" "+"*****"+" "+" ");
			System.out.println(" "+"*******"+" ");
			System.out.println("*********");
			if(i==2) {
				break;
			}
		}
	}
	
	public void practice07() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num<=0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for(int i=1;i<=num;i++) {
					if(i%2 != 0) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			}
		} 
		sc.close();
	}

}	