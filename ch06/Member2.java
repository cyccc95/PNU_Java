package com.ruby.java.ch06;

public class Member2 {
	private String name;
	private int age;
	
	public Member2() {
		this("guest");
	}
	
	public Member2(String name) {
		this(name, 0);
	}
	
	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
	
	public static void main(String[] args) {
		Member2 m1 = new Member2();
		Member2 m2 = new Member2("Amy");
		Member2 m3 = new Member2("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}

// 생성자 호출문 this()
// 생성자에서만 사용 가능하고 생성자 내에서 첫 번째 줄에 위치
