package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		int random = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");
		int count = 1;
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			if(num<random) {
				System.out.println("UP !");
				count++;
			}else if(num>random) {
				System.out.println("DOWN !");
				count++;
			}else if(num==random) {
				System.out.println("정답입니다 !!");
				System.out.println(count+"회만에 맞추셨습니다.");
				break;
			}
		}
		
	}

}
