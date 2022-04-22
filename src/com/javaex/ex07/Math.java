package com.javaex.ex07;

public class Math {
	
	// 필드
	
	// 생성자
	// public Math() {} -> 기본 생성자
	
	// 메소드 getter/setter
	
	// 메소드 일반 - plus 만들기
	public int plus(int a, int b) { // 정수 + 정수
		return a+b;
	}
	
	public double plus(double a, int b) { // 실수 + 정수
		return a+b;
	}
	
	public double plus(int a, double b) { // 정수 + 실수
		return a+b;
	}
	
	public double plus(double a, double b) { // 실수 + 실수
		return a+b;
	}
	
	// 자료형이 다르기 때문에 4개를 생성해야 함 (실제 현장에서는 계산법이나 다른 옵션이 추가될 수 있음)
	
}
