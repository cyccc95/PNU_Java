package example;

import java.util.Scanner;

public class Ex03_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1 y1 x2 y2 x3 y3 x4 y4 입력");
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		double x3 = sc.nextInt();
		double y3 = sc.nextInt();
		double x4 = sc.nextInt();
		double y4 = sc.nextInt();
		
		double x = ((x1*y2 - y1*x2)*(x3-x4) - (x1-x2)*(x3*y4 - y3*x4))
				/ ((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4));
		double y = ((x1*y2 - y1*x2)*(y3-y4) - (y1-y2)*(x3*y4 - y3*x4))
				/ ((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4));
		
		System.out.println(x + ", " + y);
	}

}

// 두 직선의 교차점