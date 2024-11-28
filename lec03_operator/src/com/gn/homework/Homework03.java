package com.gn.homework;
import java.util.Scanner;
public class Homework03 {
	public static void main(String[] args) {
		// 매일 친구의 수가 달라지는 철수
		// 사탕을 몇 개 살 수 있는지도 알 수 없음
		// 철수의 친구 수 , 구입한 사탕 개수 입력
		// 한명당 최대 몇개의 사탕을 나눠줄 수 있고
		// 남는 사탕의 개수는 몇개인지 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수 : ");
		int friends = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int candy = sc.nextInt();
		// 사탕 나누기 친구.
		int x = candy/friends;
		int y = candy%friends;
		
		System.out.println("1인당 사탕 개수 : " + x + "개");
		System.out.println("남는 사탕 개수 : " + y + "개");
		

		
		
		
		
		
		
	}

}
