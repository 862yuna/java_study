package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 카페 오픈일 2025년 1월 24일 ("yyyy년 MM월 dd일")
		Calendar open = Calendar.getInstance();
		open.add(Calendar.MONTH, 1);
		open.add(Calendar.DATE, 7);
		Date openDay = open.getTime();
		SimpleDateFormat openSdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일");
//		System.out.println("카페 오픈일 :"+openSdf.format(openDay));
		// 오늘 날짜
		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		// 오늘 날짜 : "yyyy년 MM월 dd일"
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String today = sdf.format(d);
		System.out.println("오늘 날짜 : "+today);
		// 오늘 날짜 기준으로 카페 오픈일까지 남은 날짜 수 
		// 카페 오픈일까지 남은 날 : dd일
		long diff = open.getTimeInMillis()-cal.getTimeInMillis();
		diff = diff/1000;
		diff = diff/(24*60*60);
		System.out.println("카페 오픈일까지 남은 날 : "+diff+"일");
		// 카페 오픈일이 속한 달의 마지막 날
		// 오픈달의 마지막 날 : 31일
		int last = open.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : "+last+"일");
		// 카페 오픈일의 요일
		// 카페 오픈일의 요일 : 금요일
		Date day = open.getTime();
		SimpleDateFormat daySdf = 
				new SimpleDateFormat("E요일");
		System.out.println("카페 오픈일의 요일 : "+daySdf.format(day));
	}
}
