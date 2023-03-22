package com.ezen.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;

public class GetBoardController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("상세 게시글 조회 ");
		
		String seq = request.getParameter("seq");

		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDao = new BoardDAO();
		BoardVO board = boardDao.getBoard(vo);
		
		// 응답 화면 구성
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("board",board);
		modelView.setViewName("getBoard");
		return modelView;
	}

}
