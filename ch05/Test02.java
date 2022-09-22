package com.ruby.java.ch05;

public class Test02 {

	public static void main(String[] args) {
		test("최한수1", 1);
		test("최한수2", 1, 2);
		test("최한수3", 1, 2, 3);
	}
	
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
 // 복합 선언