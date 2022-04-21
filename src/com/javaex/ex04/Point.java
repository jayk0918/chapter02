package com.javaex.ex04;

public class Point {
	
	// 필드
	private int x;
	private int y;
	
	// 생성자
	
	// 메소드 getter/setter
	public void setLineX(int LineX) {
		x = LineX;
	}
	
	public int getLineX(){
		return x;
	}
	
	public void setLineY(int LineY) {
		y = LineY;
	}
	
	public int getLineY() {
		return y;
	}
	
	// 메소드 일반
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다." );
	}
	
}
