package example;

import java.util.Scanner;

public class Ex03_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String animal = "";
		switch (year%12) {
			case 0: animal = "원숭이띠"; break;
			case 1: animal = "닭띠"; break;
			case 2: animal = "개띠"; break;
			case 3: animal = "돼지띠"; break;
			case 4: animal = "쥐띠"; break;
			case 5: animal = "소띠"; break;
			case 6: animal = "호랑이띠"; break;
			case 7: animal = "토끼띠"; break;
			case 8: animal = "용띠"; break;
			case 9: animal = "뱀띠"; break;
			case 10: animal = "말띠"; break;
			case 11: animal = "양띠"; break;
		}
		System.out.println(year + "년 => " + animal);
	}
	
}

// switch of if-else