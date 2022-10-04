package com.ruby.java.ch08.polymorphism;

interface Message {
	public abstract String getMessage();
	public abstract void setMessage(String msg);
	public static void getConnection() {
		System.out.println("network ok");
	}
}

class Person2 {
	 private String pnum;
	 private String name;
	 private int age;
	
	public Person2(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}
	
}

class Employee2 extends Person2 implements Message {
	private String job;
	private String dept;
	private int salary;
	private String msg;
	
	public Employee2(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String getMessage() {
		return  msg;
	}
	
	@Override
	public void setMessage(String msg) {
		this.msg = msg;
	}
	
//	static void messageShowAll(Message[] m) {
//		for (Message x : m) {
//			System.out.println(x.getMessage());
//		}
//	}
	
	
}

public class TestPersons2 {
 
	static void messageShowAll(Message[] m) {
		for (Message x : m) {
			System.out.println(x.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Message[] m = new Message[4];
		m[0] = new Employee2("p01", "Hong", 18, "Student", "Math", 1000);
		m[1] = new Employee2("p02", "Choi", 30, "Designer", "Design", 2000);
		m[2] = new Employee2("p03", "Lee", 23, "Developer", "backend", 3000);
		m[3] = new Employee2("p04", "Park", 25, "Teacher", "elementary", 2500);
		
		m[0].setMessage("good");
		m[1].setMessage("best");
		m[2].setMessage("soso");
		m[3].setMessage("bad");
		
//		Employee2.messageShowAll(m);
		messageShowAll(m);
	}

}
