package com.gn.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 : ");
		String text = sc.nextLine();
		
		if(sentence.contains(text)) {
			
			
			
			
			
//			System.out.println(text);
		} else {
			System.out.println("존재하지 않는 단어입니다.");
		}
		
		
		
		
		
		
	}
}
