package com.gn.study.model.vo;

import java.util.Objects;

// 1. Comparable 인터페이스를 구현한다
public class Student implements Comparable<Student>{
	public String name;
	public int age;
	
	public Student() {}
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "[이름:"+name+", 나이:"+age+"]";
	}
	
	@Override
	public int hashCode() { // 해시코드 메소드 재정의
		return Objects.hash(name,age); //hash 는 static메소드
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(s.name.equals(name)&&s.age==age) {
				result = true;
			}
		}
		return result;
	}
	// 2. compareTo 메소드를 재정의한다.
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
//		if(this.age > other.age) {
//			return 1;
//		}else if(this.age<other.age) {
//			return -1;
//		}else {
//			return 0;
//		}
		// return 이 양수면 앞 뒤 바꾼다.
		// return 이 음수면 앞뒤 바꾸지 않는다.
		// return 이 0이면 두 값이 같다.
		
	}
	
}
