package com.gn.homework02;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		
		long start1 = System.nanoTime();
		p.method1();
		long end1 = System.nanoTime();
		long result1 = end1-start1;
		System.out.println("method1 실행 소요 시간(나노초) : "+result1);
		System.out.println("______________________");
		long start2 = System.nanoTime();
		p.method2();
		long end2 = System.nanoTime();
		long result2 = end2-start2;
		System.out.println("method2 실행 소요 시간(나노초) : "+result2);
	}

}
