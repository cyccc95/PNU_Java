package example;

import java.util.Scanner;

public class Ex03_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		
	}

}

// 소수 판단