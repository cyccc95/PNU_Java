package example;

import java.util.Scanner;

public class Ex03_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(n));
	}

}

// 이진수로 변환