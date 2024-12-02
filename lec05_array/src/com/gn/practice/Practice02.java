package com.gn.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		int[] numbers = {-62,107,-12,89,-35};
		for(int num : numbers) {
			if(num>50) {
				System.out.println(num);
			}
			// if(num<=50) {
			//		continue;
			// }
			// System.out.println(num);
		}
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i]>50) {
				System.out.println(numbers[i]);
			}
		}
		
		int[] numbers2 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<numbers2.length;i++) {
			System.out.print("숫자"+(i+1)+" : ");
			numbers2[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0;i<numbers2.length;i++) {
			if(numbers2[i] >= 50) {
				System.out.println(numbers2[i]);
			}
		}
	}

}
