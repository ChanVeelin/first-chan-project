package com.ezen.view.controller;

public class ViewResolver {

	public String prefix;
	public String suffix;
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	/*
	 * view 파일의 결로와 확장자를 결합
	 * 입력 파라미터 : 
	 * 		getView : 콘트롤러에서 전달된 화면 명
	 */
		public String getView(String viewName) {
			
			return prefix+viewName + suffix;
		}
	
}
