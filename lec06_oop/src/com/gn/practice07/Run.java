package com.gn.practice07;

public class Run {
	public static void main(String[] args) {
		
		Suppliment[] arr = {new Suppliment("유산균",1,18000),
				new Suppliment("비타민B",1,15000),
				new Suppliment("루테인",2,20000),
				new Suppliment("비타민D",1,12000)}; 
		
		
		System.out.println("======= 영양제 목록 =========");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("이름 : "+arr[i].name+", 복용량 : "+arr[i].dose+"알"
//					+", 가격 : "+arr[i].price+"원");
//		}
		
		for(Suppliment sup : arr) {
			sup.infomation();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
