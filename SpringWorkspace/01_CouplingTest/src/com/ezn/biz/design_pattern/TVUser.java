package com.ezn.biz.design_pattern;

public class TVUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv= (TV)factory.getBean(args[0]);//Bean== 오브젝트 타입
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
