package com.ruby.java.ch11;

class NagativeNumberException extends Exception{
	public NagativeNumberException() {
		super("음수는 허용하지 않습니다");
	}
}

public class Test04 {

	int battery = 0;
	
	public void charge(int time) {
		if(time < 0) {
			time = 0;
			try {
				throw new NagativeNumberException();
			} catch(NagativeNumberException e) {
				e.printStackTrace();
			}
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
	
	public static void main(String[] args) {
		Test04 test = new Test04();
		test.charge(30);
		test.charge(20);
		test.charge(-10);
		
	}

}

// 사용자 정의 예외 객체