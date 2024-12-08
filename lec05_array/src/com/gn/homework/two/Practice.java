package com.gn.homework.two;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[][] arr = new int[4][4];
		int num = arr.length*arr[0].length;
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j]+" ");
			} 
			System.out.print("\n");
		}
		
	}
	public void practice02() {
		int[][] arr = new int[4][4];
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				int random = (int)(Math.random()*10)+1; //0-49
				arr[i][j] = random;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while(true) {
			if(!(1<=num1&&num1<=10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
				System.out.print("행 : ");
				num1 = sc.nextInt();
			} else {
				break;
			}
		}
		while(true) {
			if(!(1<=num2&&num2<=10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
				System.out.print("열 : ");
				num2 = sc.nextInt();
			} else {
				break;
			}
		}
		char[][] arr = new char[num1][num2];
		for(int i =0;i<num1;i++) {
			for(int j=0;j<num2;j++) {
				int random = (int)(Math.random()*26)+65;
				arr[i][j] = (char)random;
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.print("\n");
		}
		sc.close();
	}
	
	
	public void practice04() {
		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"},
			{"차","지","습","으","냅"},{"원","열","니","로","시"},
			{"배","심","다","좀","다"},{"열","히","! ","더","!! "}};
		for(int i = 0;i<strArr.length;i++) {
			for(int j =0;j<strArr[i].length;j++) {
//				strArr = new String[j][i];
				System.out.print(strArr[j][i]+ " ");
			}
			System.out.print("\n");
		}
	}
	
	
	public void practice05() {
		String[] checkName = {"강건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[][] names = new String[3][2];
		for(int i =0;i<checkName.length;i++) {
			if(i%2==0) {
				for(int j =1;j<checkName.length;j++) {
					if(j%2!=0) {
						names = new String[i][j] ;
						System.out.println(names[i][j]);
					}
				}
				
			}
		}  
		
//		for(int i=0;i<names.length;i++) {
//			for(int j=0;j<names[i].length;j++) {
//				
//			}
//		
//		
//		
//		
//		}
		
		
	}
	public void practice06() {
		
	}
	public void practice07() {
		
	}
	public void practice08() {
		
	}
}
