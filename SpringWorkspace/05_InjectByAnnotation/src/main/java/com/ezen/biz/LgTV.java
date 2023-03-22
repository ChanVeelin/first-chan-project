package com.ezen.biz;


public class LgTV implements TV {
	
	public LgTV() {
		System.out.println("LgTV 객체를 생성합니다.");
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업처리...");
	}
	
	
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전 처리...");
	}
	
	public void powerOn() {
		System.out.println("LgTV : 전원 키기");
	}
	public void powerOff() {
		System.out.println("LgTV : 전원 끄기");
	}
	public void volumeUp() {
		System.out.println("LgTV : 소리 키우기");
	}
	
	public void volumeDown() {
		System.out.println("LgTV : 소리 줄이기");
	}
}
