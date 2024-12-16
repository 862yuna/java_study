package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
//		String[] dst = new String[str.length()/3];
//		System.arraycopy(str, 0, dst, 0, dst.length);
//		Person[] p = str.split("\n");
		
		String people = str.substring(str.indexOf("구,")+1);
		System.out.println(people);
		
	}
}
