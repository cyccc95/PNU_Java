package example;

import java.util.Scanner;

public class Ex03_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		String whatYear = "";
		
		if (year%100 == 0 && year%400 != 0) {
			whatYear = "평년";
		} else if(year%4 == 0) {
			whatYear = "윤년";
		} else {
			whatYear = "평년";
		}
		
		System.out.println(year + "년은 " + whatYear + "입니다.");
	}

}

// 윤년 검사
