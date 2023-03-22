package com.ezen.biz;


//클래스 생성시 Interface add 해서 Speaker 검색 후 선택 
public class JBLSpeaker implements Speaker {

	public JBLSpeaker() {
		System.out.println("==> JBL Speaker 객체 생성");
	}
	 
	
	@Override
	public void volumeUp() {
	System.out.println("JBL Speaker ==> 소리를 올린다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("JBL Speaker ==> 소리를 내린다.");
	}

}
