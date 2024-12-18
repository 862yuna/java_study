package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
	public static void main(String[] args) {
		
	File dir = new File("C:\\test\\sub");	
//	if(!dir.exists()) {
//		if(dir.mkdirs()) {
//			System.out.println("디렉토리 생성 성공");
//		}else {
//			System.out.println("디렉토리 생성 실패");
//		}
//	}else {
//		System.out.println("이미 존재하는 디렉토리");
//	}
	
//	LocalDate today = LocalDate.now();
//	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
//	String year = today.format(dtf);
//	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM");
//	String month = today.format(dtf2);
//	DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd");
//	String day = today.format(dtf3);
//	File date = new File("C:\\test\\sub\\"+year+"\\"+month+"\\"+day);

	//	if(!date.exists()) {
//		if(date.mkdirs()) {
//			System.out.println("디렉토리 생성 성공");
//		}else {
//			System.out.println("디렉토리 생성 실패");
//		}
//	}else {
//		System.out.println("이미 존재하는 디렉토리");
//	}
	Practice p = new Practice();
	p.deleteFile(dir);
	
	
	
	
	}

}
