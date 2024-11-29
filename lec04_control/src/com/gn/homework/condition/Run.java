package com.gn.homework.condition;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Practice practice = new Practice();
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
		}

	}

}
