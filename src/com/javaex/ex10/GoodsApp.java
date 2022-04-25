package com.javaex.ex10;

public class GoodsApp {
	// static 사전 조사
	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘",400000);
		System.out.println(Goods.count());
		Goods laptop = new Goods();
		
		laptop.setName("LG그램");
		laptop.setPrice(900000);
		System.out.println(Goods.count());
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(Goods.count());
		
		
		System.out.println(camera.toString());
		System.out.println(laptop.toString()); // count되지 않음
		System.out.println(cup.toString());	// count되지 않음
		
	}

}
