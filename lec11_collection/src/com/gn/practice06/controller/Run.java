package com.gn.practice06.controller;

import java.util.HashSet;
import java.util.Set;

import com.gn.practice06.model.vo.Food;

public class Run {
	public static void main(String[] args) {
		Set<Food> food = new HashSet<Food>();
		food.add(new Food("샐러드",14000));
		food.add(new Food("치킨",23000));
		food.add(new Food("치킨",50000));
//		System.out.println(food);
		food.remove(new Food("치킨",50000));
		System.out.println("5만원 치킨 취소 : "+food);
		// 전체 주문 취소
		food.clear();
		System.out.println("전체 주문 취소 : "+food);
	}
}
