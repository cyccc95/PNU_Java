package example;

import java.util.Scanner;

public class Ex02_6 {

	public static void main(String[] args) {
		double light = 300000;
		System.out.printf("광속 : %.0fm/s\n", light);
		System.out.printf("분속 : %.0fkm/m\n", light/60);
		System.out.printf("시속 : %.1fkm/h\n", light/3600);
		System.out.printf("마하 : %.1fmach\n", light/340);
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("시속 (km/h) : ");
		double v = sc.nextDouble();
		System.out.printf("분속 : %.1fkm/m\n", v*60);
		System.out.printf("초속 : %.1fkm/s\n", v*3600);
		System.out.printf("마하 : %.1fmach\n", v*3600/340);
		
	}

}

// 데이터 단위 변환