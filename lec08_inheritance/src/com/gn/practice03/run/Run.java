package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Point;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {

		
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당 
		Circle[] cir = new Circle[2];
		Rectangle[] rec = new Rectangle[2];
		// 위의 사용 데이터를 참고하여 각각 초기화
		cir[0] = new Circle(1,2,3);
		cir[1] = new Circle(3,3,4);
		
		rec[0] = new Rectangle(-1,-2,5,2);
		rec[1] = new Rectangle(-2,5,2,8);
		
		
		// 각 도형의 draw 메소드 실행(for each) 
		System.out.println("===circle===");
//		cir[0].draw();
//		cir[1].draw();
//		rec[0].draw();
//		rec[1].draw();
		
		for(Circle c : cir) {
			c.draw();
		}
		System.out.println("===rectangle");
		for(Rectangle r : rec) {
			r.draw();
		}
		
		
		
		
		
	}

}
