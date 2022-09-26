package com.ruby.java.ch06;

class Point {
//	private int x ,y;
	int x,y;
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getPoint() {
		System.out.printf("point : %d, %d\n",x,y);
	}
}

public class TestPoint {

	public static void main(String[] args) {
		Point p = new Point();
		p.setPoint(10,20);
		p.getPoint();
		
		p.x = 15; // private으로 선언하면 오류
		p.getPoint();
	}

}

// class 연습