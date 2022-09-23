package example;

import java.util.Scanner;

public class Ex03_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(score + "점 -> " + grade(score));
	}
	
	public static String grade(int score) {
		if(score >= 95) {
			return "A+";
		} else if(score >= 90) {
			return "A0";
		} else if(score >= 85) {
			return "B+";
		} else if(score >= 80) {
			return "B0";
		} else if(score >= 75) {
			return "C+";
		} else if(score >= 70) {
			return "C0";
		} else if(score >= 65) {
			return "D+";
		} else if(score >= 60) {
			return "D0";
		} else {
			return "F";
		}
		
	}

}

// 시험 성적 확인
