package edu;

public class Test36 {

	public static void main(String[] args) {
		char letter = 'A';
		char[] alphabet = new char[26];
		
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);
		}
		for (char c : alphabet) {
			System.out.println(c);
		}
		
		
		
		int[] score = {90,85,78,100,98};
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 총점
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
			
		}
		avg = sum/score.length;
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}


// 배열 활용 실습