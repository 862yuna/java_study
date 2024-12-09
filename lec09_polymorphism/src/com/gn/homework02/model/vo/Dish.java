package com.gn.homework02.model.vo;

public class Dish extends Menu{
	private String ingredients;
	public Dish() {}
	public Dish(String name,int price,String ingredients) {
		super(name,price);
		this.ingredients=ingredients;
		
	}
	public String getName() {
		return "";
	}
	public int getPrice() {
		return 0;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setName(String name) {
	}
	public void setPrice(int price) {
	}
	public void setIngredients(String ingredients) {
		this.ingredients=ingredients;
	}
	@Override
	public void cook() {
		 super.toString();
		
	}

}
