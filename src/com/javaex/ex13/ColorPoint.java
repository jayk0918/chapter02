package com.javaex.ex13;

public class ColorPoint extends Point {

	// 필드
	private String color;
	
	// 생성자
	
	ColorPoint(){}
	
	ColorPoint(String color){
		this.color = color;
	}
	
	ColorPoint(int x, int y, String color){
		super.x = x;
		super.y = y;
		this.color = color;
	}
	
	// 메소드 gs
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 메소드 일반
	
	public void showInfo() {
		if(x==0 && y==0) {
			System.out.println(color);
		}else {
			super.showInfo();
			System.out.println(color);
		}
	}
	
	
}
