<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 1. 세션 객체 종료
	session.invalidate();

	// 2. 로그인 화면으로 이동
	response.sendRedirect("login.jsp");
%>
</body>
</html>