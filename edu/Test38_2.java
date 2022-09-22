package edu;

import java.util.Scanner;

public class Test38_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		int[][] arr1 = new int[row1][col1];
		int[][] arr2 = new int[row2][col2];
		
		// 각 행렬 출력
		System.out.println("arr1");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr1[i][j] = (int)(Math.random()*10);
				System.out.printf(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("arr2");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				arr2[i][j] = (int)(Math.random()*10);
				System.out.printf(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 두 행렬의 합
		if (row1 == row2 && col1 == col2) {
			System.out.println("합");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					System.out.printf(arr1[i][j]+arr2[i][j] + "\t");
				}
				System.out.println();
			}
		}
		
		// 두 행렬의 곱
		if (col1 == row2) {
			int[][] arr3 = new int[row1][col2];
			System.out.println("곱");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					for (int k = 0; k < col1; k++) {
						arr3[i][j] += (arr1[i][k]*arr2[k][j]);
					}
					System.out.printf(arr3[i][j] + "\t");
				}
				System.out.println();
			}
		}
		
	}

}

// 2차원 배열의 합, 곱
