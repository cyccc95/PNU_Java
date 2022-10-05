package com.ruby.java.ch08.anonymousClass;

public class MessengerTest {

	public static void main(String[] args) {
		Messenger test = new Messenger() {
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 " + msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
		
	}

}

// anonymous class
// 익명 클래스는 클래스 선언과 동시에 힙에 인스턴스가 생성된 후
// test 변수에 생성된 인스턴스의 주솟값을 저장합니다.
// 익명 클래스는 이름이 없기 때문에 참조변수의 타입과 new 명령문에서
// 사용하는 객체 이름을 상속받는 객체(인터페이스 또는 클래스)를 지정합니다.