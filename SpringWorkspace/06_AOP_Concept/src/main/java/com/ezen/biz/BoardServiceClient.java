package com.ezen.biz;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.biz.dto.BoardVO;
import com.ezen.biz.service.BoardService;

public class BoardServiceClient {
	static BoardService boardService = null;

	public static void main(String[] args) {
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		boardService = (BoardService) container.getBean("boardService");
		// 게시글 등록
		insertData();
		
		// 게시글 전체 목록 출력
		List<BoardVO> boardList = boardService.getBoardList();
		for (BoardVO vo : boardList) {
			System.out.println(vo);
		}
		//상세 조회
		BoardVO board = new BoardVO();
		board.setSeq(3);
		BoardVO result = boardService.getBoard(board);
		System.out.println("상세 게시글 조회 : " + result);
		
		//게시글 수정
		result.setTitle("수정 게시글 제목");
		boardService.updateBoard(result);
		
		container.close();
	}


	public static void insertData() {

		for (int i = 0; i < 10; i++) {
			BoardVO board = new BoardVO();
			board.setTitle("게시글 제목" + i);
			board.setWriter("작성자" + i);
			board.setContent(i + "번 게시글입니다.");

			boardService.insertBoard(board);

		}
	}

}
