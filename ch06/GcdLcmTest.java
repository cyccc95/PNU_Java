package com.ruby.java.ch06;

import java.util.Scanner;

public class GcdLcmTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		GcdLcm gl = new GcdLcm(a,b);
		gl.print();
		
	}

}
