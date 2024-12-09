package com.gn.homework02.model.vo;

public class Drink extends Menu{
	private String recipe;
	public Drink() {}
	public Drink(String name,int price,String recipe) {
		
	}
	public String getName() {
		return "";
	}
	public int getPrice() {
		return 0;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setName(String name) {
	}
	public void setPrice(int price) {
	}
	public void setRecipe(String recipe) {
		this.recipe=recipe;
	}
	@Override
	public void cook() {
		super.toString();
	}
}
