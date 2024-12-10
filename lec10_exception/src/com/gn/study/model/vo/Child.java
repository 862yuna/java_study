package com.gn.study.model.vo;

public class Child extends Prent{
	@Override
	public void method() 
//			throws IllegalArgumentException{
//			throws Exception{
	throws NullPointerException{
		System.out.println("Child");
	}
}
