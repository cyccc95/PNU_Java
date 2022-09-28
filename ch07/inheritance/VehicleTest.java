package com.ruby.java.ch07.inheritance;

import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle vehicle = new Vehicle();

		System.out.println("차종 선택 : Sedan RV SUV Truck");
		System.out.print("입력 : ");
		String v = sc.nextLine(); 
		
		vehicle.selectYear(v);
		
		int year = sc.nextInt(); // 연식 입력
		
		switch (v) {
			case "Sedan":
				Sedan sedan = new Sedan(v,year);
				sedan.printYearSedan(v,year);
				break;
			case "RV":
				RV rv = new RV(v,year);
				rv.printYearRV(v,year);
				break;
			case "SUV":
				SUV suv = new SUV(v,year);
				suv.printYearSUV(v,year);
				break;
			case "Truck":
				Truck truck = new Truck(v,year);
				truck.printYearTruck(v,year);
				break;
		}
		
	}

}

// inheritance 연습 test
