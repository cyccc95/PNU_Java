package com.ruby.java.ch06;

public class GcdLcm {
	
	private int num1;
	private int num2;
	
	public GcdLcm(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	public void print() {
		int max;
		int min;
		int gcd = 0;
		int lcm = 0;
		int rem;
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num1;
			min = num2;
		}
		
		while(max % min >= 0) {
			rem = max % min;
			if (rem == 0) {
				gcd = min;
				lcm = num1*num2/gcd;
				break;
			} else {
				max = min;
				min = rem;
			}
		} 
		
		System.out.printf("최대공약수 : %d, 최소공배수 : %d",gcd,lcm);
	}
}
