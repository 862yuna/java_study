package com.gn.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		int[] ages = {20,18,22,19,21};
		int max = ages[0];
		for(int i = 0; i<ages.length;i++) {
			if(max<ages[i]) {
				max = ages[i];
			}
		} System.out.println("가장 나이가 많은 학생의 나이 : "+max);
		int min = ages[0];
		for(int i=0;i<ages.length;i++) {
			if(min>ages[i]) {
				min = ages[i];
			}
		} System.out.println("가장 어린 학생의 나이 : "+min);
		
//		int[] age = new int[5];
//		Scanner sc = new Scanner(System.in);
//		int max2 = age[0];
//		for(int i = 0; i<age.length;i++) {
//		
//			age[i] = sc.nextInt();
//			if(max2<age[i]) {
//				max2 = ages[i];
//			}
//		}
//		System.out.println("가장 나이가 많은 학생의 나이 : "+max);
		
		
		
		
	}
}
