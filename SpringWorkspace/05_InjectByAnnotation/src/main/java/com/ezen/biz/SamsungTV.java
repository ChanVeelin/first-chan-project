package com.ezen.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	
	//@Autowired	
	//@Qualifier("jbl")
	@Resource(name="tv")
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {	
		System.out.println("==> SamsungTV 객체생성");
	}
	
	
	public SamsungTV(Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
	}


	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV 객체생성");
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}


	public void setPrice(int price) {
		this.price = price;
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
