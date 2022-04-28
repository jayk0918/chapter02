package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(3,5);
		p1.draw();
		System.out.println(p1.getX());
		
		Drawable p02 = new Point(100,100);
		// 인터페이스를 위시한 '섞어쓰기'도 사용가능
		p02.draw();
		// p02.getX(); -> 뜨지 않음 (오류)
		
		((Point)p02).getX();
		// 마찬가지로 캐스팅을 통해 Point에서 정의된 getX를 소환 가능
		
		Rectangle r00 = new Rectangle("빨강", "검정", 5, 5);
		r00.draw();
		r00.area();
		
		System.out.println("-----------------");
		Shape r1 = new Rectangle("민트", "민트", 4, 4); 
		System.out.println(r1.area());
		// r01.draw(); -> 에러 발생
		
		Drawable r02 = new Rectangle("빨강", "초록", 10, 10);
		r02.draw();
		// r02.area(); -> 에러 발생
		// r02.getWidth(); -> 에러 발생
		// draw 하나만 사용가능
		// Drawable을 만든 이유? -> 하나의 '도형'으로써 관리하려는 목적이 강했기 떄문
		
		
		// 배열선언
		Drawable[] dArray = new Drawable[4];
		
		// 도형 + point의 공통 : Drawable (Shape 사용 불가능)
		// 하나로 관리하기 위해 다른 많은 것들을 포기한 형태임 ex) Shape에서 구축한 면적 공식 등이 적용되지 않음
		Drawable r01 = new Rectangle("빨강", "검정", 1, 1);
		Drawable c01 = new Circle("빨강", "회색", 3);
		Drawable t01 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8,8);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		// 사각형의 가로값 (캐스팅 활용)
		System.out.println(((Rectangle)dArray[0]).getWidth());
		
		// 사각형의 면의 색 (캐스팅 활용)
		System.out.println(((Shape)dArray[0]).getFillColor());
		
		// 배열에는 Drawable로만 선언되어있기 때문에 for문을 통한 가로&세로값, 면의 색 등 drawable에 없는 요소는 표현 불가능
		
		// instanceof 연산자 => 질문임. (클래스/인터페이스)의 인스턴스인가? -> True/False
		for (int i=0; i<dArray.length; i++) {
			System.out.println(((Shape)dArray[i]) instanceof Shape);
		}	// True * 3, 4번째 인자에서 False이며 오류로 표시됨
		
		// 배열을 통한 면적구하기 (if문 활용)
		for (int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
		
		
		
	}

}
