package com.gn.homework;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		// 구슬의 개수를 키보드로 입력받기
		// 구슬의 개수가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int num = sc.nextInt();
		
		String su = (num%2==0)? "구슬의 개수는 홀수입니다." : "구슬의 개수는 홀수입니다.";
		
		System.out.println(su);

	}

}
