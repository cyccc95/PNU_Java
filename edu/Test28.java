package edu;

public class Test28 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
			System.out.println("OK");
			cnt += 2;
			if (cnt == 10) {
				break;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) continue;
			System.out.println(i);
		}
	}

}

// 반복문 제어 : break, continue