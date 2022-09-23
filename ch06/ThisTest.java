package com.ruby.java.ch06;

public class ThisTest {
	int i = 1;
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;
		
		second(4);
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i + j;
	}
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
	
	}

}

// this : 현재 실행중인 인스턴스의 주솟값
// 용도 : 클래스 멤버를 가리킬 때, 생성자를 호출할 때, 자신의 주솟값을 전달하고 싶을 때