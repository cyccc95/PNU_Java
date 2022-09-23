package example;

import java.util.Scanner;

public class Ex03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("각 선택 : ");
		int sel = sc.nextInt();
		
		if(sel == 3) {
			System.out.print("너비, 높이 : ");
			int w = sc.nextInt();
			int h = sc.nextInt();
			System.out.printf("삼각형 : 너비 - %d, 높이 - %d, 면적 : %d",w,h,w*h/2);
		} else if(sel == 4) {
			System.out.print("밑변, 높이 : ");
			int w = sc.nextInt();
			int h = sc.nextInt();
			System.out.printf("사각형 : 밑변 - %d, 높이 - %d, 면적 : %d",w,h,w*h);
		}
		
		
		
	}

}

// 도형 면적 계산