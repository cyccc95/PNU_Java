package com.ruby.java.ch07.abstraction;

public interface GraphicIOS {
	public default void draw_textBox() {
		System.out.println("텍스트 상자를 그린다.");
	}
	
	public default void draw_submitButton() {
		System.out.println("전송버튼을 누른다");
	}
}

// interface 3