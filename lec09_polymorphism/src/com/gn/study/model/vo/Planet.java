package com.gn.study.model.vo;

public class Planet {
	public void description() {
		System.out.println("태양 주위를 공전하는 천체");
	}
	// 메소드 오버로딩 -> 정적 바인딩
	public void description(int age) { 
		System.out.println(age+"억년");
	}
	
	public void material() {
		System.out.println("행성마다 물질이 달라요.");
	}
}
