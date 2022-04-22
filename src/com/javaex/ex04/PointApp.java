package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point line1 = new Point();
		Point line2 = new Point();

		line1.setLineX(5);
		line1.setLineY(5);
		line1.draw();

		line2.setLineX(10);
		line2.setLineY(23);
		line2.draw();

		// 기존에 line이라는 1개의 변수만 사용했었음

		Point line3 = new Point(10, 20);
		line3.draw();

		Point line4 = new Point(100);
		line4.setLineY(200);
		line4.draw();

		Point line5 = new Point(20, 40);
		line5.setLineX(50);
		
		line5.draw(true); // 그리기
		line5.draw(false); // 지우기
		
	//	line5.delete();
	//	line5.draw(false);  T/F처리로 delete를 표현한다면 더 편하지 않을까?
		
	}

}
