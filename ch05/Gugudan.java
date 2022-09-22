package com.ruby.java.ch05;

public class Gugudan {
	private int dan;
	
	public void printGugudan(int dan) {
		this.dan = dan;
		for (int i = 2; i < 10; i+=dan) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i+dan; k++) {
					if(k > 9) break;
					System.out.printf("%d * %d = %d\t", k,j,j*k);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
