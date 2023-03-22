package com.ezen.biz.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ezen.biz.dao.UserDAO;
import com.ezen.biz.dto.UserVO;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	public UserDAO userDao;
	
	
	public UserVO getUser(UserVO vo) {
		
		return userDao.getUser(vo);
	}

	@Override
	public UserVO getUsers(UserVO users) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
