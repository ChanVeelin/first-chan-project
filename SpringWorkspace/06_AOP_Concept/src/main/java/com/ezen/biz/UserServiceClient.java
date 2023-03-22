package com.ezen.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.biz.dto.UsersVO;
import com.ezen.biz.service.UsersService;

public class UserServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		UsersService usersService = (UsersService) container.getBean("UsersService");
		
		UsersVO user = new UsersVO();
		user.setId("user1");
		user.setPassword("1234");
		
		UsersVO result = usersService.getUsers(user);
		if(result != null) {
			System.out.println("로그인 성공");
			System.out.println("사용자 정보 : " + result);
		}else {
			System.out.println("로그인 실패");
		}
			container.close();
	}

}
