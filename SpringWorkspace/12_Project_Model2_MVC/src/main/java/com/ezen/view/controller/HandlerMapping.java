package com.ezen.view.controller;

import java.util.*;

public class HandlerMapping {
	
	//url 요청에 대한 대응하는 클래스 정보 저장
	private Map<String, Controller> mappings;
	
	//생성자
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/logout.do", new LogoutController());
	}

/*
 *url 키에 대해서 Controller 객체를 제공하는 메소드 
 */
	public Controller getController(String path) {
		return mappings.get(path);
	}
}