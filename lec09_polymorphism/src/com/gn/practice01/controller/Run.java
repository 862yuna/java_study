package com.gn.practice01.controller;

import com.gn.practice01.model.vo.Employee;
import com.gn.practice01.model.vo.Person;
import com.gn.practice01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		Person[] arr= new Person[2];
		Student s = new Student();
		arr[0]=s; // arr[0]=new Student();
		Employee e = new Employee();
		arr[1]=e; // arr[1] = new Employee();
		
		for(Person p : arr) {
			p.introduce();
		}
		
		
		
		
		
		
	}

}
