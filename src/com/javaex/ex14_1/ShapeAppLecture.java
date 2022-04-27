package com.javaex.ex14_1;

public class ShapeAppLecture {

	public static void main(String[] args) {
		
		RectangleLecture[] rArray = new RectangleLecture[2];
		
		RectangleLecture r01 = new RectangleLecture("빨강", "검정", 4, 4);
		RectangleLecture r02 = new RectangleLecture("주황", "검정", 5, 5);
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		TriangleLecture[] tArray = new TriangleLecture[2];
		
		TriangleLecture t01 = new TriangleLecture("빨강", "검정", 4, 4);
		TriangleLecture t02 = new TriangleLecture("보라", "검정", 10, 10);
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		CircleLecture[] cArray = new CircleLecture[2];
		
		CircleLecture c01 = new CircleLecture("보라", "빨강", 3);
		CircleLecture c02 = new CircleLecture("보라", "검정", 3);
		
		cArray[0] = c01;
		cArray[1] = c02;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		
	}

}
