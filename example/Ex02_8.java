package example;

import java.util.Scanner;

public class Ex02_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int discountPrice = price/1000*1000;
		
		// 순서대로 5만원, 1만원, 5천원, 1천원
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		if(discountPrice >= 50000) {
			a = discountPrice / 50000;
			discountPrice %= 50000;
		}
		if(discountPrice >= 10000) {
			b = discountPrice / 10000;
			discountPrice %= 10000;
		}
		if(discountPrice >= 5000) {
			c = discountPrice / 5000;
			discountPrice %= 5000;
		}
		if(discountPrice >= 1000) {
			d = discountPrice / 1000;
		}
		
		System.out.println("5만원 : " + a + "장");
		System.out.println("1만원 : " + b + "장");
		System.out.println("5천원 : " + c + "장");
		System.out.println("1천원 : " + d + "장");
		
		
	}

}

// 최소 지폐 수 계산