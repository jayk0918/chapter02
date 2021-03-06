package com.javaex.ex14_2;

public class Rectangle {
	
	// 설계 : Rectangle을 기준으로 -> Triangle & Circle에 상속시키되 각자 다른 점은 거기서 세팅
	
	// 필드
	protected String fillcolor;
	protected String linecolor;
	protected int width;
	protected int height;
	
	// 생성자
	Rectangle(){}
	Rectangle(String fillcolor, String linecolor, int width, int height){
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		this.width = width;
		this.height = height;
	}
	
	
	// 메소드 gs
	public String getFillcolor() {
		return fillcolor;
	}
	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}
	public String getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}
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
		return "Rectangle [fillcolor=" + fillcolor + ", linecolor=" + linecolor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("면색: " + fillcolor + ", 선색: " + linecolor + ", 가로 : " + width + ", 세로: " + height + " 사각형을 그렸습니다.");
	}
	
	
}
