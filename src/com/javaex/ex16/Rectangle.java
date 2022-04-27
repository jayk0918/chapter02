package com.javaex.ex16;

public class Rectangle extends Shape{
	
	// 필드
	private int width;
	private int height;
	
	// 생성자
	public Rectangle() {
		super();	// 아무것도 써주지 않으면 생략된 상태로 자연스럽게 작동함
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		
	}
	
	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	// 메소드 일반
	
	/*@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + super.getFillColor()
				+ ", getLineColor()=" + super.getLineColor() + "]";
	}	// 부모클래스 필드값을 protected로 전환한다면 fillColor, lineColor 변수명을 그대로 사용가능*/
	
	@Override
	public String toString() {
		return "Rectangle [width=" + this.width + ", height=" + this.height + ", fillColor=" + super.fillColor + ", lineColor="
				+ super.lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + super.fillColor + ", 선색:" + super.lineColor + 
		                   ", 가로:" + this.width + ", 세로:" + this.height + 
		                   "] 사각형을 그렸습니다. " );
	}

	public double area() {
		double area = width * height;
		return area;
	}
	
	
	
}
