package example;

import java.util.Scanner;

public class Ex02_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("곱 : %d * %d = %d\n",x,y,x*y);
		System.out.printf("몫 : %d / %d = %d\n",x,y,x/y);
		System.out.printf("나머지 : %d - (%d * %d) = %d\n",x,y,x/y,x%y);
	}

}

// 두 수의 곱, 몫, 나머지