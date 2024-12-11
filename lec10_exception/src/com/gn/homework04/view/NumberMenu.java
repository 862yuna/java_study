//package com.gn.homework04.view;
//
//import java.util.Scanner;
//
//import com.gn.homework04.controller.NumberController;
//import com.gn.homework04.exception.NumRangeException;
//
//public class NumberMenu {
//	public void menu() {
//		// 사용자에게 두 정수 입력 받음
//		// NumberController의 checkDouble에 매개변수 넘겨줌
//		// 반환값 출력
//		// checkDouble() 메소드 호출부분을
//		// try~catch를 이용하여 예외처리
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("정수2 : ");
//		int num2 = sc.nextInt();
//		NumberController nc = new NumberController();
//		try {
//			nc.checkDouble(num1, num2);
//		} catch(NumRangeException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
//	
//}
