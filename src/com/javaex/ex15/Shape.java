package com.javaex.ex15;

public class Shape {		// 부모 클래스로 설계
	
	// 필드
	protected String fillColor;	// 자식 클래스에게 상속을 할 계획이 있다면 사전에 protected를 쓰는게 괜찮은 방법
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
	
	// 여기는 부모클래스 -> draw가 필요한건 맞지만 여기서 선언을 해버린다?
	/*public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + "] 도형을 그렸습니다. " );
	}*/

	
	
	
	
}
