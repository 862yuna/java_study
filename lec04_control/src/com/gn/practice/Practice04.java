package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// ctrl + shift + 'o' -> 자동으로 import 해줌
		Scanner sc = new Scanner(System.in);
		System.out.print("조명의 밝기를 입력하세요 (0~3) : ");
		int light = sc.nextInt();
		
//		String text = "";
//		text += "현재 조명의 밝기 : ";
//		switch(light) {
//			case 0 :
//				text += "조명을 끕니다."; break;
//			case 1 :
//				text += "어두운 조명입니다."; break;
//			case 2 : 
//				text += "밝은 조명입니다."; break;
//			case 3 :
//				text += "매우 밝은 조명입니다."; break;
//			default :
//				text += "올바른 입력이 아닙니다."; break;
//		}	
//		System.out.println(text);
		
		switch(light) {
			case 0 :
				System.out.println("현재 조명의 밝기 : 조명을 끕니다.");
				break;
			case 1 :
				System.out.println("현재 조명의 밝기 : 어두운 조명입니다.");
				break;
			case 2 :
				System.out.println("현재 조명의 밝기 : 밝은 조명입니다.");
				break;
			case 3 :
				System.out.println("현재 조명의 밝기 : 매우 밝은 조명입니다.");
				break;
			default :
				System.out.println("올바른 입력이 아닙니다.");
				break;
		}

	}

}