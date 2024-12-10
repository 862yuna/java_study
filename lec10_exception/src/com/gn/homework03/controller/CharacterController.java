package com.gn.homework03.controller;

import com.gn.homework03.exception.CharCheckException;

public class CharacterController {
	// 기본 생성자
	public CharacterController() {
		
	}
	// 매개변수로 들어온 값에 있는 영문자를 세어 반환
	// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고.
	public int countAlpha(String s) throws CharCheckException{
		char[] alphaArr = s.toCharArray();
		int count1 = 0;
		for(int i =0;i<alphaArr.length;i++) {
			if(alphaArr[i]==' ') {
				count1++;
			}
		}
		
		if(count1>0) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어있습니다.");
		} else {
			int count2 = 0;
			
			char[] arr = s.toCharArray();
			for(int i =0;i<arr.length;i++) {
				if(65<=arr[i]&&arr[i]<=90||97<=arr[i]&&arr[i]<=120) {
					count2++;
				}
			}
			return count2;
		}
	}
}
