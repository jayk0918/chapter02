package com.javaex.ex04;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자

	public Point() {
	} // 아래 신규 생성자를 만들었으니 default 생성자를 만들어야 함

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this.x = x;
	}

	/*
	 * public Point(int y) { // 자료형, 순서상태로 판별할 수 있지만 int x, int y와 같이 순서 이슈로 2개를 만들
	 * 순 없음 this.y = y; } -> 즉 이 상황에서는 수정이 불가능함 -> setter의 존재 의의
	 */

	// 메소드 getter/setter -> 메뉴 source에서 generate getters/setters 설정 가능
	public void setLineX(int x) {
		this.x = x;
		// x축을 표현하는데 x라는 이름을 사용하는게 적절
		// 그런데 x=x;로 하면 null 오류가 표시됨 (private과 받는 값을 구분을 하지 못함)
		// private 필드에 있는 x를 구체적으로 지칭하기 위해 this.을 첨가
		// this.x = x;로 표현함으로써 필드의 x와(this) 입력을 받는 (int x)의 구분을 명확히 해주는 기능
	}

	public int getLineX() {
		return this.x;
		// this를 써줘도, 안써줘도 됨
		// return 자체가 private int x를 지칭하므로 굳이 작성을 해 줄 의미가 있나 싶음
	}

	public void setLineY(int y) {
		this.y = y;
	}

	public int getLineY() {
		return y;
	}

	// 클래스 구성 순서
	// 1. 필드 결정
	// 2. getter/setter 설정
	// 3. 기본생성자 생성
	// 4. 공통 생성자 생성(모든 필드값 적용)
	// 5. toString()으로 중간확인과정

	// 메소드 일반

	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	/*
	public void delete() {	// 이름을 부여할 수 있지만 헷갈릴 가능성이 있음
		System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
	}
	*/
	
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
	
	
	
}
