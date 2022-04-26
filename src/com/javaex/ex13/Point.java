package com.javaex.ex13;

public class Point {
	
	// 필드
	protected int x;
	protected int y;
	
	// 생성자
	
	Point(){}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	// 메소드 gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 일반
	public void showInfo() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
}
