package com.ezen.biz.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.ezen.biz.dto.BoardVO;
import util.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis; // 데이터 베이스 연결 객체
	
	/*
	 *  생성자
	 */
	public BoardDAO() {
		//오라클 DB에 대한 연결 객체를 생성
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	//게시글 등록
	public void insertBoard(BoardVO board) {
		mybatis.insert("boardMapper.insertBoard",board);
		mybatis.commit();
	}
	//게시글 수정
		public void updateBoard(BoardVO board) {
			mybatis.update("boardMapper.updateBoard",board);
		}
	//게시글 삭제
	public void deleteBoard(BoardVO board) {
		mybatis.delete("boardMapper.deleteBoard",board);
	}
	//게시글 조회
	public BoardVO getBoard(BoardVO board) {
			return mybatis.selectOne("boardMapper.getBoard",board);
	}
	
	public List<BoardVO> getBoardList(BoardVO board) {
		return mybatis.selectList("boardMapper.getBoardList",board);	
	}
	
	
}