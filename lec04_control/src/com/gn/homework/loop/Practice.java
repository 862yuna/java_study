package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int num = 0;
		System.out.print("정수(1~50) : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int sum = 0;
		while(true) {
			if(1<=num&&num<=50) {
				for(int i=1;i<=num;i++) {
					int evenNumber = i%2;
					if(evenNumber==0) {
						sum += i;
					} 
				} 
				System.out.println("합계 : "+sum);
				sc.close();
				break;
			} else {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				System.out.print("정수(1~50) : ");
				num = sc.nextInt();
			}
			

		}
	}
	
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
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 실행합니다!");
		System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
		String answer = sc.nextLine();
		
		do {
			System.out.println("게임을 실행합니다!");
		} while(answer.equals("yes")); 
		if(answer.equals("no")) {
			System.out.println("게임을 종료합니다.");
		}
		
	}
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			num = sc.nextInt();
			if(num==0) {
				break;
			} else if(num>0) {
				sum += num;
			}
		}
		System.out.println("양수의 합계 : "+sum);
		sc.close();
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
	
	public void practice08() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("\n문자 : ");
		String text = sc.nextLine();
		
		int sum = 0;
		for(int i =0;i<str.length();i++) {
			
			if(text.charAt(0)==str.charAt(i)) {
				
				
			}
		}
	}

}	