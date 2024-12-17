package com.gn.homework02;

public class Practice {
	public String takeState(String state) {
//		- 메소드명 : takeState
//		- 반환형 : String
//		- 매개변수 : String
		String result = null;
		String[] arr = state.split(" ");
		for(String city : arr) {
			int idx = city.indexOf("구");
			if(idx!=0&&city.length()-1==idx) {
				
				result = city;
			}
		}
		return result;
	}
}
