package com.ezen.biz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.ezen.biz.dto.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//SQL 명령어 
	private static final String BOARD_INSERT = 
			"insert into board(seq,title,writer,content) VALUES(board_seq.nextval,?,?,?) ";
	private static final String BOARD_UPDATE = 
			"UPDATE board SET title=?,writer=?,content=? WHERE seq=? ";
	private static final String BOARD_DELETE = 
			"DELETE board WHETE =seq=?";
	private static final String BOARD_GET = 
			"select * from board where seq=?";
	private static final String BOARD_LIST =
			"select * from board ORDER BY seq DESC";
//게시글 등록
	public void insertBoard(BoardVO board) {
		System.out.println("===> JDBC로 InsertBoard() 기능 처리");
		
		jdbcTemplate.update(BOARD_INSERT,board.getTitle(), board.getWriter(), board.getContent());
	}
	//게시글 수정
	public void updateBoard(BoardVO board) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리");	
			Object[] args = {board.getTitle(), board.getWriter(),board.getContent(), board.getSeq()};
			jdbcTemplate.update(BOARD_UPDATE, args);
	}
	//삭제
public void deleteBoard(BoardVO board) {
	System.out.println("===> JDBC로 deleteBoard() 기능 처리");	
		jdbcTemplate.update(BOARD_DELETE, board.getSeq());
	}
//상세조회
	public BoardVO getBoard(BoardVO board) {
		System.out.println("===> JDBC로 getBoard() 기능 처리");	
		Object[] args = {board.getSeq()};
		return jdbcTemplate.queryForObject(BOARD_GET, args,new BoardRowMapper());
	}
	
	//게시글목록조회
	public List<BoardVO> getBoardList(){
		System.out.println("===> JDBC로 BoardList()기능 처리");	
		
		return jdbcTemplate.query(BOARD_LIST,new BoardRowMapper());
	}

	class BoardRowMapper implements RowMapper<BoardVO>{

		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardVO board = new BoardVO();
			
			board.setSeq(rs.getInt("seq"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getDate("regdate"));
			board.setCnt(rs.getInt("cnt"));
			
			return board;
		}
		
	}
}
