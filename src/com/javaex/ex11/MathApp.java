package com.javaex.ex11;

public class MathApp {

	public static void main(String[] args) {
		
		System.out.println(Math.plus(3, 2));
		// 기존에는 Math.math = new Math();을 선언한 후
		// math.plus(3,2)를 통해 5를 출력했다라면
		// static으로 올린 plus공식은 선언을 생략하고 곧바로 Math.plus(3,2)로 5 도출 가능
		// 이 때, static의 공식이므로 대문자 Math.plus로 선언해야 적용 가능
		
		System.out.println(Math.circleArea(5));
		// 변수이름이 math.~~~과 같이 소문자로 이루어지면 보통 메소드로 해석하고
		// Math.~~과 같이 대문자로 이루어지면 스태틱으로 해석하는 것이 일반적
		
		
	}

}
