package com.gn.homework02.view;

import java.util.Scanner;

import com.gn.homework02.controller.ChocolateController;
import com.gn.homework02.controller.GreenTeaController;

public class CakeMenu {
	// 필드
	Scanner sc = new Scanner(System.in);
	ChocolateController cc = new ChocolateController();
	GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		System.out.print("메뉴 번호 : ");
		
		String menu = sc.nextLine();
	}
	public void chocolateMenu() {
// 데이터를 ChocolateController(cc)의 bakeChocolateCake()의 매개변수로 보내 반환 값 출력
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cheery = sc.nextInt();
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		
		
	}
	public void greenTeaMenu() {
// 데이터를 GreenTeaController(gtc)의 bakeGreenTeaCake()의 매개변수로 보내 반환 값 출력		
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("녹차 파우더(g) : ");
		double powder = sc.nextDouble();
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
	
	
	
	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
