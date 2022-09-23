package example;

import java.util.Scanner;

public class Ex02_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 1000;
		int t = sc.nextInt();
		double xt = x - 9.81*t*t/2;
		System.out.printf("%d초 후 위치 : %.2fm",t,xt);
	}

}

// 자유 낙하 물체의 위치 구하기