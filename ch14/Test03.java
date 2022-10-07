package com.ruby.java.ch14;

interface Verify {
	boolean check(int n);
}

interface Verify2 {
	boolean check(int n, int d);
}

public class Test03 {

	public static void main(String[] args) {
		Verify isEven = (n) -> (n % 2) == 0;
		System.out.println(isEven.check(10));
		
		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(-5));
	
		Verify2 vf = (n, d) -> (n % d) == 0;
		System.out.println(vf.check(24, 3));
	}

}

// 매개변수를 사용하는 람다식
