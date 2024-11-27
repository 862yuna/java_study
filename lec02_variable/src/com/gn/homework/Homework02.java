package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		double width = sc.nextDouble();
		System.out.println(width);
		
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		System.out.println(height);
	
		System.out.println("면적 : " + (width*height));
		System.out.println("둘레 : " + ((width+height)*2));
	}
}
