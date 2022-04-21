package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point line = new Point();
		
		line.setLineX(5);
		line.setLineY(5);
		line.draw();
		
		line.setLineX(10);
		line.setLineY(23);
		line.draw();
	}

}
