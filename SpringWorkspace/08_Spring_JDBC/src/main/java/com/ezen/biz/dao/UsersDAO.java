package com.ezen.biz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.UsersVO;
import com.ezen.biz.service.UsersService;

@Repository("usersDAO")
public class UsersDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String USER_GET = "select * from users where id =? and password=?";


	 public UsersVO getUsers(UsersVO vo) {
	      System.out.println("JDBC로 getusers() 기능처리 ");
	      			UsersVO user = null;
	      			Object[] args = {vo.getId() , vo.getPassword()};
	      			
	      			
	      return jdbcTemplate.queryForObject(USER_GET,args, new UserRowMapper());
	   }





	 	class UserRowMapper implements RowMapper<UsersVO>{

			@Override
			public UsersVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				UsersVO user = new UsersVO();
				
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
				return user;
			}
	 		
	 		
	 	}


}
