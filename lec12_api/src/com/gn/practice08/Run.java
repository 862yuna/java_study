package com.gn.practice08;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("강성관");
		students.add("곽도영");
		students.add("권용규");
		students.add("김태영");
		students.add("박수빈");
		students.add("박용환");
		students.add("양서원");
		students.add("이예준");
		students.add("전홍식");
		students.add("정재익");
		students.add("조윤아");
		students.add("조은성");
		students.add("최진수");
		students.add("황정현");
		//14명
		// 최소값 : 0, 최대값 : list.size()-1
		
		int num = (int)(Math.random()*students.size());
		System.out.println("오늘의 발표자 "+students.get(num)+"님!!");
	
	}

}
