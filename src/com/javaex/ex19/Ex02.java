package com.javaex.ex19;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[]{3,6,9};
		
		try {
			System.out.println(intArray[3]);
			// intArray 배열에는 [0]~[2]까지만 존재, [3]은 없음(에러발생사유)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getCause());
			System.out.println("배열의 범위를 벗어남");
		} finally {
			System.out.println("finally 영역");
			//보통 생략을 많이 하는 편(할게 없음)
		}
		
		
		
		
		
		
		
		
	}

}
