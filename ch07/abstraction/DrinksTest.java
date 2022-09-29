package com.ruby.java.ch07.abstraction;

public class DrinksTest {

	public static void main(String[] args) {
		Drinks[] drinks = new Drinks[5];
		drinks[0] = new Juice(1000);	
		drinks[1] = new Coffee(2000);
		drinks[2] = new Beer(3000);
		drinks[3] = new Water(4000);
		drinks[4] = new Tea(5000);
		
//		drinks[0].drink();
//		drinks[1].drink();
//		drinks[2].drink();
//		drinks[3].drink();
//		drinks[4].drink();
		
		for (Drinks x : drinks) {
			x.drink();
		}
		

	
	}

}
