package com.gn.practice02;

public class Practice {
	// 메소드명 : printStrLength
	// 매개변수 : 참조형 변수 -> String
	public void printStrLength(String str) {
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.print("NullPointerException 발생 : ");
//			e.printStackTrace();
//			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
