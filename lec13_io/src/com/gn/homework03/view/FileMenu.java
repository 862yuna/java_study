package com.gn.homework03.view;

import java.util.Scanner;
import com.gn.homework03.controller.FileController;
// FileController 호출
public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		int num = 0;
		while(num!=9) {
			System.out.println("***** My Note *****");
//	 1. 노트 새로 만들기  -> fileSave() 
			System.out.println("1. 노트 새로 만들기");
//	 2. 노트 열기  -> fileOpen() 
			System.out.println("2. 노트 열기");
//	 3. 노트 열어서 수정하기 -> fileEdit() 
			System.out.println("3. 노트 열어서 수정하기");
//	 9. 끝내기  ->  “프로그램을 종료합니다.” 출력 후 종료 
			System.out.println("9. 끝내기");
//	 메뉴 번호 :  
			System.out.print("메뉴 번호 : ");
// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복 
			num = sc.nextInt();
			switch(num) {
				case 1 : fileSave(); break;
				case 2 : fileOpen(); break;
				case 3 : fileEdit(); break;
				case 9 : System.out.println("프로그램을 종료합니다.");
						break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
			}
		}
	}
	public void fileSave() {
		while(true) {
			// 파일에 저장할 내용을 입력하세요. 
			System.out.println("파일에 저장할 내용을 입력하세요");
			// ex끝it  이라고 입력하면 종료됩니다. 
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			// 내용 :  
			System.out.print("내용 : ");
			String save = sc.nextLine();
			// "ex끝it"를 입력할 때까지 사용자가 입력하게 하고 
			if(save.equals("ex끝it")) {
				break;
			}
		}
	// 그 값들을 StringBuilder에 저장 
		StringBuilder sb = new StringBuilder();
	// 저장할 파일 명을 입력해주세요(ex. myFile.txt) :  
	// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면 
	// "이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)"가 출력됨 
	// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 
	// StringBuilder 넘김 
	// n를 입력하면 "저장할 파일 명을 입력해주세요 ~"가 다시 나오게끔 반복 
	// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면  
	// 파일 명과 내용을 fc에 fileSave 메소드로 넘김 	
	}
	public void fileOpen() {
	// 열 파일 명 : 
	// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
	// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 
	// 반환 값 출력 
	// 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 	
	}
	public void fileEdit() {
	// 수정할 파일 명 : 
	// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
	// 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
	// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
	// ex끝it를 입력하면 반복문 종료 후
	//fc의 fileEdit()에 파일 명과 StringBuilder 전달 	
	}
	
	
}
