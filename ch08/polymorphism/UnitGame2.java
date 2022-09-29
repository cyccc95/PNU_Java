package com.ruby.java.ch08.polymorphism;

abstract class Unit2 {
	String unit;
	String location;
	
	public Unit2() {
		unit = "";
		location = "";
	}
	
	public Unit2(String unit, String location) {
		this.unit = unit;
		this.location = location;
	}
	
	public abstract void attack();
	public abstract void move();
}

class Tank2 extends Unit2 {
	public Tank2(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 포를 쏜다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Airplane2 extends Unit2 {
	public Airplane2(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 미사일을 발사한다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Submarine2 extends Unit2 {
	public Submarine2(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 어뢰를 쏜다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Soldier2 extends Unit2 {
	public Soldier2(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 총을 쏜다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}
public class UnitGame2 {

	public static void main(String[] args) {
		Unit2[] u = new Unit2[4];
		u[0] = new Tank2("Tank", "서울");
		u[1] = new Airplane2("Airplane", "부산");
		u[2] = new Submarine2("Submarine", "대구");
		u[3] = new Soldier2("Soldier", "대전");
		
		System.out.println("Attack");
		for (Unit2 x : u) {
			x.attack();
		}
		System.out.println("\nMove");
		for (Unit2 x : u) { 
			x.move();
		}
	}

}

// polymorphism with abstract class
