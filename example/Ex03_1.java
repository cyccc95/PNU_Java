package example;

import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				continue;
			}
			oddSum += i;
		}
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				continue;
			}
			evenSum += i;
		}
		System.out.println("전체 합 : " + sum);
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		
	}

}

// 수치 합
