package com.javaex.ex17;

import com.javaex.ex16.Circle;
import com.javaex.ex16.Rectangle;
import com.javaex.ex16.Shape;
import com.javaex.ex16.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Shape -> 추상클래스
		//Rectangle r = new Rectangle("빨강", "검정", 100, 1000);
		
		// Shape 배열 생성
		Shape[] sArray = new Shape[6];
		
		// 사각형 2개
		Shape r01 = new Rectangle("보라", "빨강", 4, 4); 
		Shape r02 = new Rectangle("초록", "파랑", 2, 2);
		
		// 삼각형 2개
		Shape t01 = new Triangle("노랑", "청록", 3, 3);
		Shape t02 = new Triangle("파랑", "검정", 10, 10);
		
		// 원 2개
		Shape c01 = new Circle("검정", "하양", 5);
		Shape c02 = new Circle("민트", "민트", 7);
		
		// 배열에 담기
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = t01;
		sArray[3] = t02;
		sArray[4] = c01;
		sArray[5] = c02;
		
		System.out.println(sArray[0].toString());
		
		sArray[0].draw();
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}

	}

}
