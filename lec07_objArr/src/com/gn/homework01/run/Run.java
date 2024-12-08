package com.gn.homework01.run;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		// 최대 10명의 학생 정보를 기록할 수 있게 배열 생성
		Student[] arr = new Student[10]; // index = 0~9
		// 학생수를 나타내는 변수
		// 한명 추가시 1씩 증가
		int count = 0;
		// 'n' 또는 'N'을 입력할때까지 계속 학생 정보 입력받기.
		
		// 현재 배열에 담겨있는 학생들 정보를 모두 출력.
		Scanner sc = new Scanner(System.in);
		String answer = "y";
		while(true) {
			if(answer.equals("n")||answer.equals("N")||count==10){
				break;
			} else if(answer.equals("y")||answer.equals("Y")) {
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				
				// 1. 매개변수 생성자로 객체에 데이터담기
				arr[count] = new Student(grade, classroom, name, kor, eng, math);
				
				// 2. setter 를 이용하여 객체에 데이터담기
//				arr[count].setGrade(grade);
//				arr[count].setClassroom(classroom);
//				arr[count].setName(name);
//				arr[count].setKor(kor);
//				arr[count].setEng(eng);
//				arr[count].setMath(math);
				count++;
				System.out.print("계속 추가하시겠습니까? ");
				answer = sc.next();
			}
		}
		
		for(int i =0;i<count;i++) {
			int sum = arr[i].getKor()+arr[i].getEng()+arr[i].getMath();
			int avg = sum/3;
			System.out.println(arr[i].information()+"평균 : "+avg);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
