<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList,com.mvc.vo.Board"%>

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
	<%
	//request.getAttribute("list");는 이름만 맞으면 그냥 꺼낼 뿐이다. -> Object타입으로 반환되기때문에 형변환이 필요하다!
	ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("list");
	%>
	<div class="container text-center">
		<img src="resources/image/f1.jpg" />
		<h1>MVC 게시판</h1>
		
		<jsp:include page="loginCheck.jsp"/> <!-- 함수 호출과 비슷 -->
		<form method="post" action="search">
            <div class="row g-3 align-items-center">
                <div class="col-auto">
                    <label for="inputPassword6" class="col-form-label">검 색: </label>
                </div>
                <div class="col-auto">
                    <select name="search" class="form-select"
                        aria-label="Default select example">
                        <option value="name">이 름</option>
                        <option value="title">제 목</option>
                    </select>
                </div>
                <div class="col-auto">
                    <input type="text" class="form-control" name="word">
                </div>
                <div class="col-auto">
                    <button type="submit" class="btn btn-primary">검  색</button>
                </div>
            </div>
        </form>
		
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Board board : list) {
				%>
				<tr>
					<td><%=board.getNum()%></td>
					<td><a href="read?num=<%=board.getNum()%>"><%=board.getTitle()%></a></td>
					<td><%=board.getName()%></td>
					<td><%=board.getWdate()%></td>
					<td><%=board.getCount()%></td>
				</tr>
				<%
				}
				%>

			</tbody>
		</table>
		<br> <a href="insertForm">새글쓰기</a> <br>
		<hr>
		<a href="txtest">transaction test</a>
	</div>
</body>
</html>



