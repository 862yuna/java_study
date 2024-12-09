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
			if(phone instanceof GalaxyS24) {
				((GalaxyS24)phone).printMaker();
				((GalaxyS24)phone).makeCall();
				((GalaxyS24)phone).takeCall();
				((GalaxyS24)phone).touch();
				((GalaxyS24)phone).charge();
				((GalaxyS24)phone).picture();
				System.out.println();
			} else if(phone instanceof Iphone15) {
				((Iphone15)phone).printMaker();
				((Iphone15)phone).makeCall();
				((Iphone15)phone).takeCall();
				((Iphone15)phone).touch();
				((Iphone15)phone).charge();
				((Iphone15)phone).picture();
			}
		}
		
		
		
		
		
		
		
		
	}

}
