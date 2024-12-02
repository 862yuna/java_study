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
		for(int cm : height) {
			System.out.print(cm + ", ");
		}
	}
	
	public void practice02() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		int length = sc.nextInt();
//		int[] num = new int[length];
//		int sum = 0;
//		for(int i=0;i<length;i++) {
//			num[0] = length-1;
//			num[1] = length-9;
//			num[2] = length-2;
//			num[3] = length-8;
//			num[4] = length-3;
//			sum += i;
//		}
//		System.out.print("총 합 : "+sum);
//		sc.close();
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] su =new int[num];
			int su2 = num%2;
			if(su2==0||num<3) {
				System.out.println("다시 입력하세요.");
			}
			
			
		}
		
		
		
		
	}
	
	public void practice05() {
		
	}

}
