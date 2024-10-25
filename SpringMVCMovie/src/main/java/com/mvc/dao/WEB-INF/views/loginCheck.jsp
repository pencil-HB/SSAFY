<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.mvc.vo.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Member u = (Member) session.getAttribute("user");
			if (u == null) {
	%>
	<a href="board?act=loginForm">로그인</a>

	<% } else { %>
	<%= u.getId() %>아. 환영한다.
	<a href="board?act=logout">로그아웃</a>
	<%} %>



</body>
</html>