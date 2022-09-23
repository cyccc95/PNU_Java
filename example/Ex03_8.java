package example;

import java.util.Scanner;

public class Ex03_8 {

	public static void main(String[] args) {
		isPass();
	}	
	
	public static void isPass() {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 과목 점수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		float avg = sum/3.0f;
		System.out.printf("총계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		String pass = 
			(avg >= 70 && a > 60 && b > 60 && c > 60) ? "통과" : "과락";
		System.out.println("-> " + pass);
	}
}

// 삼항 연산자