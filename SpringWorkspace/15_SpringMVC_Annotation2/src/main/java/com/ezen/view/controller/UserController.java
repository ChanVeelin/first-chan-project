package com.ezen.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.UserVO;
import com.ezen.biz.service.UsersService;

@Controller
public class UserController {

	@Autowired
	private UsersService userService;
	
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {

	vo.setId("user1");
	vo.setPassword("1234");
	return "login.jsp";
	}
	
	/*
	 * 로그인처리
	 */
	
	
	//로그인
	@RequestMapping(value = "/login.do" , method=RequestMethod.POST)
	public String login(UserVO vo,UserDAO userDao,HttpSession session) {

		System.out.println("로그인 처리 ");
		
		//예외처리 예제
		//ID 혹은 PASSWORD가 입력되지않았을 경우 예외 페이지 표시
		if(vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디가 없네 있어야하는데");
		}
		UserVO user = userService.getUser(vo);
		
		// 3. 화면 응답 처리
		if (user != null) {// 로그인 성공
			session.setAttribute("userName", user.getName());
			
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
	
	//로그아웃
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리 ");
		// 1. 세션 객체 종료
		session.invalidate();
		
		return "login.jsp";
	}
	
	
}
