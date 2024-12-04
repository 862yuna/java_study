package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[] height = {152,180,165,158,171};
		for(int i = 0;i<height.length-1;i++) {
			for(int j =i+1;j<height.length;j++) {
				if(height[i]>height[j]) {
					int ascend = height[i];
					height[i] = height[j];
					height[j] = ascend;
				}
			}
		}
		int count = 0;
		for(int cm : height) {
			System.out.print(cm);
			count++;
			if(count==5) {
				continue;
			}
			System.out.print(", ");
		}
	}
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int[] number = new int[length];
		int num = 0;
		int sum = 0;
		for(int i=0;i<length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.print("총 합 : "+sum);
		sc.close();
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] su = new int[0];
			if(num<0) {
				System.out.println("다시 입력하세요.");
			 
				
			}
			
			
		}
	}
	
	public void practice04() {
		
	}
	
	public void practice05() {
		String[] choice = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위바위보");
			String text = sc.nextLine();
			if(text.equals("가위")) {
				for(int i =0;i<choice.length;i++) {
					
				}
			}
		}
		
	}
	
	
	public void practice06() {
		
	}
	
	public void practice07() {
		
	}
	
	public void practice08() {
		
	}

}
