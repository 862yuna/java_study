package com.gn.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence
		= "the quick brown fox jumps over the lazy dog";	
		
	Scanner sc = new Scanner(System.in);
	System.out.print("문자열을 입력 해주세요 : ");
	String text = sc.nextLine();
	if(sentence.contains(text)) {
		System.out.println(text);
	} else {
		System.out.println("존재하지 않는 단어입니다.");
	}
	
//	if(sentence.indexOf(text) != -1) {
//		System.out.println(text);
//	}else {
//		System.out.println("존재하지 않는 단어입니다.");
//	}
	
//	String[] arr = sentence.split(" ");
//	boolean result = false;
//	for(String a : arr) {
//		if(text.equals(a)) {
////			System.out.println(text);
//			result = true;
//		}else {
////			System.out.println("존재하지 않는 단어입니다.");
//		}
//	}
//	if(result ==true) {
//		System.out.println(text);
//	}else {
//		System.out.println("존재하지 않는 단어입니다.");
//	}
	
	
	
	
//	심화문제
//	단어가 존재하면 해당 단어 뒤에 오는 단어를 출력합니다.
//	만약 입력된 단어가 마지막 단어라면, “마지막 단어입니다.”라고 출력하세요.
//	단어가 존재하지 않으면	“존재하지 않는 단어입니다.”라고 출력하세요.
	System.out.print("단어를 입력하세요 : ");
	String str = sc.next();
	if(sentence.contains(str)) {
		String[] strArr = sentence.split(str);
	}
	
	
	
	
	
	}
		
		
}

