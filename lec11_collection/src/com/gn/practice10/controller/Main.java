package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Main {
	public static void main(String[] args) {
		Map<String,Planet> planet = new HashMap<String,Planet>();
		planet.put("Earth",new Planet("지구",12742,1.0));
		planet.put("Mars",new Planet("화성",6779,1.88));
		planet.put("Venus",new Planet("금성",12104,0.62));
		planet.put("Mercury",new Planet("수성",4879,0.24));
		
//		System.out.println(planet);
		
		Set<String> keySet = planet.keySet();
		Iterator<String> itKey = keySet.iterator();
		System.out.println("*** keySet() 사용 ***");
		while(itKey.hasNext()) {
			String key = itKey.next();
			Planet value = planet.get(key);
//			System.out.println("행성 이름: "+key+"("++);
			System.out.println("행성 이름: "+key+"("+value.getName()+"), "
					+"지름: "+value.getDiameter()+"km, 공전주기: "+
					value.getPeriod()+"년");
		}
		
		Set<Entry<String,Planet>> entrySet = planet.entrySet();
		Iterator<Entry<String,Planet>> entryKey = entrySet.iterator();
		System.out.println("*** entrySet() 사용 ***");
		while(entryKey.hasNext()) {
			Entry<String,Planet> entry = entryKey.next();
			String key = entry.getKey();
			Planet value = entry.getValue();
			
			System.out.println("키: "+key+", 값: "+value);
		}
	}
}
