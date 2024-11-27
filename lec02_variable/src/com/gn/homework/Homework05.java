package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int score1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int score2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int score3 = sc.nextInt();
		
		int sum = score1 + score2 + score3;
		System.out.println("총점 : " + sum);
		int average = sum/3;
		System.out.println("평균 : " + average);
	}

}
