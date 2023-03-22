package com.ezen.biz.dao;

import org.apache.ibatis.session.SqlSession;
import com.ezen.biz.dto.UserVO;
import util.SqlSessionFactoryBean;

public class UserDAO {
	private SqlSession mybatis;
	
	public UserDAO() {
	mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
		
	public UserVO getUser(UserVO user) {
		return mybatis.selectOne("userMapper.getUser",user);
	}
	
	
	}


