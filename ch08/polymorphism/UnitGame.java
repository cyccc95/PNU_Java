package com.ruby.java.ch08.polymorphism;

class Unit {
	private String unit;
	private String location;
	
	public Unit() {
		unit = "";
		location = "";
	}
	
	public Unit(String unit, String location) {
		this.unit = unit;
		this.location = location;
	}
	
	public void attack() {
		System.out.print(this.unit + " : ");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Tank extends Unit {
	public Tank(String unit, String location) {
		super(unit, location);
	}
	
	public void attack() {
		super.attack();
		System.out.println("포를 쏜다");
	}
	
	public void move() {
		super.move();
	}
}

class Airplane extends Unit {
	public Airplane(String unit, String location) {
		super(unit, location);
	}
	
	public void attack() {
		super.attack();
		System.out.println("미사일을 발사한다");
	}
	
	public void move() {
		super.move();
	}
}

class Submarine extends Unit {
	public Submarine(String unit, String location) {
		super(unit, location);
	}
	
	public void attack() {
		super.attack();
		System.out.println("어뢰를 쏜다");
	}	
	
	public void move() {
		super.move();
	}
}

class Soldier extends Unit {
	public Soldier(String unit, String location) {
		super(unit, location);
	}
	
	public void attack() {
		super.attack();
		System.out.println("총을 쏜다");
	}
	
	public void move() {
		super.move();
	}
}

public class UnitGame {

	public static void main(String[] args) {
		Unit[] u = new Unit[4];
		u[0] = new Tank("Tank", "서울");
		u[1] = new Airplane("Airplane", "부산");
		u[2] = new Submarine("Submarine", "대구");
		u[3] = new Soldier("Soldier", "대전");
		
		System.out.println("Attack");
		for (Unit x : u) {
			x.attack();
		}
		System.out.println("\nMove");
		for (Unit x : u) {
			x.move();
		}
	}

}

// polymorphism with general class
