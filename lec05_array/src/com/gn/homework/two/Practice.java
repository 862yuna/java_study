package com.gn.homework.two;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[][] arr = new int[4][4];
		int num = arr.length*arr[0].length;
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j]+" ");
			} 
			System.out.print("\n");
		}
		
	}
	public void practice02() {
		int[][] arr = new int[4][4];
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				int random = (int)(Math.random()*10)+1; //0-49
				arr[i][j] = random;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("행 : ");
			int num1 = sc.nextInt();
			System.out.print("열 : ");
			int num2 = sc.nextInt();
			
			int[][] arr = new int[num1][num2];
			
			if(0==num1||num1>10||0==num2||num2>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				for(int i =0;i<num1;i++) {
					for(int j=0;j<num2;j++) {
						int random = (int)(Math.random()*26)+65;
						arr[i][j] = (char)random;
						System.out.print(arr[i][j]+ " ");
					}
					System.out.print("\n");
				}
			}
			
		}
		
//		int random = (int)(Math.random()*26)+65;
//		char alphabet = (char)random;
//		arr[i][j] = alphabet;
//		System.out.print(arr[i][j]+" ");
		
		
		
		
		
		
		
	}
	public void practice04() {
		
	}
	public void practice05() {
		
	}
	public void practice06() {
		
	}
	public void practice07() {
		
	}
	public void practice08() {
		
	}
}
