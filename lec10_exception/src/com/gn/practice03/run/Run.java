package com.gn.practice03.run;

import java.util.Scanner;

import com.gn.practice03.controller.LoginManager;
import com.gn.practice03.exception.InvalidCredentialsException;

public class Run {
	public static void main(String[] args) {
		
		LoginManager log = new LoginManager();
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		
		
		try {
			log.login(id, pwd);
//			System.out.println("성공적으로 로그인되었습니다.");
		} catch(InvalidCredentialsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
		
		
		
	}
}
