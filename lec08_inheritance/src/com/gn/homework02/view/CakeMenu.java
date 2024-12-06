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
		System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
		System.out.println("1. 초콜릿 케이크(밀가루: 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
		System.out.println("2. 녹차 케이크(밀가루: 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
		System.out.println("9. 취소");
		System.out.print("메뉴 번호 : ");
		String menu = sc.nextLine();
	}
	public void chocolateMenu() {
// 데이터를 ChocolateController(cc)의 bakeChocolateCake()의 매개변수로 보내 반환 값 출력
		System.out.print("밀가루(g) : ");
		System.out.print("크림(g) : ");
		System.out.print("체리(개) : ");
		System.out.print("초콜릿 칩(개) : ");
		
		
	}
	public void greenTeaMenu() {
// 데이터를 GreenTeaController(gtc)의 bakeGreenTeaCake()의 매개변수로 보내 반환 값 출력		
		System.out.print("밀가루(g) : ");
		System.out.print("크림(g) : ");
		System.out.print("녹차 파우더(g) : ");
		System.out.print("치즈 큐브(개) : ");
	
	
	
	
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
