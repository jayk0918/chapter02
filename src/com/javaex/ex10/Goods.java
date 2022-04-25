package com.javaex.ex10;

public class Goods {
	
	//필드
	private String name;
	private int price;
	//private int count; // 목적 : Goods 내에 물건이 늘어날 때 마다 개수를 count
	public static int count; // static => 1순위 조사대상
	
	//생성자
	public Goods(){
		count += 1;
	} //default
	
	public Goods(String name, int price){
		this.name = name;
		this.price = price;
		count += 1; // 문제점 : default 생성자로 만든건 해당되지 않음
		// 자기의 바운더리 안에서만 카운트하기 때문에 0-1사이에서 놈
		// 상위계층 개념인 static을 활용해야 함 (static > stack > hip)
		// static은 this 사용 불가능
		// 단순 배열의 수를 count함으로써 개수를 파악하는 것은 권장하지 않음. 실제로는 동작의 개수를 통해 전체적인 count를 판별하도록 코드를 구성함.
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*public void setCount(int count) {	// count 값이 임의로 지정될 가능성이 있기에 작성하는 것을 추천하지 않음
		this.count = count;
	}*/

	
	//메소드 일반
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println();
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public static int count() {
		return count;
	}
}
