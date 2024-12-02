package com.gn.practice;

public class Practice03 {
	public static void main(String[] args) {
		//출석이 1, 결석이 0
		// 출석한 학생수의 합을 계산해서 출력해주세요
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum = 0;
		for(int i =0;i<attend.length;i++) {
				sum += attend[i];
		} System.out.println("출석한 학생 수 : "+sum);
		
		int unAttend = attend.length-sum;
		System.out.println("결석한 학생 수 : "+unAttend);
	}

}
