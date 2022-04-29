package com.javaex.ex20;

import java.io.IOException;

public class MyFileApp {
	
	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		
		String str = mf.read2("myFile.txt");
		System.out.println(str);
		
		// read3처럼 사용자측에게 예외를 고지하여주는 경우에는
		// 사용자 측에서 직접 try-catch를 통해 예외처리를 컨트롤해주어야 함
		try {
			mf.read3("myFile.txt");
		} catch (IOException e) {
			System.out.println("****************");
			System.out.println("**파일이 없습니다.**");
			System.out.println("****************");
		}		
		
		
	}
}
