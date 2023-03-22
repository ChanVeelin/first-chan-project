package com.ezen.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * OJDBC 드라이버를 이용하여 오라클 DB에 연결
 */
public class JDBCUtil {
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uid = "spring_user";
		String pass = "ora123";
		try {
// 오라클 jdbc 드라이버를 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
// JDBC드라이버프로그램 통해 오라클DB 연결 
			conn = DriverManager.getConnection(url, uid, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Statement stmt, Connection conn, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt, Connection conn) {
		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
