package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.startEngine();
		
		int speed = car.checkSpeed();
		System.out.println("기본 속도는 "+speed+"km/h 입니다.");
		
		car.setSpeed(150);
		
		String city = car.setDestination("부산");
		System.out.println(city);
		
		
	}
}
