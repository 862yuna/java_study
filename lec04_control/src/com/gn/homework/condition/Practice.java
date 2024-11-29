package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String cash = "";
		
		if(age<3) {
			cash = "무료입니다.";
		} else if(age<=12) {
			cash = "10000원입니다.";
		} else if(age<=18) {
			cash = "20000원입니다.";
		} else if(age<=64) {
			cash = "30000원입니다.";
		} else {
			cash = "무료입니다.";
		} 
		System.out.println("당신의 놀이동산 요금은 "+cash);
		sc.close();
	}
	
	public void practice02() {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int tem = sc.nextInt();
		
		String season = "";		
		String watch = "";
		if(month==1&&month==2&&month==12) {
			season = "겨울";
			if(tem<=-15) {
				watch = " 한파 경보";
			} else if(tem<=-12) {
				watch = " 한파 주의보";
			}
		} else if(3<=month&&month<=5) {
			season = "봄";
		} else if(6<=month&&month<=8) {
			season = "여름";
			if(tem>=35) {
				watch = " 폭염 경보";
			} else if(tem>=33) {
				watch = " 폭염 주의보";
			}
		} else if(9<=month&&month<=11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season + " " + watch);
		sc.close();
	}
	
	public void practice03() {
		System.out.println("=== 세개의 정수 비교하기 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번쨰 정수 : ");
		int num3 = sc.nextInt();
		
		int min = num1<num2? (num1<num3? num1 : num3) : (num2<num3? num2 : num3); 
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
		sc.close();
	}
	
	public void practice04() {
		System.out.println("=== 철수네 공장 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		switch(code) {
			case 400 :
				System.out.println("잘못된 요청입니다.");
				break;
			case 404 :
				System.out.println("요청하신 서비스를 찾을 수 없습니다.");
				break;
			case 500 :
				System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
				break;
			case 503 :
				System.out.println("일시적인 서버 오류가 발생하였습니다.");
				break;
			default :
				System.out.println("알 수 없는 오류가 발생하였습니다.");
				break;
		} 
		sc.close();
	}
	
	public void practice05() {
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int routine = sc.nextInt();

		if(routine == 1) {
			System.out.println("스쿼트 운동 시간입니다.");
		} else if(routine==2) {
			System.out.println("데드리프트 운동 시간입니다.");
		} else if(routine ==3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		} else if(routine==4) {
			System.out.println("풀업 운동 시간입니다.");
		} else if(routine==5) {
			System.out.println("오늘도 수고하셨습니다.");
		} else if(0>routine||routine==0) {
			System.out.println("양수만 입력해주세요");
		} else {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice06() {
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어설계 점수 : ");
		int s1 = sc.nextInt();
		System.out.print("소프트웨어개발 점수 : ");
		int s2 = sc.nextInt();
		System.out.print("데이터베이스구축 점수 : ");
		int s3 = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수 : ");
		int s4 = sc.nextInt();
		System.out.print("정보시스템구축관리 점수 : ");
		int s5 = sc.nextInt();
		
		int sum = s1+s2+s3+s4+s5;
		int avg = sum/5;
		String subject = "";
		
		if(s1>=40&&s2>=40&&s3>=40&&s4>=40&&s5>=40) {
			if(avg>=60) {
				System.out.println("합격을 축하합니다!");
			} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		} else {
			if(s1<40) {
				subject = "소프트웨어설계";
			} 
			if(s2<40) {
				subject = "소프트웨어개발";
			}
			if(s3<40) {
				subject = "데이터베이스구축";
			}
			if(s4<40) {
				subject = "프로그래밍언어활용";
			}
			if(s5<40) {
				subject = "정보시스템구축관리";
			}
			System.out.println(subject + "과목 과락으로 불합격입니다.");
		}
		sc.close();
	}
	

}
