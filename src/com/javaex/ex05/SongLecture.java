package com.javaex.ex05;

public class SongLecture {
	
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	
	// 생성자
	public SongLecture() {
		
	}
	// 상황부여 : 발매 직전에 트랙번호가 나와서 현재 넣을 수 없고 나중에 따로 넣어주기로 함
	public SongLecture(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		if(year<0) {
			this.year = 2022;
		}else {
			this.year = year;
		}
		System.out.println("Song(5)");
		
	}
	
	public SongLecture(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist, album, composer, year); // 앞서 작성된 중복코드 끌어다 쓰기(파라미터 5개짜리 생성자),() 안에 파라미터 나열
		this.track = track; // 추가되는 파라미터
		// this와 this()의 차이 : 필드값 vs 파라미터 값
		System.out.println("Song(6)");
	}
	
	// 메소드 getter setter

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	
	// 메소드 일반
	
	@Override
	public String toString() {
		return "SongLecture [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + "]";
	}
	
	//showInfo를 작성하면 완료
	
	
	
}
