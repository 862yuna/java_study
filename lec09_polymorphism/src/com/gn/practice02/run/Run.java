package com.gn.practice02.run;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {
	public static void main(String[] args) {
		
		SchoolMember[] arr = new SchoolMember[3];
		arr[0] = new Student();
		arr[1] = new Teacher();
		arr[2] = new Staff();
		
		for(SchoolMember s : arr) {
			s.introduce();
			if(s instanceof Student) {
				((Student) s).study();
			} else if(s instanceof Teacher) {
				((Teacher) s).teach();
			} else if(s instanceof Staff) {
				((Staff) s).work();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
