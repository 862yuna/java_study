package com.gn.practice01;

public class Run {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		int[] src = new int[1000000];
		for(int i = 0; i<src.length;i++) {
			src[i] = (int)(Math.random()*100)+1;
//			System.out.println(src[i]);
		}
		int[] dst = new int[src.length/2];
		System.arraycopy(src, 0, dst, 0,src.length/2 );
		for(int i = 0; i<dst.length;i++) {
//			System.out.print(dst[i]);
			if(i%10==9) {
				System.out.println(dst[i]);
			}else {
				System.out.print(dst[i]+",");
			}
		}
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간: "+(after-before)/100+"ms");
		
	}
}
