package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘",400000);
		Goods laptop = new Goods("LG그램",900000);
		Goods cup = new Goods("머그컵", 2000);
		
		/*camera.showInfo();
		laptop.showInfo();
		cup.showInfo();*/
		//showInfo를 수십-수백개 이상 할 수 있으니 배열로 처리하여 일괄 출력
		
		Goods[]goodsArray = new Goods[3];
		// Goods 주소가 적용된 [](배열) + 변수명 = new(생성) Goods[배열 length]
		// 배열 안에 camera의 이름, 가격등의 정보를 전부 떄려 넣을 수가 없음
		// '주소'관리개념, camera의 이름과 가격등의 정보가 전개된 주소로 링크를 걸어주는 것
		
		goodsArray[0] = camera; // camera의 좌표 링크
		goodsArray[1] = laptop; 
		goodsArray[2] = cup; 
		
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[2].getPrice());
		System.out.println(goodsArray[1].toString());
		
		System.out.println("=================================");
		
		for(int i=0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();	
			// goodsArray[i]에 0~2번째 주소들이 포진해있음
			// 따라서 해당 주소에 .showInfo();는 (camera=변수명).showInfo();와 같은 효과
			// 다만 goodsArray[i].name과 같이 필드값에 private으로 막혀있는 변수명의 경우는 접근 불가
			// getter/setter 혹은 메소드(일반)에 의해 정의된 방법으로 접근해야 함
		}
		
	}

}
