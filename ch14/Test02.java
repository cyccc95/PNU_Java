package com.ruby.java.ch14;

interface Mutiply {
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {
		Mutiply m;
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());
		
		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}

}

// 람다식 함수형 인터페이스
// 람다식으로 구현할 수 있는 인터페이스는 함수형 인터페이스만 가능
// 함수형 인터페이스는 하나의 메서드만 선언되어있어야 함
