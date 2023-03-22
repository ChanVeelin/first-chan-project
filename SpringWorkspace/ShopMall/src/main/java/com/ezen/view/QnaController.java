package com.ezen.view;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ezen.biz.dto.MemberVO;
import com.ezen.biz.dto.QnaVO;
import com.ezen.biz.service.QnaService;

@Controller
public class QnaController {

	
	@Autowired
	private QnaService qnaService;
	
	/*
	 * 특정 회원의 QNA 목록 조회
	 */
	
	@GetMapping("/qna_list")
	public String qnaList(Model model, HttpSession session) {
		//사용자 로그인 확인
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");

		if (loginUser == null) {
			return "member/login";
		} else {
	
		// 사용자아이디를 매개변수로 QNA 목록 조회
			List<QnaVO> qnaList = qnaService.getListQna(loginUser.getId());
		//화면에 전달할 데이터를 "qnaList" 속성으로
			model.addAttribute("qnaList",qnaList);
	
		//화면 
			return "qna/qnaList";
		}	
	}
	/*
	 * QnA 게시글 상세보기
	 */
	@GetMapping("/qna_view")
	public String qnaView(QnaVO vo , Model model ,HttpSession session ) {
		//사용자 로그인
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");

		if (loginUser == null) {
			return "member/login";
		} else {
		//화면 입력받은 qseq를 입력 바라미터로 해 qna 상세조회
			QnaVO qna = qnaService.getQna(vo.getQseq());
		// 조회결과를 qnaVO 속성에 저장
				model.addAttribute("qnaVO", qna);
		//qna/qnaView.jsp 화면표시
			return "qna/qnaView";
		}
	}
	
	@GetMapping("/qna_write_form")
	public String qnaWriteView() {
		
		return "qna/qnaWrite";
	}
}
