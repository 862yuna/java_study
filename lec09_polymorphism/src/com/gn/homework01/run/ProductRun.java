package com.gn.homework01.run;

import com.gn.homework01.model.vo.Book;
import com.gn.homework01.model.vo.Food;
import com.gn.homework01.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		Product p1 = new Food("치킨",20000,3);
		Product p2 = new Book("자바의 정석",15000);
		
//		System.out.println(p1.getName()); -> 치킨
//		System.out.println(p2.getName()); ->자바의 정석
		
		System.out.print(p1.getName()+"의 최종 가격 : "+p1.calculatePrice()+"\n");
		System.out.print(p2.getName()+"의 최종 가격 : "+p2.getPrice());
	}
}
