package com.gn.study.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.gn.study.model.vo.Product;
import com.gn.study.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(3);
		class2.add(4);
		class2.add(5);
		
		System.out.println("===========합집합===========");
//		class1.addAll(class2); // class1에 class2를 합치고 class1을 바꾼것
		Set<Integer> union = new HashSet<Integer>(class1); //합쳐준걸 담을 HashSet을 새로 만들어서 넣어줌
		union.addAll(class2);
		System.out.println(class1);  // 중복된 3하나(교집합)를 지우고 합쳐줌
		System.out.println(union);
		
		System.out.println("===========교집합===========");
//		class1.retainAll(class2);
		Set<Integer> intersection = new HashSet<Integer>(class1);
		intersection.retainAll(class2);
		System.out.println(class1);
		System.out.println(intersection);
		System.out.println("===========차집합===========");
		Set<Integer> difference = new HashSet<Integer>(class1);
		difference.removeAll(class2);
		System.out.println(difference);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("철수",20));
		set1.add(new Student("우석",28));
		set1.add(new Student("은우",30));
		
		Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("철수",20));
		set2.add(new Student("길동",25));
		
//		set1.addAll(set2);
//		set1.retainAll(set2);
		set1.removeAll(set2);
		System.out.println(set1); //hashCode랑 equals가 중복 걸러줌
		System.out.println("===========Iterator===========");
		Set<String> fruits = new HashSet<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		// 본인을 만들고 본인이 가진 제너릭이랑 똑같은걸 만들어줌.
		Iterator<String> iterator = fruits.iterator();  // iterator -> util에 있음 import하기
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.print(fruit);
			iterator.remove();
			if(fruits.size() !=0) {
				System.out.print(", "); //, 가 마지막에 붙지 않도록 하기위함-> 최종적으로 체리, 사과, 바나나 출력.
			}
		}
		System.out.println();
		System.out.println("======== LinkedHashSet ========");
		Set<String> set4 = new LinkedHashSet<String>(); // 동,서,남,북 넣어준 순서대로 
//		set4 = new HashSet<String>(); // 북, 남, 동, 서 순서X
//		set4 = new TreeSet<String>(); // 남, 동, 북, 서 -> 오름차순(사전 순서) 
//		set4 = new TreeSet<String>(Collections.reverseOrder()); // 서,북,동,남 ->내림차순
		set4.add("동");
		set4.add("서");
		set4.add("남");
		set4.add("북");
		System.out.println(set4);
		
		Set<Product> set = new TreeSet<Product>();
		set.add(new Product("젤리",2000));
		set.add(new Product("사탕",500));
		set.add(new Product("홍삼",8000));
		System.out.println(set); // ClassCastException오류발생 Comparable해야함
		
		
		
		
		
	}
}
