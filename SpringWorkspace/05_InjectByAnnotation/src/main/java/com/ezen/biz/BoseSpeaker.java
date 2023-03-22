package com.ezen.biz;

import org.springframework.stereotype.Component;

@Component("bose")
public class BoseSpeaker implements Speaker {
	
	public BoseSpeaker() {
		System.out.println("===> Bose Speakers 객체 생성");
		
	}
	
	
	@Override
	public void volumeUp() {
		System.out.println("===> Bose Speakers : 소리를 올린다.");
	}
	@Override
	public void volumeDown() {
		System.out.println("===> Bose Speakers : 소리를 내린다.");
	}
	
}
