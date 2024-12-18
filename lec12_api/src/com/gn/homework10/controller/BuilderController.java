package com.gn.homework10.controller;

public class BuilderController {
	public BuilderController() {
		// 기본 생성자
	}
	public String afterReplace(String str) {
		// 1. 매개변수 String 받아옴
		// 2. 띄어쓰기를 없앤 문자열 반환
//		String result = str.trim();
//		result = result.replace(" ", "");
//		return result;
//		int idx = str.indexOf(" ");
//		str.deleteCharAt(idx);
		// String str = "J a v a P r o g r a m ";
		StringBuilder sb = new StringBuilder(str);
		while(sb.indexOf(" ")!=-1) {
			int idx = sb.indexOf(" ");
			sb.deleteCharAt(idx);
		}
		return sb.toString();
		
	}
	
	public String firstCap(String input) {
		// 1. 매개변수로 String 받아오기
		// 2. 첫글자만 대문자로 바꾼 문자열 반환
		StringBuilder sb = new StringBuilder(input);
//		String result = sb.toUpperCase();
//		String result = input.substring(0,1).toUpperCase();
		String result = "";
		result += input.substring(0,1).toUpperCase();
		result += input.substring(1);
		return result;
	}

	public int findChar(String input,char one) {
		// 1. 매개변수로 String 과 char 받아오기
		// 2. String 에 char가 몇개 있는지 반환
		StringBuilder sb = new StringBuilder(input);
		String oneStr = String.valueOf(one);
		int count = 0;
		while(sb.indexOf(oneStr)!= -1) {
			int idx = sb.indexOf(oneStr);
			sb.deleteCharAt(idx);
			count++;
		}
		return count;
	}
}
