package com.ezen.biz.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.biz.dao.BoardDAO;
import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.BoardVO;
import com.ezen.biz.dto.UserVO;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
	}


	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// (1) 클라이언트의 요청을 분석
		String uri = request.getRequestURI();
		//System.out.println("uri="+uri);
		
		//StringBuffer url = request.getRequestURL();
		//System.out.println(url.toString());
		
		String path = uri.substring(uri.lastIndexOf('/'));
		
		if (path.equals("/login.do")) {
			System.out.println("로그인 처리 ");
			// 1. 사용자 입력 정보 추출
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			// 2. DB 연동 처리
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);
			
			UserDAO userDao = new UserDAO();
			UserVO user = userDao.getUser(vo);
			
			// 3. 화면 네비게이션
			if (user != null) {
				response.sendRedirect("getBoardList.do");
			} else {
				response.sendRedirect("login.jsp");
			}
		} else if (path.equals("/getBoardList.do")) {
			System.out.println("게시글 목록 검색 처리");
			// DB 연동 처리
			BoardVO vo = new BoardVO();
			BoardDAO boardDao = new BoardDAO();
			List<BoardVO> boardList = boardDao.getBoardList();
			
			// 검색결과를 세션에 저장 
			HttpSession session = request.getSession();
			session.setAttribute("boardList", boardList);
			
			// 결과를 출력할 화면 지정 
			response.sendRedirect("getBoardList.jsp");
		} else if (path.equals("/getBoard.do")) {
			System.out.println("상세 게시글 조회 ");
			
			String seq = request.getParameter("seq");

			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDao = new BoardDAO();
			BoardVO board = boardDao.getBoard(vo);
			
			// 응답 화면 구성
			HttpSession session = request.getSession();
			session.setAttribute("board", board);
			response.sendRedirect("getBoard.jsp");
		} else if (path.equals("/insertBoard.do")) {
			System.out.println("게시글 등록 처리... ");
			
			// 1. 사용자 입력 정보 추출
			request.setCharacterEncoding("UTF-8");
			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			
			// 2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContent(content);
			
			BoardDAO boardDAO = new BoardDAO();
			boardDAO.insertBoard(vo);
			
			// 3. 화면 네비게이션
			response.sendRedirect("getBoardList.do");	
		}else if(path.equals("/updateBoard.do")){
			request.setCharacterEncoding("UTF-8");

			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			String seq = request.getParameter("seq");
			
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContent(content);
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDao = new BoardDAO();
			boardDao.updateBoard(vo);
			
			response.sendRedirect("getBoardList.do");
		}else if(path.equals("/deleteBoard.do")){
	
			String seq = request.getParameter("seq");

			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDao = new BoardDAO();
			boardDao.deleteBoard(vo);
			
			response.sendRedirect("getBoardList.do");
			
			
		}else if(path.equals("/logout.do")) {
			System.out.println("로그아웃 처리 ");
			// 1. 세션 객체 종료
			HttpSession session = request.getSession();
			session.invalidate();

			// 2. 로그인 화면으로 이동
			response.sendRedirect("login.jsp");
		}

}
}







