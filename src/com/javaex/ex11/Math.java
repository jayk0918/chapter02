package com.javaex.ex11;

public class Math {
	
	// 필드
	private static double pi = 3.14;
	
	
	// 생성자
	
	// 메소드 gs
	
	// 메소드 일반
	
	public static int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static double plus(double a, int b) {
		double sum = a + b;
		return sum;
	}
	// 위 2개의 계산식이 자주 사용될 것 같고, 다른 사람들과 협업이 이루어 질 때
	// -> 할때마다 Math math = new Math();은 노가다이기 때문에
	// 이 2개식을 아예 static으로 올려버리면 더 편해지지 않을까
	// 다만 자주 쓰는 식이 아니고 어쩌다가 한 번씩 쓰는 식은 굳이 static에 올리기보단 메소드(일반)자리에 배치하는게 더 나을것임
	// 주의 : static에 올리는 과정 -> 메모리에 올리는 것. / 하드에 있는 내용을 끌어다가 적용하는 것이 아님
	
	
	public static double circleArea(int radius) {
		double area = radius * radius * pi;
		return area;
	}
	
	
	
	
}
