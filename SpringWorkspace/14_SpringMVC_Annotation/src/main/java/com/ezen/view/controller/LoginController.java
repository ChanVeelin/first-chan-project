package com.ezen.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.UserVO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do")
	public String login(UserVO vo,UserDAO userDao) {

		System.out.println("로그인 처리 ");
		UserVO user = userDao.getUser(vo);
		
		// 3. 화면 응답 처리
		if (user != null) {
			return "redirect:getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
}
