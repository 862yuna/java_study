package com.gn.homework;
import java.util.Scanner;
public class Homework04 {
	public static void main(String[] args) {
		// 합격 불합격 문제
		// 시험과목 5개, 각 과목의 점수 40점 이상이면서 전체평균 60점 이상 합격
		// 합격했을 경우 "축하합니다" 문구 출력
		// 불합격의 경우 불합격의 이유 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int scr1 = sc.nextInt();
		
		System.out.print("소프트웨어개발 점수: ");
		int scr2 = sc.nextInt();
		
		System.out.print("데이터베이스구축 점수: ");
		int scr3 = sc.nextInt();
		
		System.out.print("프로그래밍언어활용 점수: ");
		int scr4 = sc.nextInt();
		
		System.out.print("정보시스템구축관리 점수: ");
		int scr5 = sc.nextInt();
		
		String result = "";
		int sum = scr1+scr2+scr3+scr4+scr5;
		int avg = sum/5;
		
		String fail_subject = "";
		
		if(scr1>=40&&scr2>=40&&scr3>=40&&scr4>=40&&scr5>=40) {
			if(avg>=60) {
				System.out.println("합격을 축하합니다.");
			} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		} else {
			if(scr1 < 40) {
				fail_subject += "소프트웨어설계 과목 ";
			}
			if(scr2 < 40) {
				fail_subject += "소프트웨어개발 과목 ";
			}
			if(scr3 < 40) {
				fail_subject += "데이터베이스구축 과목 ";
			}
			if(scr4 < 40) {
				fail_subject += "프로그래밍언어활용 과목 ";
			}
			if(scr5 < 40) {
				fail_subject += "정보시스템구축관리 과목 ";
			}
			System.out.println(fail_subject + "과락으로 불합격입니다.");
		}
		
		
		
	}
		
}

