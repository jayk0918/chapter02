package com.javaex.ex03;

public class Goods {
	
	// 필드
	private String name;
	private int price;
	// 생성자
	
	// 메소드 - 게터세터(getter/setter) (개발자가 입력행위를 가능하게 해주는 동작 지원 구문)
	// get / set 으로 작명하는게 국룰, 오죽하면 getter/setter라는 별칭이 생겼을까
	
	public void setName(String n) {	// camera.(name)은 private처리되어 접근 불가능, public인 setName으로 접근
		name = n;					// return 값이 무엇인지를 밝혀주어야 함 => 여기서는 없으니 (void)
	}
	
	public void setPrice(int p) {	// 변수명 + (값) => (값)은 저장하고자 하는 값을 써줌
		price = p;
	}
	
	public String getName() {	// setName에서 설정한 name을 getName을 통해서 구현해야 함
		return name;			// 여기서 return값을 name으로 설정하고 void자리에 name의 자료형인 String 첨가
	}
	
	public int getPrice() {
		return price;
	}
	
	
	// 메소드 - 일반
	
	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println();
	}
	
}
