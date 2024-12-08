package com.gn.homework07.model.vo;

public class Employee {
	private int empNo; // 사번
	private String empName; // 이름
	private String dept; // 부서
	private String job; // 직급
	private int age; // 나이
	private char gender; // 성별
	private int salary; // 월급
	private double bonus; // 보너스
	private String phone; // 전화번호
	private String address; // 주소
	
	public Employee() {
		
	}
	
	public Employee(int empNo,String empName) {
		this.empNo=empNo;
		this.empName=empName;
	}
	
	public Employee(int empNo,String empName,String dept,
			String job,int age,char gender,int salary,
			double bonus,String phone,String address) {
		this.empNo=empNo;
		this.empName=empName;
		this.dept=dept;
		this.job=job;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.bonus=bonus;
		this.phone=phone;
		this.address=address;
	}
	// getter
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonus() {
		return bonus;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	// setter
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
}
