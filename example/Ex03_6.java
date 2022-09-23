package example;

import java.util.Scanner;

public class Ex03_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원금(a원) : ");
		int a = sc.nextInt();

		System.out.print("만기(n년) : ");
		int n = sc.nextInt();

		System.out.print("연 복리(r%) : ");
		int r = sc.nextInt();
	
		double s = a;
		for (int i = 0; i < n; i++) {
			s *= (1+0.01*r);
		}
		System.out.printf("만기 금액 : %.0f원",s);
		
	}

}

// 예금 복리 계산