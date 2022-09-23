package example;

import java.util.Scanner;

public class Ex03_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
		int min;
		
		int gcd = 0; // 최대공약수
		int lcm = 0;; // 최소공배수
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		int rem;
		while(max % min >= 0) {
			rem = max % min;
			if (rem == 0) {
				gcd = min;
				lcm = a*b/gcd;
				break;
			} else {
				max = min;
				min = rem;
			}
		}
		System.out.printf("최대공약수 : %d, 최소공배수 : %d",gcd,lcm);
	}

}

// 최대공약수 & 최소공배수