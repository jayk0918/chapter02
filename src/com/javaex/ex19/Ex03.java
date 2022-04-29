package com.javaex.ex19;

public class Ex03 {

	public static void main(String[] args) {
		
		
		String str = new String("안녕하세요"); 
		// str = null;
		// 주소가 들어갈 자리에 null -> NullPointerException 발생
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("주소값은 없습니다.");
		}
		
		
		
		
		
	}

}
