package com.gn.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일 입력 : ");
		String mail = sc.nextLine();
		
		mail = mail.replace(" ", "");
		String result = mail.substring(mail.indexOf("@")+1);
		String id = mail.substring(0, mail.indexOf("@")).toUpperCase();
		
		if(!result.equals("goodee.co.kr")) {
			System.out.println("유효하지 않은 이메일입니다.");
		} else {
			System.out.println("아이디 : "+id);
		}
		sc.close();
	}

}
