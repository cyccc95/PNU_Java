package example;

import java.util.Scanner;

public class Ex03_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
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

// 구구단
