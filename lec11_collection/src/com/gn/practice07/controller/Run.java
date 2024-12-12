package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓",15000));
		storage1.add(new Equipment("배트",6000));
		storage1.add(new Equipment("축구공",3000));
		
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트",6000));
		storage2.add(new Equipment("야구공",5000));
		storage2.add(new Equipment("글로브",9000));
		
		Set<Equipment> union = new HashSet <Equipment>(storage1);
		union.addAll(storage2);

		Set<Equipment> intersection = new HashSet<Equipment>(storage1);
		intersection.retainAll(storage2);
		
		Set<Equipment> difference = new HashSet<Equipment>(storage1);
		difference.removeAll(storage2);
		
		Iterator<Equipment> iterator = union.iterator();
		System.out.println("*** 합집합 ***");
		while(iterator.hasNext()) {
			Equipment e = iterator.next();
			System.out.println(e);
		}
		System.out.println("*** 교집합 ***");
		iterator = intersection.iterator();
		while(iterator.hasNext()) {
			Equipment e = iterator.next();
			System.out.println(e);
		}
		System.out.println("*** 차집합 ***");
		iterator = difference.iterator();
		while(iterator.hasNext()) {
			Equipment e = iterator.next();
			System.out.println(e);
		}
		
	}
}
