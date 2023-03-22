package com.ezen.view.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;


@Controller
public class GetBoardListController {

	@RequestMapping(value="/getBoardList.do")
	public ModelAndView getBoardList(BoardDAO boardDao,ModelAndView modelView) {
		System.out.println("게시글 목록 검색 처리");
		// DB 연동 처리
		List<BoardVO> boardList = boardDao.getBoardList();
		
		//결과 출력화면 지정

		modelView.addObject("boardList",boardList);
		modelView.setViewName("getBoardList.jsp");
		
		return modelView;
	}

}
