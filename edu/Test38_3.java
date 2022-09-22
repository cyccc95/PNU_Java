package edu;

import java.util.Scanner;

public class Test38_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		
		int[][] arr1 = new int[row1][col1];
		int[][] arr2 = new int[col1][row1];
		
		// 행렬 출력
		System.out.println("arr1");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr1[i][j] = (int)(Math.random()*10);
				System.out.printf(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 전치 행렬 출력
		System.out.println("arr2");
		for (int i = 0; i < col1; i++) {
			for (int j = 0; j < row1; j++) {
				arr2[i][j] = arr1[j][i];
				System.out.printf(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}

// 전치 행렬
