package com.javaex.ex08;

public class Tv {
	
	// 필드
	private int channel;
	private int volume;
	private boolean power;
	
	// 생성자
	public Tv(){}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	
	// 메소드 getter-setter
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	
	// 메소드 일반
	
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
		}else {
			this.power = false;
		}

	}
	
	public void channel(int channel) {
		if(channel>=255) {
			this.channel = 255;
		}else if(channel<=1) {
			this.channel = 1;
		}
	}
	
	public void channel(boolean up) {
		if(up == true) {
			this.channel += 1;
		}else {
			this.channel -= 1;
		}
	}
	
	public void volume(int volume) {
		if(volume>=100) {
			this.volume = 100;
		}else if(volume<=0) {
			this.volume = 0;
		}
	}
	
	public void volume(boolean up) {
		if(up == true) {
			this.volume += 1;
		}else {
			this.volume -= 1;
		}
	}
	
	
	public void status() {
		if(power == false) {
			System.out.println("TV가 꺼져있습니다.");
		}else {
			System.out.println("TV가 켜져있습니다.");
			System.out.println("현재 채널: " + channel);
			System.out.println("현재 볼륨: " + volume);
			
		}
	}
	
	
	
}
