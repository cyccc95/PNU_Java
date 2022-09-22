package com.ruby.java.ch05;

public class Armor {
	// 필드
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	
	public Armor() {
		// TODO Auto-generated constructor stub
	}
	
	public Armor(String name, int height, int weight, String color, boolean isFly) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFly() {
		return isFly;
	}
	public void setFly(boolean isFly) {
		this.isFly = isFly;
	}
	
	
	
	

}
