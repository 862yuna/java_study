//package com.gn.homework04.controller;
//
//public class NumberController {
//	public NumberController() {
//		
//	}
//	// 매개변수로 들어온 두 값이 1~100 사이일때
//	// num1 이 num2의 배수이면 true
//	// num1 이 num2 의 배수가 아니라면 false반환
//	// 1~100사이의 숫자가 아니라면
//	// NumRangeException 발생
//	// 에러 메세지는 출력 값 참고
//	public boolean checkDouble(int num1,int num2) throws NumRangeException{
//		
//		boolean result = true;
//		if(1<num1||num1>100||1<num2||num2>100) {
//			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
//		} else {
//			if(num1/num2==0) {
//				result = "true";
//			}else {
//				result = "false";
//			}
//		}
//			System.out.println(result);
//		
//	}
//}
