package com.ezen.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.UsersDAO;
import com.ezen.biz.dto.UsersVO;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	public UsersDAO usersDao;
	
	@Override 
	public UsersVO getUsers(UsersVO vo) {
		
		return usersDao.getUsers(vo);
	}
	
	
}
