package com.gn.practice03.model.vo;

public class Circle extends Point{

	private int radius; // 반지름
	private static final double PI=3.14;
	// 기본 생성자
	public Circle() {
	}
	// 매개변수 생성자
	public Circle(int x, int y , int radius) {
		super(x,y);
		this.radius=radius;
	}
	// setter
	public void setRadius(int radius) {
		this.radius=radius;
	}
	// getter
	public int getRadius() {
		return radius;
	}
	
	@Override
	public void draw() {
		super.draw(); // x,y 좌표값 출력하는 부모클래스의 메소드
		System.out.printf("면적 : %.1f",PI*radius*radius);
		System.out.println();
		System.out.printf("둘레 : %.1f",PI*radius*2);
//		System.out.println("면적 : "+PI*radius*radius+"\n"+"둘레 : "+PI*radius*radius);
// 		System.out.printf("면적 : %.1f\n",PI*radius*radius);
//		System.out.printf("둘레 : %.1f\n",PI*radius*2);
		System.out.println();
	}
	
	
}
