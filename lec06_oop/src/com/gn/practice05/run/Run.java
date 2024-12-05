package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;

// 1. 실행용 메소드
// 2. 기본 생성자와 매개변수가 3개인 생성자,
// 매개변수 5개인 생성자를 통해 각각의 객체 생성
// 3. information() 메소드를 통해 초기화한 정보 출력
public class Run {
	// +main(args:String[]):void
	public static void main(String[] args) {
		
		// 기본 생성자 -> 객체 생성
		Book b1 = new Book();
		
		// 매개변수 3개 생성자 -> 객체 생성
		Book b2 = new Book("홍길동전",5000,"허균");
		
		// 매개변수 5개 생성자 -> 객체 생성
		Book b3 = new Book("채소 과일 레시피","터치아트","박경희",19300,0.1);
		
		b1.information();
		b2.information();
		b3.information();

	}
}
