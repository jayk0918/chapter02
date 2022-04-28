package com.javaex.ex18;

public class Point implements Drawable {
	// interface를 상속받기 위해서는 class + (클래스 명) + implements + (인터페이스 명)
	// draw() 메소드를 정의해주어야 오류가 해소됨
	
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
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
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw(){
		System.out.println("[x=" + x + ", y=" + y + "] 점을 그렸습니다.");
	}

	

	

	
	
}
