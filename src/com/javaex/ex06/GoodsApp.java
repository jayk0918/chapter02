package com.javaex.ex06;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		
		Goods camera = new Goods();
		camera.setName("Nikkon");
		camera.setPrice(400000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		Goods book = new Goods("검은방", 20000);
		// 생성자에 로직을 작성하여 축약 서술 가능
		
		
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println(book.toString());
		
	}
	
	
}
