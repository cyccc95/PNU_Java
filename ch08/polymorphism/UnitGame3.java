package com.ruby.java.ch08.polymorphism;

interface UnitInterface {
	public abstract void attack();
	public abstract void move();

}

class Unit3 {
	protected String unit;
	protected String location;
	
	public Unit3() {
		unit = "";
		location = "";
	}
	
	public Unit3(String unit, String location) {
		this.unit = unit;
		this.location = location;
	}

	public void attack() {
		// TODO Auto-generated method stub
		
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}


}

class Tank3 extends Unit3 implements UnitInterface {
	public Tank3(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 포를 쏜다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Airplane3 extends Unit3 implements UnitInterface {
	public Airplane3(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 미사일을 발사한다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Submarine3 extends Unit3 implements UnitInterface {
	public Submarine3(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 어뢰를 쏜다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}

class Soldier3 extends Unit3 implements UnitInterface {
	public Soldier3(String unit, String location) {
		super(unit,location);
	}
	
	public void attack() {
		System.out.println(this.unit + " : 총을 쏜다");
	}
	
	public void move() {
		System.out.println(this.unit + " : move to " + this.location);
	}
}
public class UnitGame3 {

	public static void main(String[] args) {
		Unit3[] u = new Unit3[4];
		u[0] = new Tank3("Tank", "서울");
		u[1] = new Airplane3("Airplane", "부산");
		u[2] = new Submarine3("Submarine", "대구");
		u[3] = new Soldier3("Soldier", "대전");
		
		System.out.println("Attack");
		for (Unit3 x : u) {
			x.attack();
		}
		System.out.println("\nMove");
		for (Unit3 x : u) {
			x.move();
		}
	}

}

// polymorphism with class and interface