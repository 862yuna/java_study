package com.gn.homework10.view;

import java.util.Scanner;

import com.gn.homework10.controller.BuilderController;
// BuilderController 호출
public class BuilderMenu {
	// 스캐너(sc) 객체화
	private Scanner sc = new Scanner(System.in);
	// BuilderController(bc) 객체화
	private BuilderController bc = new BuilderController();

	public void mainMenu() {
	// 메뉴 번호 입력 받기
	// 1. 지정 문자열 사용 -> builderMenu()
	// 2. 입력 문자열 사용 -> inputMenu()
	// 3. 프로그램 끝내기 -> "프로그램을 종료합니다." 출력 후 종료
	// 잘못 입력하면 "잘못 입력하셨습니다. 다시 입력해주세요" 출력 후 반복
		int num = 0;
		while(num!=9) {
			System.out.println("===================");
			System.out.println("1. 지정 문자열 사용");
			System.out.println("2. 입력 문자열 사용");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			System.out.println("===================");
			switch(num) {
			 	case 1 : builderMenu(); break;
			 	case 2 : inputMenu(); break;
			 	case 9 : System.out.println("프로그램을 종료합니다.");
			 	 		break;
			 	default :
			 		System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
	}
	public void builderMenu() {
	// BuilderController()의 afterReplace() 반환값 활용
		String str = "J a v a P r o g r a m ";
		String str2 = bc.afterReplace(str);
	// 다음의 3가지 출력
		System.out.println("띄어쓰기 제거 전 : "+str);
	// 1. 띄어쓰기 제거 처리 후 글자
		System.out.println("띄어쓰기 제거 후 : "+str2);
	// 2. 띄어쓰기 제거 처리 후 글자 개수
		int length = str2.length();
		System.out.println("띄어쓰기 제거 후 글자수 : "+length);
	// 3. 결과를 모두 대문자로 변환 한 것
		String upText = str2.toUpperCase();
		System.out.println("대문자로 변환 : "+upText);
		
	}
	public void inputMenu() {
	// 1. 문자열 입력 받기
		System.out.print("문자열 입력 : ");
		String text = sc.next();
	// bc의 firstCap()으로 입력받은 문자열 넘기고 반환값 출력
		String text2 = bc.firstCap(text);
		System.out.println(text2);
	// 2. 문자 개수 찾기
	// bc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자 넘기기
	// 반환값 출력	
		System.out.print("문자 입력 : ");
		String text3 = sc.next();
		char one = text3.charAt(0);
		int count = bc.findChar(text2, one);
		System.out.println(count);
		
	}
		
	
	
	
	
	
}
