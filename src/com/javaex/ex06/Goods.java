package com.javaex.ex06;

public class Goods {
	
	// 필드
	private String name;
	private int price;
	
	// 생성자 -> 메모리에 class를 올리는 일(인스턴스화)를 수행함
	public Goods() {	// class 이름이 대문자이므로 대문자 사용
		// 기본(default)생성자
		// 필요시 로직 작성, 필요 로직이 아예 없다면 생략해도 무방함(그저 안보였을 뿐 존재해왔음)
		// 단, 다른 생성자가 1개라도 존재한다면 무조건 선언을 해 주어야 함 (디폴트가 사라짐_자유도를 위한 희생)
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price; 
	}
	
	public Goods(String name) {
		this.name = name;
		// 상황 : 가격이 아직 정해지지 않았을 때 이름만 받아야 될 경우
		// 기존에 있던 생성자로는 활용 불가능
		// 이름만 표시할 수 있는 생성자를 새로 만들어 적용시킬 수 있음
	}
	
	// 메소드 getter/setter
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	
	
	// 메소드 일반(html 작업)
	
	@Override	//toString : 이클립스 console 내에서 기능이 작동하는지 test용 출력 메소드
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}
