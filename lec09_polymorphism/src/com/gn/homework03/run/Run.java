package com.gn.homework03.run;

import com.gn.homework03.model.vo.Car;
import com.gn.homework03.model.vo.ElectricEngine;
import com.gn.homework03.model.vo.GasolineEngine;

public class Run {
	public static void main(String[] args) {
		// Car 클래스로 2개 객체 인스턴스화
		// 각각의 매개변수 생성자의 매개변수로 GasolineEngine과 ElectricEngine 사용
		// 2개의 Car객체의 startEngine 메소드 호출
		GasolineEngine ge = new GasolineEngine();
		ElectricEngine et = new ElectricEngine();
		Car c1 = new Car(ge);
		Car c2 = new Car(et);
		c1.startEngine();
		c2.startEngine();
		
	}

}
