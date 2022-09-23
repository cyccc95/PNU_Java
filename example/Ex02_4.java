package example;

import java.util.Scanner;

public class Ex02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won = 1350;
		
		System.out.print("입력 : ");
		int dollar = sc.nextInt();
		System.out.printf("입력 : " + dollar + "달러 -> " + dollar*won + "원");
	
	}

}

// 환율 계산