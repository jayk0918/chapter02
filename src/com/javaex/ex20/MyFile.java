package com.javaex.ex20;

import java.io.IOException;

public class MyFile {
	
	// 필드
	
	// 생성자
	public MyFile(){}
	
	
	// 메소드 gs
	
	// 메소드 일반
	// 정상적인 경우
	public String read(String path) {
		// path에 있는 파일을 읽고 문자열로 출력
		String result = "학교종이 땡땡땡";
		return result;
	}
	
	
	// 파일이 없는 경우 (IOException 유발 case) (코딩하는 쪽에서 예외처리를 제공해주는 경우)
	public String read2(String path) {
		// 파일이 없을 때
		String result = "";
		try {
			throw new IOException(); //파일이 없는 상황을 강제로 발생 (시뮬레이션)
		} catch (Exception e) {	// 만약 catch하고자 할 예외가 많다면 모든 예외의 부모인 Exception을 통해 일괄제어 가능
			System.out.println(path + " no file");
		}
		
		return result; 
	}
	
	// 사후처리가 불가능할 경우 (사용자 측에게 예외가 발생하였음을 알려주는 경우 -> 제작자가 손을 못 쓸 경우(아몰랑 시전))
	public void read3(String path) throws IOException{
		String result = "";
		System.out.println(result);// println : 오류제거용 코드
		throw new IOException();
	}
	
	
	
	
	
}
