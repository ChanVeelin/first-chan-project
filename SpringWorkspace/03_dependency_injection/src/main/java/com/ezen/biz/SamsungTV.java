package com.ezen.biz;

public class SamsungTV implements TV {
	
	
	
	private BoseSpeaker speaker;
	private int price;
	
	public SamsungTV() {	
		System.out.println("==> SamsungTV 객체생성");
	}
	
	
	public SamsungTV(BoseSpeaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
	}


	public SamsungTV(BoseSpeaker speaker) {
		System.out.println("==> SamsungTV 객체생성");
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV : 전원 키기");
		System.out.println("price="+ price);
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV : 전원 끄기");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();//speaker 객체를 이용하여 기능설정
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
