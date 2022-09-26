package com.ruby.java.ch07.abstraction;

public interface Messenger {
	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;
	// compile시 자동으로 public static final 추가

	public abstract String getMessage();

	public abstract void setMessage(String msg);
	// interface method는 구현 목적이 아니라 형식, public abstract 자동 추가
	
	
	// interface에서 본문을 갖는 method
	public default void setLogin(boolean login) {  
		log();
		if(login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다.");
		}
	}
	// default method는 interface를 사용하는 모든 class에서
	
	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}
	// static method는 프로그램 시작 시 메모리에 사용 준비가 되므로
	// instance 생성과 상관없이 사용 가능
	
	private void log() {
		System.out.println("start job!");
	}
	// private method는 동일한 interface에 선언된 default method에서만 사용
}

// interface
