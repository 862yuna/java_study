package com.gn.study;

public class DimensionalArray {
	public static void main(String[] args) {
		int score1 = 85;
		int score2 = 90;
		int score3 = 78;
		int score4 = 92;
		int score5 = 88;
		// 자료형[] 배열명; 또는 자료형 배열명[];
 		int[] scores = {85,90,78,92,88};
 		
 		// 1. 배열의 선언
 		int[] intArr;
 		String[] strArr;
 		
 		// 2. 배열의 생성
 		int[] nums; // 배열 선언
 		nums = new int[4]; // 배열 생성
 		
 		int[] heights = new int[10]; // 배열의 선언과 생성 동시에하기.
 		
 		// 3. 배열의 길이(인덱스)
 		System.out.println(heights.length);
 		
 		// 4. 배열의 초기화(default)
 		System.out.println(heights[2]);
 		
 		// 5.배열의 초기화(값 변경)
 		// (1) 인덱스 활용
 		int[] age1 = new int[3];
 		age1[0] = 40;
 		age1[1] = 20;
 		age1[2] = 70;
 		System.out.println("===========================");

 		// (2) for문 활용 : 규칙이 있는 경우
 		int[] age2 = new int[3];
 		for(int i = 0 ; i < age2.length ; i++) {
 			age2[i] = i+10;
 		}
 		
 		// (3) 선언과 동시에 초기화
 		// 선언 -> 생성 -> 초기화
 		int[] age3 = new int[] {1,2,3,4};
 		int[] age4 = {5,6,7};
 		// 아래 방법 불가능!!!
// 		int[] element;
// 		element = {9,10,11}; 
// 		선언과 동시에 초기화는 가능. but 선언 따로 초기화 따로는 X 생성해야함
 		
 		// 6. 배열의 저장과정
 		// (1) 선언 : Stack에 score라는 이름의 저장공간 마련
 		int[] score;
 		// (2) 생성 : Heap에 기차가 생김, Stack에 기차의 주소값 저장
 		score = new int[4];
 		// (3) 초기화 : Heap의 값 변경
 		score[0] = 90;
 		
 		// 7. 배열의 출력
 		// (1) 인덱스를 이용한 출력
 		System.out.println(age1[1]);
 		System.out.println("===========================");
 		// (2) 반복문을 이용한 출력
 		String[] friuts = {"딸기","체리","포도"};
 		for(int i =0; i<friuts.length;i++) {
 			System.out.println(friuts[i]);
 		}
 		System.out.println("===========================");
 		// 8. toCharArray
 		String text = "Hello World";
 		char[] charArr = text.toCharArray();
 		for(int i = 0; i<charArr.length;i++) { 
 			System.out.println(charArr[i]);
 		}
 		// vs charAt(i)
 		text = "안녕하세요.";
 		for(int i = 0; i<text.length();i++) {
 			System.out.println(text.charAt(i));
 		}
 		System.out.println("===========================");
 		// 9. for each문 (향상된 for문)
 		int[] numbers = {1,2,3,4,5};
 		for(int i =0; i<numbers.length;i++) {
 			System.out.println(numbers[i]);
 		}
 		for(int num : numbers) { //코드는 간결해지지만 인덱스 사용 불가.
 			System.out.println(num);
 		}
 		System.out.println("===========================");
 		// 10. 배열의 활용 (1) - 총합과 평균
 		int[] sus = {83,90,100,100,50}; // 423 / 5 = 84.6
 		int sum = 0;
 		for(int su : sus) {
 			sum += su;
 		}
 		System.out.println(sum);
 		System.out.println((double)sum/5);
 		System.out.println("===========================");
 		// 11. 배열의 활용(2) - 최대값과 최소값
 		int[] arr = {8,9,10,4,2};
 		// 최대값
 		int max = arr[0];
 		for(int i =0; i < arr.length; i++) {
 			if(arr[i] > max) {
 				max = arr[i];
 			}
 		} System.out.println("최대값 : "+max);
 		
 		// 최소값
 		int min = arr[0];
 		for(int i =0; i<arr.length;i++) {
 			if(arr[i]<min) {
 				min = arr[i];
 			}
 		} System.out.println("최소값 : "+min);
 		System.out.println("===========================");
 		// 12. 배열의 활용(3) : 오름차순, 내림차순
 		int[] data = {8,4,1,3};
 		// 인덱스 기준 : 0번과 1번 비교 -> 4,8,1,3
 		// 인덱스 기준 : 0번과 2번 비교 -> 1,8,4,3
 		// 0번과 3번 비교 -> 1,8,4,3
 		// 1번과 2번 비교 -> 1,4,8,3
 		// 1번과 3번 비교 -> 1,3,8,4
 		// 2번과 3번 비교 -> 1,3,4,8
 		
 		// 0 -> 1,2,3
 		// 1 -> 2,3
 		// 2 -> 3
 		
 		for(int i = 0; i<data.length-1;i++) {
 			for(int j = i+1; j<data.length; j++) {
// 				System.out.println(i+" : "+j);
 				if(data[i] > data[j]) {
 					int temp = data[i];
 					data[i] = data[j];
 					data[j] = temp;
 				}
 			}
 		}
 		for(int d : data) {
 			System.out.print(d+", ");
 		}
 		// 1,3,4,8
 		// 0번 vs 1번 : 3,1,4,8
 		// 0번 vs 2번 : 4,1,3,8
 		// 0번 vs 3번 : 8,1,3,4
 		// 1번 vs 2번 : 8,3,1,4
 		// 1번 vs 3번 : 8,4,1,3
 		// 2번 vs 3번 : 8,4,3,1
 		for(int i=0;i<data.length-1;i++) {
 			for(int j = i+1;j<data.length;j++) {
 				if(data[i]<data[j]) {
 					int descend = data[i];
 					data[i] = data[j];
 					data[j] = descend;
 				}
 			}
 		}
 		System.out.println();
 		for(int d : data) {
 			System.out.print(d+", ");
 		}
 		System.out.println();
 		System.out.println("===========================");
 		// 13. 배열의 복사
 		// - 배열은 한번 생성되면 길이 변경 불가능
 		// - 더 많은 저장 공간 필요시
 		// - 기존의 배열보다 더 큰 배열 생성
 		// - 이전 배열이 가진 내용 복사
 		
 		// 배열 복사의 2가지 방법 - (1) 얕은 복사
 		// 객체의 주소값을 복사하는 것
 		// Stack에 있는 주소값 복사
 		// Heap에 있는 데이터는 그대로 유지
 		// 하나의 메모리를 두 개의 배열에서 동시에 참조
 		// - 명시적으로 두 개의 배열이지만 하나의 몸체 공유
 		// - 하나의 배열에서 값 변경 시 다른 배열에서도 값 변경됨
 		int[] arr1 = {5,6,7,8};
 		int[] arr2 = arr1;
 		arr2[3] = 1000;
 		for(int num1 : arr1) {
 			System.out.print(num1 + ", ");
 		}
 		System.out.println();
 		for(int num2 : arr2) {
 			System.out.print(num2 + ", ");
 		}
 		
 		System.out.println("");
 		System.out.println("=================");
 		// (2) 깊은 복사
 		int[] arr3 = {5,6,7,8};
 	 	int[] arr4 = new int[arr3.length];
 		
 	 	for(int i=0; i<arr4.length; i++) {
 	 		arr4[i] = arr3[i];
 	 	}
 	 	
 	 	arr4[3] = 1000;
 	 	
 		for(int num1 : arr3) {
 			System.out.print(num1 + ", ");
 		}
 		System.out.println();
 		for(int num2 : arr4) {
 			System.out.print(num2 + ", ");
 		}
 		System.out.println();
 		System.out.println("==================");
 		
 		// Math.random() 0.0~0.99999 
 		// -> 1~100 사이의 정수 랜덤값 도출
 		double basic = Math.random();
 		System.out.println(basic);
 		
 		// 1. (최대값-최소값+1) 만큼 곱하기
 		double hundred = basic*(100-1+1);
 		System.out.println(hundred);
 		
 		// 2. 형변환
 		int casting = (int)hundred;
 		System.out.println(casting);
 		
 		// 3. 최소값 더하기
 		int add = casting+1;
 		System.out.println(add);
 		
 		// 10~20 사이의 정수 랜덤값
 		int rnd =(int)(Math.random()*11)+10;
 		System.out.println(rnd);
 		
 		// 1~45 사이의 정수 랜덤값
 		int rnd2 = (int)(Math.random()*45)+1;
 		System.out.println(rnd2);
 		
 		
 		
 		
 		
	}

}
