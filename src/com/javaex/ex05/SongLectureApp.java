package com.javaex.ex05;

public class SongLectureApp {

	public static void main(String[] args) {
		
		SongLecture s01 = new SongLecture("좋은날", "아이유", "Real", "이민수", 2010);
		//s01.setTrack(2); 트랙번호 별도 부여 방식
		System.out.println(s01.toString());
		
		
		
		SongLecture s02 = new SongLecture("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		System.out.println(s02.toString());
	}

	
}
