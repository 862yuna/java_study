package com.gn.homework02.model.vo;

public class Chocolate extends Cake{
	
	private int cherry;
	private int chip;
	
	public Chocolate() {
		
	}
	
	public Chocolate(double flour,double cream,int cherry,int chip) {
		super(flour,cream);
		
	}
	
	public void setCherry(int cherry) {
		this.cherry=cherry;
	}
	
	public void setChip(int chip) {
		this.chip=chip;
	}
	
	public int getCherry() {
		return cherry;
	}
	
	public int getChip() {
		return chip;
	}
	
	public String toString() {
		return "";
	}
	
	
	
	
	

}
