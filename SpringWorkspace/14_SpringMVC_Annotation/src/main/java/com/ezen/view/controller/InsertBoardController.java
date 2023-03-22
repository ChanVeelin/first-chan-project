package com.ezen.view.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dto.BoardVO;

@Controller
public class InsertBoardController   {
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO){//커맨드 파라메타 or 커맨드 객체
		System.out.println("게시글 등록 처리... ");
			
		
		boardDAO.insertBoard(vo);
		
		
		return "getBoardList.do";
	}

}
