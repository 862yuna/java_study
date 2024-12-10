package com.gn.homework04.run;

import com.gn.homework04.model.vo.GalaxyS24;
import com.gn.homework04.model.vo.Iphone15;
import com.gn.homework04.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] arr = new SmartPhone[2];
		arr[0] = new GalaxyS24();
		arr[1] = new Iphone15();
		
		for(SmartPhone phone : arr) {
				phone.printMaker();
				phone.makeCall();
				phone.takeCall();
				phone.touch();
				phone.charge();
				phone.picture();
				System.out.println();
		}
	}
}
