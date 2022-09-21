package edu;

public class Test9 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		a += b;
		System.out.println(a); // 12
		a -= b;
		System.out.println(a); // 10
		a *= b;
		System.out.println(a); // 20
		a /= b;
		System.out.println(a); // 10
		a %= b;
		System.out.println(a); // 0
	
		boolean isOn = true;
		isOn = !isOn;
		System.out.println(isOn);
	}

}

// 복합 대입 연산자, 부정 연산자
