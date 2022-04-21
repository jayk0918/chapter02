package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods laptop = new Goods();
		Goods cup = new Goods();
		Goods product = new Goods();
		
		product.nameTag = "상품이름: "; 	// 직접 class를 호출해서 의미/값 부여 : 직접 방식
		product.priceTag = "가격: ";		// 그러나 대부분의 class는 private으로 접근을 불허하기 때문에 값 부여를 위한 다른 방안을 강구해야 함
		
		camera.name = "니콘";
		camera.price = 400000;
		
		laptop.name = "LG그램";
		laptop.price = 900000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(product.nameTag + camera.name + "\t" + product.priceTag + camera.price);
		System.out.println(product.nameTag + laptop.name + "\t" + product.priceTag + laptop.price);
		System.out.println(product.nameTag + cup.name + "\t" + product.priceTag + cup.price);
		
		/* Goods camera = new Goods();
		 * camera.name = "니콘";
		 * camera.price = 400000;
		 */
		
		
	}

}
