package com.ezen.biz.board;

import java.util.ArrayList;
import java.util.List;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.BoardVO;
import com.ezen.biz.dto.UserVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		BoardVO vo =new BoardVO();
		BoardDAO boardDao = new BoardDAO();
		vo.setTitle("Mybatis 연습");
		vo.setWriter("홍길동");
		vo.setContent("Mybatis 이용 MVC 구현");
		vo.setSearchKeyword("");
			
	//	boardDao.insertBoard(vo);
		List<BoardVO> boardList = new ArrayList<>();
		boardList = boardDao.getBoardList(vo);
		System.out.println("==> 게시글 목록");
		for(BoardVO board: boardList) {
			System.out.println(board);
		}
		
		UserVO userVO =new UserVO();
		UserDAO userDao = new UserDAO();
		userVO.setId("user1");
		userVO.setPassword("1234");
		
		
		UserVO user = userDao.getUser(userVO);
		System.out.println("로그인 정보");
		System.out.println(user);
		
	}

}
