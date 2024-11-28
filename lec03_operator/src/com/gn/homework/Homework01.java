package com.gn.homework;
import java.util.Scanner;
public class Homework01 {
	public static void main(String[] args) {
		// 철수의 앵무새는 주인이 하는 말의 반대말만 한다.
		// "간다" -> "온다" 출력하고 그렇지 않은 경우 "간다"출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String talk = sc.next();
		
		String spk = (talk.equals("간다"))? "온다" : "간다" ;
		System.out.println("앵무새 : " + spk);
		

	}

}
