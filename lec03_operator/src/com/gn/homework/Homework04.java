package com.gn.homework;
import java.util.Scanner;
public class Homework04 {
	public static void main(String[] args) {
		// 국어,수학,영어 각각 점수가 60점 이상이며 평균 90점이상
		// 3과목의 점수를 입력받기
		// 철수가 휴대폰을 바꿀 수 있는지 여부
		// 합계, 평균 성적을 출력하는 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int scr1 = sc.nextInt();
		System.out.print("수학 : ");
		int scr2 = sc.nextInt();
		System.out.print("영어 : ");
		int scr3 = sc.nextInt();
		
		int sum = scr1 + scr2 + scr3;
		System.out.println("합계 : " + sum + "점");
		
		int avg = sum/3;
		System.out.println("평균 : " + avg + "점");
		
		String result =
			(scr1>=60&&scr2>=60&&scr3>=60)?((avg>=90)?"휴대폰을 바꿀 수 있습니다.":"휴대폰을 바꿀 수 없습니다."):"휴대폰을 바꿀 수 없습니다.";

		System.out.println(result);
	}

}
