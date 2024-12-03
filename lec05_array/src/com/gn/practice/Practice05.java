package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores1 = {54, 23};
		int[] scores2 = new int[scores1.length+1];
		
		for(int i=0;i<scores2.length;i++) {
			scores2[i] = scores1[i];
		}
		scores2[2] = 81;
		for(int num : scores2) {
			
		}
		
	}
}
