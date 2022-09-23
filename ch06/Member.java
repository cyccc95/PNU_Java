package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member() {
		System.out.println("Member() 생성자 실행");
	} // default constructor
	
	public Member(String name) {
		System.out.print("Member(String) 생성자 실행 : ");
		System.out.println(name);
	} // constructor
	
	public Member(String name, int age) {
		System.out.print("Member(String, int) 생성자 실행 : ");
		System.out.println(name + " : " + age);
	} // constructor
	
	public void setName(String name) {
		
	}
	
	public static void main(String[] args) {
		System.out.println("main() 매서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}
}

// Constructor : 생성자
// 형태 : method 형태
// 리턴 타입 x
// 이름 : 소속된 클래스와 같다
// 역할 : 필드의 초기화
// 호출 시기 : 인스턴스 생성 시 자동 호출