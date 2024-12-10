package com.gn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*50)+1;
//		System.out.println(random);
		try {
			while(true) {
				System.out.print("1~50사이의 숫자 : ");
				int num = sc.nextInt();
				
				if(num==random) {
					System.out.println("축하합니다~ 정답이에요");
					break;
				} else if(num<random) {
					System.out.println("Up!");
				} else if(num>random) {
					System.out.println("Down!");
				}
			}
		}catch(Exception e) {
			System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
