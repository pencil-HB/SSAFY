<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>MVC Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container text-center">
		<img src="resources/image/f2.jpg" />
		<h1>영화 정보</h1>
		<p>
		<table class="table table-bordered">
			</TR>
			<TR>
				<TH>제목</TH>
				<TD COLSPAN=3>${m.title}</TD>
			</TR>
			<TR>
				<TH>러닝타임</TH>
				<TD>${m.runningTime}분</TD>

				<Th>장소</TH>
				<TD>${m.location}</TD>
			</TR>
			<TR>
				<TH>개봉 날짜</TH>
				<TD>${m.releaseDate}</TD>

				<TH>상영관</TH>
				<TD>${m.cinemaName}</TD>
		</TABLE>
		<a href="list">글목록</a> <a href="delete?id=${m.id}">삭제하기</a> <br>
		<br>

	</div>
</body>
</html>






