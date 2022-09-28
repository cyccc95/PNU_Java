package com.ruby.java.ch07.inheritance;

public class Vehicle {
	private String v; // 차종
	private int year; // 연식
	
	public Vehicle() {
		
	}
	
	public Vehicle(String v, int year) {
		this.v = v;
		this.year = year;
	}
	
	public void selectYear(String v) {
		this.v = v;
		System.out.println();
		System.out.println(v);
		System.out.println("연식 선택 : 20 21");
		System.out.print("입력 : ");
	}
	
	public void printYear(String v, int year) {
		System.out.println("\n" + year + "년식 " + v);
	}
}

class Sedan extends Vehicle{
	public Sedan(String v, int year) {
		super(v, year);
	}
	
	public void printYearSedan(String v, int year) {
		if(year == 20) {
			super.printYear(v, year);
			System.out.println("color : red");
			System.out.println("price : 50000");
		} else {
			super.printYear(v, year);
			System.out.println("color : blue");
			System.out.println("price : 30000");
		}
	
	}
	
}

class RV extends Vehicle{
	public RV(String v, int year) {
		super(v, year);
	}
	
	public void printYearRV(String v, int year) {
		if(year == 20) {
			super.printYear(v, year);
			System.out.println("color : green");
			System.out.println("price : 40000");
		} else {
			super.printYear(v, year);
			System.out.println("color : black");
			System.out.println("price : 60000");
		}
	
	}
}

class SUV extends Vehicle{
	public SUV(String v, int year) {
		super(v, year);
	}
	
	public void printYearSUV(String v, int year) {
		if(year == 20) {
			super.printYear(v, year);
			System.out.println("color : gray");
			System.out.println("price : 50000");
		} else {
			super.printYear(v, year);
			System.out.println("color : white");
			System.out.println("price : 70000");
		}
	
	}
	
}

class Truck extends Vehicle{
	public Truck(String v, int year) {
		super(v, year);
	}
	
	public void printYearTruck(String v, int year) {
		if(year == 20) {
			super.printYear(v, year);
			System.out.println("color : yellow");
			System.out.println("price : 80000");
		} else {
			super.printYear(v, year);
			System.out.println("color : purple");
			System.out.println("price : 90000");
		}
	
	}
	
}

// inheritance 연습