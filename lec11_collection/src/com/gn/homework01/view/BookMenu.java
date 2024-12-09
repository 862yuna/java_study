package com.gn.homework01.view;
// 2짱
import java.util.Scanner;

import com.gn.homework01.controller.BookController;
import com.gn.homework01.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
		System.out.println("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가"); // insertBook() 호출
		System.out.println("2. 도서 전체 조회"); // selectList() 호출
		System.out.println("3. 도서 검색 조회"); // searchBook() 호출
		System.out.println("4. 도서 삭제"); // deleteBook() 호출
		System.out.println("5. 도서 오름차순 정렬"); // ascBook() 호출
		System.out.println("9. 종료"); // "프로그램을 종료합니다." 출력 후 종료
		//숫자 입력받아 기능 수행
		// 1,2,3,4,5,9외의 숫자 입력하면->"잘못 입력하였습니다. 다시 입력해주세요." 출력
		while(true) {
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			
				switch(num) {
					case 1 :
						bc.insertBook(null);
						break;
					case 2 :
						bc.selectList();
						break;
					case 3 :
						bc.searchBook(null);
						break;
					case 4 :
						bc.deleteBook(null, null);
						break;
					case 5 : 
						bc.ascBook();
						break;
					case 9 : 
						System.out.println("프로그램을 종료합니다.");
						break;
					default :
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
						mainMenu();
				}	
			}
		
	}
	// 1. 새 도서 추가 view 메소드
	public void insertBook(String title,String author,int category,int price) {
		// 1. 도서명(String title)입력받기
		// 2. 저자명(String author)입력받기
		// 3. 장르(int category) 입력받기
		// 4. 가격(int price) 입력받기
		// 5. 매개변수 생성자를 이용하여 Book 객체 생성
		// 장르명 입력은 숫자, 객체 생성할때는 문자열로 넘기기
		// (1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타)
		// 6. BookController의 insert로Book객체 전달
		System.out.println("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String bookName = sc.nextLine();
		System.out.print("저자명 : ");
		String name = sc.nextLine();
		System.out.print("장르 : ");
		int type = sc.nextInt();
		System.out.print("가격 : ");
		int money = sc.nextInt();
		String result = "";
		if(type==1) {
			String genre1 = "인문";
			result = genre1;
			
		}else if(type==2) {
			String genre2 = "자연과학";
			result = genre2;
		}else if(type==3) {
			String genre3 = "어린이";
			result = genre3;
		}else {
			String genre4 = "기타";
			result = genre4;
		}
		Book b = new Book(bookName,name,result,money);
		bc.insertBook(b);
		
		
	}
	// 2. 도서 전체 조회 view 메소드
	public void selectList() {
		// 1.BookController의 selectList 메소드 호출
		// -> 결과값을 임의의 리스트 bookList 생성하여 대입
		// 2. 조건식 이용
		// 2-1. bookList가 비어있는 경우 -> "존재하는 도서가 없습니다." 문구 출력
		// 2-2. bookList가 비어있지 않은 경우
		// -> 반복문을 통해 bookList안의 Book객체들 출력
		
	}
	// 3. 도서 검색 조회 view 메소드
	public void searchBook() {
		// 1.검색할 도서명 키워드 입력 받기(String keyword)
		// 2.BookController의 searchBook 메소드로 위의 keyword전달
		// -> 결과 값을 임의의 리스트 searchList를 생성후 대입
		//-> 키워드가 완전한 도서명이 아니라 도서명의 일부 일 수 있고
		// 일부 키워드를 입력한 경우 해당 키워드를 포함하는 여러 개의 도서 조회됨
		// 단일 객체가 아니라 리스트로 조회
		// 3. 조건식 이용
		// 3-1.searchList가 비어 있는 경우 ->"검색 결과가 없습니다."라는 문구 출력
		// 3-2. searchList가 비어있지 않은 경우->반복문으로 searchList안의 Book객체 출력
	
	}
	// 4. 도서 삭제 view 메소드
	public void deleteBook() {
		// 1. 삭제할 도서명 입력 받기 (String title)
		// 2. 삭제할 저자명 입력 받기 (String author)
		//-> 같은 도서명을 가졌지만 저자명이 다른 경우
		// 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
		// 3. BookController의 deleteBook()메소드로 title,author전달
		// -> 결과값을 임의의Book(참조변수명 remove)객체에 대입
		// 4. 조건식 이용
		// 4-1. remove가 존재하는 경우-> "성공적으로 삭제되었습니다" 문구출력
		// 4-2.remove가 존재X경우 -> "삭제할 도서를 찾지 못했습니다."문구 출력
	}
	// 5. 도서 오름차순 정렬 view 메소드
	public void ascBook() {
		// 1.BookController의 ascBook()메소드 호출
		// 2. 메소드 호출 결과가 1이면 성공, 그 외 실패
		// 3. 성공시 "정렬에 성공하였습니다."출력 후 전체 목록 조회
		// 4. 실패시 "정렬에 실패하였습니다."출력
	}
	
}
