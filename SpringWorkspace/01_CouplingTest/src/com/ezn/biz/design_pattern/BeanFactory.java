package com.ezn.biz.design_pattern;

/*
 * Run -> Configurations -> JAVAapplication 선택 -> 파일 선택 - > Arguments에 명령어 입력 
 */

public class BeanFactory {
	
	public Object getBean( String beanName) {
		if(beanName.equals("samsung")) {
		
		
		return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
