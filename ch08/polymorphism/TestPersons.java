package com.ruby.java.ch08.polymorphism;

abstract class Person {
	 protected String pnum;
	 protected String name;
	 protected int age;
	
	public Person(String pnum, String name, int age) {
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}
	
	abstract void show();
	abstract void increase();
}

class Employee extends Person{
	 private String job;
	 private String dept;
	 private int salary;
	
	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	void show() {
		System.out.printf("pnum : %s, name : %s, age : %d, job : %s, dept : %s, salary : %d",pnum,name,age,job,dept,salary);
	}
	@Override
	void increase() {
		salary = salary + salary/10;
	}
	
}

class Designer extends Employee {
	private String language;
	private int workYear;
	
	public Designer(String pnum, String name, int age, String job, String dept, int salary, String language, int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}
	
	void show() {
		System.out.println();
		super.show();
		System.out.printf(", language : %s, workYear : %d\n",language,workYear);
	}
	void increase() {
		super.increase();
	}
}

class Student extends Person {
	private String schoolName;
	private int schoolyear;
	private int scholarship;
	
	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}

	@Override
	void show() {
		System.out.printf("pnum : %s, name : %s, age : %d, schoolName : %s, schoolyear : %d, scholarship : %d",pnum,name,age,schoolName,schoolyear,scholarship);
	}

	@Override
	void increase() {
		scholarship = scholarship + scholarship/10;
	}
}

class WorkStudent extends Student {
	 private String job;
	 private int dayPay;
	
	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship, String job, int dayPay) {
		super(pnum, name, age, schoolName, schoolyear, scholarship);
		this.job = job;
		this.dayPay = dayPay;
	}
	
	void show() {
		System.out.println();
		super.show();
		System.out.printf(", job : %s, dayPay : %d\n",job,dayPay);
	}
	
	void increase() {
		super.increase();
		dayPay = dayPay + dayPay/10;
	}
}

public class TestPersons {
	static void showAll(Person[] setPerson) {
		for(Person x : setPerson) {
			x.show();
		}
	}
	
	static void increaseAll(Person[] setPerson) {
		for(Person x : setPerson) {
			x.increase();
		}
	}
	
	public static void setData(Person[] setPerson) {
		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 2000);
		Designer d = new Designer("p02", "Choi", 30, "Designer", "Design", 3000, "Korean", 5);
		Student s = new Student("p03", "Lee", 23, "PNU", 22, 10);
		WorkStudent w = new WorkStudent("p04", "Park", 25, "PNU", 20, 30, "Developer", 100);
		setPerson[0] = e; setPerson[1] = d; setPerson[2] = s; setPerson[3] = w;
	}
	
	public static void main(String[] args) {
		Person[] setPerson = new Person[4];
		setData(setPerson);
		showAll(setPerson);
		System.out.println("\nincrease salary, scholarship, dayPay");
		increaseAll(setPerson);
		showAll(setPerson);
	}

}
