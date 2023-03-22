package com.ezen.biz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
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
		try {
			//오라클DB연결
		conn= JDBCUtil.getConnection();
		pstmt = conn.prepareStatement(BOARD_INSERT);
		//실행할 SQL ? 채우기
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getWriter());
		pstmt.setString(3, board.getContent());
		//SQL 실행
		pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}
	//게시글 수정
	public void updateBoard(BoardVO board) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리");	
		try {
			//오라클DB연결
		conn= JDBCUtil.getConnection();
		pstmt = conn.prepareStatement(BOARD_UPDATE);
		//실행할 SQL 채우기
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getWriter());
		pstmt.setString(3, board.getContent());
		pstmt.setInt(4, board.getSeq());
		pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}
	//삭제
public void deleteBoard(BoardVO board) {
	System.out.println("===> JDBC로 deleteBoard() 기능 처리");	
	try {
		//오라클DB연결
	conn= JDBCUtil.getConnection();
	pstmt = conn.prepareStatement(BOARD_DELETE);
	//실행할 SQL 채우기
	pstmt.setInt(1, board.getSeq());
	pstmt.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		JDBCUtil.close(pstmt, conn);
	}
	
	}
	//상세조회
	public BoardVO getBoard(BoardVO board) {
		System.out.println("===> JDBC로 getBoard() 기능 처리");	
		BoardVO vo =new BoardVO();
		try {
		conn= JDBCUtil.getConnection();
		pstmt = conn.prepareStatement(BOARD_GET);
		pstmt.setInt(1, board.getSeq());
		rs=pstmt.executeQuery();
		
		if(rs.next()) {
			vo.setSeq(rs.getInt("seq"));
			vo.setTitle(rs.getString("title"));
			vo.setWriter(rs.getString("writer"));
			vo.setContent(rs.getString("content"));
			vo.setCnt(rs.getInt("cnt"));
			vo.setRegDate(rs.getDate("regdate"));
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn,rs);
		}
		return vo;
	}
	//게시글목록조회
	public List<BoardVO> getBoardList(){
		System.out.println("===> JDBC로 BoardList()기능 처리");	
		List<BoardVO> boardList =null;
		try {
		conn= JDBCUtil.getConnection();
		pstmt = conn.prepareStatement(BOARD_LIST);
		rs=pstmt.executeQuery();
		
		boardList = new ArrayList<BoardVO>();
		while (rs.next()) {
			BoardVO vo =new BoardVO();
			vo.setSeq(rs.getInt("seq"));
			vo.setTitle(rs.getString("title"));
			vo.setWriter(rs.getString("writer"));
			vo.setContent(rs.getString("content"));
			vo.setCnt(rs.getInt("cnt"));
			vo.setRegDate(rs.getDate("regdate"));
			boardList.add(vo);
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(pstmt, conn,rs);
		}
			return boardList;
	}
}
