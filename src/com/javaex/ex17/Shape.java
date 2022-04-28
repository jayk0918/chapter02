package com.javaex.ex17;

public abstract class Shape {		// 추상 클래스로 설계
	// '추상'개념 : 값이 없는 추상적인 메소드를 정의하고자 할 때 가상의 반드시 그 클래스는 추상 클래스화 해야 함
	// 추상클래스는 단독으로 메모리에 올라가지 않아야 함 (단독으로 메모리에 올라간다는 것 자체가 개념적으로 잘못됨)
	// 반드시 빅 픽쳐가 수반된 상태로 올라가야 함
	
	// 필드
	protected String fillColor;
	protected String lineColor;
	
	// 생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	// 메소드 gs
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public abstract void draw();	// {}로 표현되는 method-body가 없어야 함 (내용이 있으면 안됨)
	public abstract double area();	// 추상 클래스의 목적 : 자식클래스의 override용
	// 부모클래스에서 선언한 추상 메소드들은 자식클래스에게 위 추상 메소드들의 정의를 강요함(반드시 쓰여야 함)
	
}
