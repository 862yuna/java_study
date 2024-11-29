package com.gn.study;

public class LoopStmt {

	public static void main(String[] args) {
		// 1. for문
		// 1 ~ 10 까지 숫자 모두 출력
		// 초기식 -> 출발점(1)
		// 조건식 -> 도착점(10)
		// 증감식 -> step(몇 걸음씩)
		// for(초기식; 조건식; 증감식) {}
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		// 2. 초기식 생략 -> 초기식이 어딘가엔 선언 되어있어야 가능.
		int a = 1;
		for(; a <= 5; a++) {
			System.out.println(a);
		}
		
		// 무한루프 -> 멈추려면 콘솔창에 네모모양 터미널아이콘(급하면)
		// 3. 조건식 생략
		for(int i = 1; ; i++) {
			System.out.println(i);
			if(i >= 10) {
				break;
			}
		}
		
//		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		
		// 4. 중첩 for문
		// i는 1~2 까지 하나씩 커지면서 반복
		// j는 1~3 까지 하나씩 커지면서 반복
		for (int i = 1; i <= 2 ; i++) {
//			System.out.println("A");
			for(int j = 1 ; j <= 3 ; j++) {
//				System.out.println("B");
			}
//			System.out.println("C");
		}
		
		// 5. 중첩 for문 활용
		// ****
		// ****
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		// 6. break를 사용한 중첩 for문
		// 외부 : 0에서 부터 2 미만(=제외) 1씩 커지면서 반복
		// 내부 : 0에서 부터 3 미만 1씩 커지면서 반복
		for(int i = 0; i < 2; i++) {
			System.out.print("1 ");
			// break;
			for(int j = 0; j < 3; j++) {
				System.out.print("2 ");
				// break;
			}
			System.out.print("3\n");
			// break;
		}
		
		// 7. while문
		int start = 1;
//		while(start <= 10) {
//			System.out.println(start);
//			start++;
//		}
		while(true) {
			System.out.println(start);
			start++;
			if(start > 10) {
				break;
			}
		}
		
		
	}
}
