package com.ezen.biz.service;

import java.util.List;

import com.ezen.biz.dto.BoardVO;

public interface BoardService {

	//게시글 등록
	void insertBoard(BoardVO board);

	//게시글 수정
	void updateBoard(BoardVO board);

	//삭제
	void deleteBoard(BoardVO board);

	//상세조회
	BoardVO getBoard(BoardVO board);

	//게시글목록조회
	List<BoardVO> getBoardList();

}