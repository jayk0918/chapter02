package com.javaex.ex17;

public class Rectangle extends Shape{
	
	// 필드
	private int width;
	private int height;
	
	// 생성자
	public Rectangle() {
		super();
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
	@Override
	public String toString() {
		return "Rectangle [width=" + this.width + ", height=" + this.height + ", fillColor=" + super.fillColor + ", lineColor="
				+ super.lineColor + "]";
	}
	
	
	// 추상화된 클래스를 상속받은 자식 클래스는 반드시 추상화된 모든 메소드를 정의하여 선언해야 함
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
