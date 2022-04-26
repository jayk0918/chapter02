package com.javaex.ex14;

public class Triangle extends Rectangle{
	
	// 필드
	
	// 생성자
	Triangle(){}
	Triangle(String fillcolor, String linecolor, int width, int height){
		super.fillcolor = fillcolor;
		super.linecolor = linecolor;
		super.width = width;
		super.height = height;
	}
	
	
	// 메소드 gs
	
	
	// 메소드 일반
	@Override
	public String toString() {
		return "Triangle [getFillcolor()=" + super.getFillcolor() + ", getLinecolor()=" + super.getLinecolor() + ", getWidth()="
				+ super.getWidth() + ", getHeight()=" + super.getHeight() + ", toString()=" + super.toString() + ", getClass()="
				+ super.getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public void draw() {
		System.out.println("면색: " + super.fillcolor + ", 선색: " + super.linecolor + ", 가로 : " + super.width + ", 세로: " + super.height + " 삼각형을 그렸습니다.");
	}
	
	
}
