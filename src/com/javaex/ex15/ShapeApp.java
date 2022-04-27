package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*Shape s01 = new Shape("빨강", "보라");
		System.out.println(s01.toString());
		s01.draw();*/
		
		//////// 배열 (사각형, 삼각형, 원) ////////
		Rectangle[] rArray = new Rectangle[2];
		Triangle[] tArray = new Triangle[2];
		Circle[] cArray = new Circle[2];
		
		
		//////// 사각형 ////////
		Rectangle r01 = new Rectangle("빨강", "검정", 4, 4);
		Rectangle r02 = new Rectangle("파랑", "검정", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//////// 삼각형 ////////
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		Triangle t02 = new Triangle("보라", "검정", 10, 10);
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		//////// 원 ////////
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		
		cArray[0] = c01;
		cArray[1] = c02;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
	}

}
