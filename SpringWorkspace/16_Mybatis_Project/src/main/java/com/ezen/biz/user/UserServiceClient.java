package com.ezen.biz.user;




import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		UserVO vo =new UserVO();
		UserDAO userDao = new UserDAO();
		
		vo.setId("user1");
		vo.setPassword("1234");
		
		
		userDao.getUser(vo);
		System.out.println("로그인"+ userDao);
		
		
		
		
	}

}
