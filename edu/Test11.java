package edu;

public class Test11 {

	public static void main(String[] args) {
		int a1 = 0b00000000000000000000000000001100;
		int b1 = 0b11111111111111111111111111110100;
		System.out.println(a1);
		System.out.println(b1);
		
		int a2 = 017; // 8진수
		int b2 = 0xf; // 16진수
		System.out.println(a2);
		System.out.println(b2);
		
		byte A = 0b00010001;
		byte B = 0b00100010;
		
		int C = A & B; // 0
		System.out.println(Integer.toBinaryString(C));
		int D = A | B; // 110011
		System.out.println(Integer.toBinaryString(D));
		int E = A ^ B; // 110011
		System.out.println(Integer.toBinaryString(E));
		
		int f = 12;
		int g = (~f)+1; // -12
		System.out.println(g);
		
		int h = f << 1; // 24
		int i = f >> 1; // 6
		System.out.println(h);
		System.out.println(i);
		
		char ch = 'A'; // 65 1000001
		ch ^= (1 << 5); //    0100000 => 1100001 : 97 : 'a'
		System.out.println(ch);
		
		
	}

}

// 비트 연산자