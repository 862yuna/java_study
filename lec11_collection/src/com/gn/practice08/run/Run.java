package com.gn.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		
	Set<Person> personList1 = new TreeSet<Person>();	
	personList1.add(new Person("홍길동",20));	
	personList1.add(new Person("이순신",25));	
	personList1.add(new Person("유관순",22));	
	Set<Person> personList2 = new TreeSet<Person>();	
	personList2.add(new Person("유관순",22));		
	personList2.add(new Person("강감찬",27));		
	personList2.add(new Person("을지문덕",30));	
	
	
	// 합집합	
	Set<Person> union = new TreeSet<Person>(personList1);	
	union.addAll(personList2);
	//교집합
	Set<Person> intersection = new TreeSet<Person>(personList1);
	intersection.retainAll(personList2);
	//차집합
	Set<Person> difference = new TreeSet<Person>(personList1);
	difference.removeAll(personList2);
	Iterator<Person> iterator = union.iterator();
	System.out.println("=== 합집합 ===");
	int count = 1;
	while(iterator.hasNext()) {
		Person p = iterator.next();
		System.out.println(count+"번 "+p);
		count++;
	}
	System.out.println("=== 교집합 ===");
	count = 1;
	iterator = intersection.iterator();
	while(iterator.hasNext()) {
		Person p = iterator.next();
		System.out.println(count+"번 "+p);
		count++;
	}
	System.out.println("=== 차집합 ===");
	count = 1;
	iterator = difference.iterator();
	while(iterator.hasNext()) {
		Person p = iterator.next();
		System.out.println(count+"번 "+p);
		count++;
	}
		
	}
}
