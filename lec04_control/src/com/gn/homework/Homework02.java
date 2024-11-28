package com.gn.homework;

import java.util.Scanner;
public class Homework02 {
	public static void main(String[] args) {
		// 월과 기온 입력하면 계절, 주의보/경보 출력 프로그램
		// 겨울 : 12~2월,-15도 이하 한파경보, -12이하 한파주의보
		// 봄 :3~5월, 
		// 여름 :6~8월, 35도 이상 폭염경보,33도 이상 폭염 주의보
		// 가을 :9~11월
		// 1~12월 사이가 아닌 월을 입력시 해당하는 계절이 없다고 알림.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		System.out.print("기온 : ");
		int temperature = sc.nextInt();
		
		String season = "";
		String watch = "";
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			if(temperature <= -15) {
				watch = "한파 경보";				
			} else if(temperature <= -12) {
				watch = "한파 주의보";
			} 
		} else if(3 <= month && month <= 5) {
			season = "봄";
		} else if(6 <= month && month <= 8) {
			season = "여름";
			if(temperature >= 35) {
				watch = "폭염 경보";
			} else if(temperature >= 33) {
				watch = "폭염 주의보";
			}			
		} else if(9 <= month && month <= 11) {
			season = "가을";
		} else {
			season = "해당 하는 계절 없음";
		} System.out.println(season + " " + watch);
		
	}

}
