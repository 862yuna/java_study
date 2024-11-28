package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int checkNum = sc.nextInt();
		
		System.out.println("숫자 : " + checkNum);
		if(checkNum > 0) {
			System.out.println("양수입니다.");	
		}

	}

}
