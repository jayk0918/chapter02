package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song();
		Song bigbang = new Song();
		Song buskerbusker = new Song();
		
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		iu.showInfo();
		
		bigbang.setArtist("BIGBANG");
		bigbang.setTitle("거짓말");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");
		bigbang.showInfo();
		
		buskerbusker.setArtist("버스커버스커");
		buskerbusker.setTitle("벚꽃엔딩");
		buskerbusker.setAlbum("버스커버스커1집");
		buskerbusker.setYear(2012);
		buskerbusker.setTrack(4);
		buskerbusker.setComposer("장범준");
		buskerbusker.showInfo();
		
	}

}
