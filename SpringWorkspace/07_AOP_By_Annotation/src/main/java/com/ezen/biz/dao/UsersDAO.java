package com.ezen.biz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.UsersVO;
import com.ezen.biz.service.UsersService;

@Repository
public class UsersDAO 
{
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	private final String USER_GET = "select * from users where id =? and password=?";


	 public UsersVO getUsers(UsersVO user) {
	      System.out.println("JDBC로 getusers() 기능처리 ");
	      UsersVO vo=new UsersVO();
	      try {
	         conn=JDBCUtil.getConnection();
	         pstmt=conn.prepareStatement(USER_GET);
	         pstmt.setString(1, user.getId());
	         pstmt.setString(2, user.getPassword());
	         rs=pstmt.executeQuery();
	         if(rs.next()) {
	            vo.setId(rs.getString("id"));
	            vo.setPassword(rs.getString("password"));
	            vo.setName(rs.getString("name"));
	            vo.setRole(rs.getString("role"));
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         JDBCUtil.close(pstmt, conn, rs);
	      }
	      return vo;
	   }








}
