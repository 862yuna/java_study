package com.gn.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		
//		int max = lemon.length()>mango.length()?
//				(lemon.length()>apple.length()?lemon.length():apple.length())
//				:(mango.length()>apple.length()?mango.length():apple.length());
//		
		Scanner sc = new Scanner(System.in);
//		List<String> fruit = new ArrayList<String>();
		String[] fruit = new String[3];
		System.out.print("문자열(1) : ");
		fruit[0] = sc.nextLine();
		System.out.print("문자열(2) : ");
		fruit[1] = sc.next();
		System.out.print("문자열(3) : ");
		fruit[2] = sc.next();
		
		String max = fruit[0];
		for(int i = 1;i<fruit.length;i++) {
			if(max.length()<fruit[i].length()) {
				max = fruit[i];
			}else if(max.length()==fruit[i].length()) {
				if(max.compareTo(fruit[i])<0) {
					max = fruit[i];
				}
			}
		}
		max = max.concat(max);
		System.out.println(max);
		
		
		
//		max = max.concat(max);
//		System.out.println(max);
		
		System.out.print("문자열(1) : ");
		String str1 = sc.next();
		sc.nextLine();
		System.out.print("문자열(2) : ");
		String str2 = sc.next();
		System.out.print("문자열(3) : ");
		String str3 = sc.next();
		String max2 = "";
		for(int i =0;i<str1.length();i++) {
			for(int j = 0;j<str2.length();j++) {
				for(int k = 0;k<str3.length();k++) {
					if(max2.length()<str1.length()) {
						max2=str1;
						str1=str2;
						str2=str3;
						str3=max2;
					}
				}
			}
		}
		
		max2 = max2.concat(max2);
		System.out.println(max2);
		
		
		
		
	}
}
