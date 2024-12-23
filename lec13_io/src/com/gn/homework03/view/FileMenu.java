package com.gn.homework03.view;

import java.util.Scanner;
import com.gn.homework03.controller.FileController;
// FileController 호출
public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
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
			int num = sc.nextInt();
			switch(num) {
				case 1 : fileSave(); break;
				case 2 : fileOpen(); break;
				case 3 : fileEdit(); break;
				case 9 : System.out.println("프로그램을 종료합니다.");
						sc.close();
						break;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					mainMenu();
					break;
			}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		while(true) {
			// 파일에 저장할 내용을 입력하세요. 
			System.out.println("파일에 저장할 내용을 입력하세요");
			// ex끝it  이라고 입력하면 종료됩니다. 
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			// 내용 :  
			System.out.print("내용 : ");
			String save = sc.nextLine();
//			sc.nextLine();
			// "ex끝it"를 입력할 때까지 사용자가 입력하게 하고 
			if(save.equals("ex끝it")) {
				break;
			}else {
				sb.append(save+"\n");
			}
		}
	// 그 값들을 StringBuilder에 저장 
		String answer = "";
		// 저장할 파일 명을 입력해주세요(ex. myFile.txt) :  
		while(true) {
			// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면 
			// "이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)"가 출력됨 
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.next();
			
			if(fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				answer = sc.next();
				sc.nextLine();
				if(answer.equals("y")) {
					// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 
					// StringBuilder 넘김 
					System.out.println(sb.toString());
					fc.fileSave(fileName, sb);
					break;
				}else if(answer.equals("n")) {
					// n를 입력하면 "저장할 파일 명을 입력해주세요 ~"가 다시 나오게끔 반복 
				}	
//				} else if(fc.checkName(fileName)==false) {
//						// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면  
//						// 파일 명과 내용을 fc에 fileSave 메소드로 넘김 	
//						fc.fileSave(fileName, sb);
//						break;
//				}
			}else {
				fc.fileSave(fileName, sb);
				break;
			}
		}
		mainMenu();
	}
	public void fileOpen() {
	// 열 파일 명 : 
		System.out.print("열 파일 명 : ");
		String fileName = sc.next();
	// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		if(fc.checkName(fileName)==true) {
			// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 
			// 반환 값 출력 
			System.out.println(fc.fileOpen(fileName));
		}else {
			// 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 	
			System.out.println("없는 파일입니다.");
			mainMenu();
		}
		mainMenu();
	}
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
	// 수정할 파일 명 : 
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.next();
		sc.nextLine();
	// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		if(fc.checkName(fileName)==false) {
			// 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
			System.out.println("없는 파일입니다.");
			mainMenu();
		}else {
			// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String text = sc.nextLine();
//				System.out.println(text);
				if(text.equals("ex끝it")) {
					break;
				}
				sb.append(text).append("\n");
			}
			fc.fileEdit(fileName, sb);
			mainMenu();
		}
		
	}
	
	
}
