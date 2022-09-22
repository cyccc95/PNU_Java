package com.ruby.java.ch05;

public class Test03 {

	public static void main(String[] args) {
		
		Armor armor1 = new Armor("hansu", 170, 60, "red", true);
		Armor armor2 = new Armor("wook", 180, 70, "blue", true);
		
//		setArmor(armor1);
//		setArmor(armor2);
		
//		printArmor(armor1);
//		printArmor(armor2);
		
		printArmor(armor1);
		printArmor(armor2);

	}

//	public static void setArmor(Armor armor) {
//		armor.setName("hansu");
//		armor.setColor("red");
//		armor.setHeight(180);
//		armor.setWeight(70);
//		armor.setFly(true);
//	}
//
//	public static void printArmor(Armor armor) {
//		System.out.println("name : " + armor.getName());
//		System.out.println("color : " + armor.getColor());
//		System.out.println("height : " + armor.getHeight());
//		System.out.println("weight : " + armor.getWeight());
//		System.out.println("isFly : " + armor.isFly());
//	}
	
	public static void printArmor(Armor armor) {
		System.out.println("name : " + armor.getName());
		System.out.println("height : " + armor.getHeight());
		System.out.println("weight : " + armor.getWeight());
		System.out.println("color : " + armor.getColor());
		System.out.println("isFly : " + armor.isFly());
	}
}

// set, get
