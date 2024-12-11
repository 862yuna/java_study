package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	public static void main(String[] args) {
		List<String> seats = new ArrayList<String>();
		
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		
		System.out.println("초기 좌석 목록: "+seats);
		seats.add(2,"A3");
		System.out.println("A3 좌석 추가 후 : "+seats);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석 : ");
		String reservation = sc.nextLine();
		
		int idx1 = seats.indexOf(reservation);
		if(idx1 != -1) {
			// A3 -> 2 -> 2번을 A3(예약)
			// B2 -> 3 -> 3번을 B2(예약)
			seats.set(idx1,reservation+"(예약)");
			// seat.set(idx1, seats.get(idx1)+"(예약)");
		} else {
			System.out.println(reservation+"는(은) 존재하지 않는 좌석입니다.");
		}
		
		System.out.println("좌석 예약 후 : "+seats);
		
		System.out.print("삭제 좌석 : ");
		String cancle = sc.nextLine();
		int idx2 = seats.indexOf(cancle);
		if(idx2 != -1) {
			seats.remove(idx2);
		}
		System.out.println("좌석 삭제 후 : "+seats);
		
		Collections.sort(seats);
		System.out.println("좌석 정렬 후 : "+seats);
		
		sc.close();
		
	}
	
	
	
	
	
	
	

}
