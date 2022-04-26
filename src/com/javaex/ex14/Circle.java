package com.javaex.ex14;

public class Circle extends Rectangle{
	
	// 필드
	private int radius;
	
	// 생성자
	Circle(){}
	Circle(String fillcolor, String linecolor, int radius){
		super.fillcolor = fillcolor;
		super.linecolor = linecolor;
		this.radius = radius;
	}
	
	// 메소드 gs
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 메소드 일반
	
	public void draw() {
		System.out.println("면색: " + super.fillcolor + ", 선색: " + super.linecolor + ", 반지름 " + this.radius + " 원을 그렸습니다.");
	}
	
	
	
	
	
}
