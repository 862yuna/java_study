package com.gn.practice02;

public class Run {
	public static void main(String[] args) {
		Pair<String,Integer> p = new Pair<String,Integer>("Apple",10);
		
		System.out.println("First : "+p.getFirst());
		System.out.println("Second : "+p.getSecond());
	}
}
