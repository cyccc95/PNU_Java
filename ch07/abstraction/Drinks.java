package com.ruby.java.ch07.abstraction;

abstract class Drinks {
	private int price;
	
	public Drinks(int price) {
		this.price = price;
	}
	public void print() {
		System.out.print(price + "원짜리 ");
	}
	public abstract void drink();
}

class Juice extends Drinks {
	public Juice(int price) {
		super(price);
	}
	public void drink() {
		super.print();
		System.out.println("주스를 마십니다");
	}
}

class Coffee extends Drinks {
	public Coffee(int price) {
		super(price);
	}
	public void drink() {
		super.print();
		System.out.println("커피를 마십니다");
	}
}

class Beer extends Drinks {
	public Beer(int price) {
		super(price);
	}
	public void drink() {
		super.print();
		System.out.println("맥주를 마십니다");
	}
}

class Water extends Drinks {
	public Water(int price) {
		super(price);
	}
	public void drink() {
		super.print();
		System.out.println("물을 마십니다");
	}
}

class Tea extends Drinks {
	public Tea(int price) {
		super(price);
	}
	public void drink() {
		super.print();
		System.out.println("차를 마십니다");
	}
}