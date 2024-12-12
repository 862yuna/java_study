package com.gn.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// Boxing
		Integer iNum = 100;
		// UnBoxing
		int num = iNum;
		// parse 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2); // 123456(문자열합쳐짐)
		int num1 = Integer.parseInt(str1); //문자형태를 정수타입으로 변환
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2); //579(숫자를 더해줌)
		
		str2 = "1.34";
		System.out.println(str2+str2); // 1.341.34
		double num3 = Double.parseDouble(str2);
		System.out.println(num3+num3); // 2.68
		
		//NumberFormatException
		try {
			String[] arr = new String[3];
			arr[0] = "일";
			int arrNum = Integer.parseInt(arr[0]);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열");
		
		// ClassCastException
		try {
			Object o = 9;
			String oStr = (String)o; //ClassCastException발생
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환");
		System.out.println("=============================");
		
		// 제네릭
		Container<Integer> con = new Container<Integer>();
		con.setItem(50);
		Container<String> tain = new Container<String>();
		tain.setItem("안녕하세요");
		System.out.println("======================");
		// List(ArrayList)
		// 1. 선언과 생성
		List<String> list = new ArrayList<String>();
		
		// 2. 추가
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal); // [아침, 점심]
		
		meal.add(1,"간식");
		System.out.println(meal); // [아침, 간식, 점심]
		// 3. 삭제
		meal.remove(1); // 인덱스 기준으로 삭제.
		System.out.println(meal); // [아침, 점심]
		
		meal.clear();
		System.out.println(meal); //[] -> 전부 삭제.
		
		// 4. 요소 변경
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums); //[15, 10, 23] 순서대로 들어감.
		
		nums.set(1, 500);
		System.out.println(nums); //[15, 500, 23] ->요소변경
		
		// 5. 요소 조회
		nums.get(0);
		System.out.println(nums.get(0)); // 15 출력
		
		for(int i = 0;i<nums.size();i++) {
			System.out.println(i+" : "+nums.get(i));
		}
		for(Integer n : nums) { // Integer를 int로 바꿔 적어도 실행됨.(같은형태일경우)
			System.out.println(n); //15   500   23
		}
		System.out.println("============================");
		// ArrayList 의 정렬
		System.out.println("정렬전 : "+nums);
		
		Collections.sort(nums);
		System.out.println("오름차순 : "+nums);
		
		Collections.sort(nums,Collections.reverseOrder());
		System.out.println("내림차순 : "+nums);
		
		// ArrayList<객체>
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("김철수",50));
		System.out.println(students);
		
		if(students.contains(new Student("김철수",50))) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		if(students.indexOf(new Student("김철수",50))!=-1){ 
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		students.add(new Student("이영희",40));
		students.add(new Student("홍길동",30));
		
		System.out.println("정렬 전 :"+students);
		Collections.sort(students);
		System.out.println("정렬 후 :"+students);
		System.out.println("==============HashSet=================");
		
		Set<String> city = new HashSet<String>(); // ->import 필요
		city.add("서울");
		city.add("부산");
		city.add("광명");
		System.out.println(city);
		// 중복 데이터 추가 시도
		city.add("서울");
		System.out.println(city); // 중복 추가 X
		
		System.out.println("======for each로 조회 ======");
		for(String str : city) {
			System.out.println(str);
//			city.remove(str); // 광명 출력->광명 삭제,부산 출력 -> 부산 삭제, 서울 출력-> 서울 삭제
//			if(city.size()==0) {
//				System.out.println("마지막!!");
//			}
		}
		
		
		
		// 삭제
		city.remove("서울");
		System.out.println("삭제 후 : "+city);
		// 비우기
		city.clear();
		System.out.println("비우기 : "+city);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수",30));
		set1.add(new Student("이영희",40));
		set1.add(new Student("홍길동",50));
		set1.add(new Student("김철수",30));
		System.out.println(set1); // 두가지 메소드의 결과값이 true여야 같은지 비교 가능, 주소값이 다름. 그래서 추가됨
		//->해시 오버라이드 후 중복인정으로 추가X
		set1.remove(new Student("김철수",30));
		System.out.println("삭제 후 : "+set1);
		// 해시코드 오버라이드나 equals 하나라도 없으면 삭제 되지 않음.
		
		
		
	}

}
