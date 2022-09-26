package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		System.out.println("Employee 생성자 실행!");
	}
	
	public Employee(String name, int age, String dept) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " : " + dept;
	}
}

// sub class 1
// method overriding
// constructor overloading