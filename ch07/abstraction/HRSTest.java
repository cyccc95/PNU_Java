package com.ruby.java.ch07.abstraction;

abstract class Employee	{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee	{
	public void calcSalary() { // sub class에서는 abstract method를 구현해야 오류 안남
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee	{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}


abstract class Manager extends Employee	{ // super class의 abstract method를 overriding 하지 않으려면 sub class도 abstract class로 선언
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
	
}

public class HRSTest {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
//		Manager m = new Manager();  abstract class는 완전하게 설계된 class가 아니므로 instance 생성 불가능
		Director d = new Director();
		
		s.calcSalary();
		c.calcSalary();
//		m.calcSalary();

		System.out.println();
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
	}

}

// abstract