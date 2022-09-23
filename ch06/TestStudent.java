package com.ruby.java.ch06;

class Student {
	private int sno;
	private String name;
	private double weight;
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getSno() {
		return sno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public void showStudent(int sno, String name, double weight) {
		System.out.println("sno : " + sno);
		System.out.println("name : " + name);
		System.out.println("weight : " + weight);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setSno(6);
		s.setName("hansu");
		s.setWeight(65.0);
		
		s.showStudent(s.getSno(), s.getName(), s.getWeight());
		
		
		
	}

}

// class 연습
