package com.javaex.ex14_2;

public class FigureApp {

	public static void main(String[] args) {
		
		Rectangle[] rectangle = new Rectangle[2];
		Triangle[] triangle = new Triangle[2];
		Circle[] circle = new Circle[2];
		
		rectangle[0] = new Rectangle("빨강", "검정", 4, 4);
		rectangle[1] = new Rectangle("주황", "검정", 5, 5);
		for(int i=0; i<rectangle.length; i++) {
			rectangle[i].draw();
		}
		
		triangle[0] = new Triangle("빨강", "검정", 4, 4);
		triangle[1] = new Triangle("보라", "검정", 10, 10);
		for(int i=0; i<triangle.length; i++) {
			triangle[i].draw();
		}
		
		circle[0] = new Circle("보라", "빨강", 3);
		circle[1] = new Circle("보라", "검정", 3);
		for(int i=0; i<circle.length; i++) {
			circle[i].draw();
		}
		
		
		
		
	}

}
