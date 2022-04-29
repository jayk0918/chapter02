package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 분석
		
		// 필드
		// ?
		// 생성자
		Scanner sc = new Scanner(System.in);
		// system.in => InputStream in
		
		// 메소드 gs
		// ?
				
		// 설계 : num을 input + 100을 0으로 나누고자 함
		// 메소드 일반
		double result;
		int num;
		
		
		num = sc.nextInt();
		// try-catch문
		try {
			result = 100/num;
			// 예외상황 발생가능성이 있는 로직 (num에 0을 넣을 경우 에러 발생)
			// Exception in thread "main" java.lang.ArithmeticException: / by zero
			System.out.println(result);
		} catch (ArithmeticException e) {
			// 이 catch문은 ArithmeticException(0으로 숫자를 나눌때 발생하는 에러)를 감시하는 중
			// 이외 다른 에러는 catch 불가능
			// 만약 이외의 에러를 감지하고자 한다면 catch문을 여러개 작성하여 해결 가능
			System.out.println("0으로 나눌수 없습니다");
		} finally {
			System.out.println("finally 적용");
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
