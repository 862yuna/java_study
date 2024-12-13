package com.gn.practice11;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		Map<Integer,Fruit> map = new TreeMap<Integer,Fruit>();
		map.put(1, new Fruit("귤","제주",10,15000));
		map.put(2, new Fruit("사과","예산",5,25000));
		map.put(3, new Fruit("포도","강화도",5,35000));
		map.put(4, new Fruit("배","나주",10,50000));
		
//		System.out.println(map);
		System.out.println("=== 전체 데이터 조회 ===");
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itKey = keySet.iterator();
		while(itKey.hasNext()) {
			Integer key = itKey.next();
			Fruit fruit = map.get(key);
			System.out.println(key + " : "+fruit);
		}
		System.out.println("=== 가격 20000원 이상 ===");
		Set<Entry<Integer,Fruit>> entrySet = map.entrySet();
		Iterator<Entry<Integer,Fruit>> entryKey = entrySet.iterator();
		while(entryKey.hasNext()) {
			Entry<Integer,Fruit> entry = entryKey.next();
			Integer key = entry.getKey();
			Fruit fruit = entry.getValue();
			if(fruit.getPrice()>=20000) {
				System.out.println(key+ " : "+fruit);
			}
		}
		
		System.out.println("=== 이름이 한글자인 과일 ===");
		itKey = keySet.iterator();
		while(itKey.hasNext()) {
			Integer key = itKey.next();
			Fruit fruit = map.get(key);
			if(fruit.getName().length()==1) {
				System.out.println(key + " : "+fruit);
			}
		}
		
		System.out.println("=== 포도 가격 인상 ===");
		
		
		entryKey = entrySet.iterator();
		while(entryKey.hasNext()) {
			Entry<Integer,Fruit> entry = entryKey.next();
			Integer key = entry.getKey();
			Fruit fruit = entry.getValue();
			if(fruit.getName().equals("포도")) {
				fruit.setPrice(28000);
				System.out.println(key + " : "+fruit);
			}
		
		}
		
	}

}
