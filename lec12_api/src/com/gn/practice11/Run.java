package com.gn.practice11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {
		// 1. 오늘 날짜 출력
		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String todayResult = today.format(dtf);
		System.out.println("오늘 날짜 : "+todayResult);
		// 2. 영화 개봉까지 남은 날 출력 -> 영화개봉 2024 12 25
		LocalDate startDate = LocalDate.of(2024, 12, 25);
		long daysBetween = 
				ChronoUnit.DAYS.between(today, startDate);
		System.out.println("영화 개봉까지 남은 날 : "+daysBetween+"일");
		// 3. 영화 개봉일의 요일 출력 ->getKoreanDayOfWeek 메소드호출
		int days = startDate.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : "+getKoreanDayOfWeek(days));
		// 4. 개봉일 출력
		LocalDateTime movie = LocalDateTime.of(2024, 12,25,12,00,30);
		DateTimeFormatter dtf2 =
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String movieDay = movie.format(dtf2);
		System.out.println("개봉일 : "+movieDay);
		
	}
	
	public static String getKoreanDayOfWeek(int day) {
		// 요일의 정보를 숫자 형태로 전달 받음
		// LocalDate의 getDayOfWeek().getValue() 활용
		LocalDate movie = LocalDate.of(2024, 12,25);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("E요일");
		String days1 = movie.format(dtf3);
		return days1;
//		String result = "";
//		switch(day) {
//			case 1: result = "월요일"; break;
//			case 2: result = "화요일"; break;
//			case 3: result = "수요일"; break;
//			case 4: result = "목요일"; break;
//			case 5: result = "금요일"; break;
//			case 6: result = "토요일"; break;
//			case 7: result = "일요일"; break;
//		}
//		return result;
	}
}
