package com.ezen.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ezen.biz.dto.AddressVO;
import com.ezen.biz.dto.MemberVO;
import com.ezen.biz.service.MemberService;

import oracle.jdbc.proxy.annotation.GetDelegate;

@Controller
@SessionAttributes("loginUser")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	/*
	 * 약정화면 표시
	 */
	
	@GetMapping("/contract")
	public String contractView() {
		
		return "member/contract";		
	}
	/*
	 * 회원가입 화면 표시
	 */
	@PostMapping("/join_form")
	public String joinView() {
		
		return "member/join";
	}
	
	/*
	 *  ID 중복체크 화면 표시
	 */
	@GetMapping("/id_check_form")
	public String idCheckView(MemberVO vo, Model model) {
		//id 중복확인조회
		int result = memberService.confirmID(vo.getId());

			model.addAttribute("id",vo.getId());
			model.addAttribute("message",result);
			
			return "member/idcheck";
	}
	/*
	 * ID 중복체크 수행
	 */
	@PostMapping("/id_check_form")
	public String idCheckAction(MemberVO vo, Model model) {
		int result = memberService.confirmID(vo.getId());

		model.addAttribute("id",vo.getId());
		model.addAttribute("message",result);
		
		return "member/idcheck";
		
	}
	
	@GetMapping("/find_zip_num")
	public String findzipNumView() {
		
		return "member/findZipNum";
	}
	@PostMapping("/find_zip_num")
	public String findZipAction(AddressVO vo, Model model) {
		
		List<AddressVO> addressList = memberService.selectAddressByDong(vo.getDong());
		
		model.addAttribute("addressList",addressList);
		
		return "member/findZipNum";
				
	}
	
	/*
	 * 회원가입 처리
	 */
	@PostMapping("/join")
	public String joinAction(MemberVO vo,
		@RequestParam(value="addr1",defaultValue="")String addr1,
		@RequestParam(value="addr2",defaultValue="")String addr2){

		vo.setAddress(addr1+""+addr2);
			memberService.insertMember(vo);
	
		return "member/login";
	}
	
	@GetMapping("/login_form")
	public String loginView() {
		
		return "member/login";
	}
	
	@PostMapping("/login")
	public String loginAction(MemberVO vo,Model model) {
		
	int result = memberService.loginID(vo);
	
		if(result ==1) {//로그인 성공
			model.addAttribute("loginUser",memberService.getMember(vo.getId()));
			  return "redirect:index";
		}else {
			return "member/login_fail";
		}
	}
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		
		status.setComplete();
		return "member/login";
	}
	
	@GetMapping("/find_id_form")
	public String findIdFormView() {
		
		return "member/findIdAndPassword";
	}
	@PostMapping("/find_id")
	public String findIdAction(MemberVO vo,Model model) {
		String id = memberService.selectIdByNameEmail(vo);
		if (id != null) {//아이디 조회 성공
			model.addAttribute("message",1);
			model.addAttribute("id",id);
		}else {
			model.addAttribute("message",-1);
		}
		return "member/findResult";//조ㅗ회 결과 화면 요청
	}
	@PostMapping("/find_pwd")
	public String findPwdAction(MemberVO vo,Model model) {
		String pwd = memberService.selectPwdByIdNameEmail(vo);
		if (pwd != null) {//아이디 조회 성공
			model.addAttribute("message",1);
			model.addAttribute("id",vo.getId());
		}else {
			model.addAttribute("message",-1);
		}
		return "member/findPwdResult";//조회 결과 화면 요청
	}
	@PostMapping("/change_pwd")
	public String changePwdAction(MemberVO vo) {
		
		memberService.changePwd(vo);
		
		return "member/changePwdOk";
	}
}
