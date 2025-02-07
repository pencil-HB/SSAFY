<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>RESTful 웹서비스 클라이언트(JSON)</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
	//1)모든 사용자 목록 조회 요청
	function selectAll() {
		fetch("http://localhost:8080/rest/customers")
		.then(response=>response.json())
		.then(data => selectAllResult(data))
	}//selectAll	
	
	function selectAllResult(data){
		let list =``;
		data.forEach(function(item){
			list += `<tr onclick=selectOne(\${item.num})>
						<td>\${item.num}</td>
						<td>\${item.name}</td>
						<td>\${item.address}</td>
			</tr>`;
		});
		document.getElementById("tb").innerHTML = list;
		
		
	}

	//2)사용자 조회 요청. tr click시 조회
	function selectOne(num) {
		fetch("http://localhost:8080/rest/customers/"+num)
		.then(response=>response.json())
		.then(data => selectOneResult(data))
	}//selectOne	
	
	function selectOneResult(data) {
		var num=document.getElementById("num");
		var name=document.getElementById("name");
		var address=document.getElementById("address");
		
		num.value = data.num;
		name.value = data.name;
		address.value = data.address;
		
		disableInputs();
	}
	
	// 요소들을 비활성화하는 함수
	function disableInputs() {
	    document.getElementById("num").disabled = true;
	    document.getElementById("name").disabled = true;
	}

	//3)사용자 등록 요청
	function customerInsert() {
		var num=document.getElementById("num");
		var name=document.getElementById("name");
		var address=document.getElementById("address");
		
		if(num.value != "" && name.value != "" && address.value != ""){
			fetch("http://localhost:8080/rest/customers", {
				method:'POST',
				headers: {
					 'Content-Type': 'application/json'
				}, 
				body : JSON.stringify({
					"num":num.value,
					"name":name.value,
					"address":address.value
				})
			})
			.then(response => {
				if(!response.ok) {
					alert("등록에 실패하였습니다.");
				} else {
					alert("등록 되었습니다.");
					selectAll();
					disableInputs();
				}				
			})
		} else {
			alert("빈 값이 있습니다!!")
		}
	}//customerInsert

	//4)사용자 삭제 요청
	function customerDelete() {
		var num=document.getElementById("num");
		
		if(num.value != ""){
			fetch("http://localhost:8080/rest/customers/"+num.value, {
				method:'DELETE'})
			.then(response => {
				if(!response.ok) {
					alert("삭제에 실패하였습니다.");
				} else {
					alert("삭제 되었습니다.");
					selectAll();
					clearText();
				}				
			})
		} else {
			alert("번호를 입력해주세요.")
		}
	}//customerDelete

	//5)사용자 수정 요청
	function customerUpdate() {
		var num=document.getElementById("num");
		var name=document.getElementById("name");
		var address=document.getElementById("address");
		
		if(num.value != "" && name.value != "" && address.value != ""){
			fetch("http://localhost:8080/rest/customers", {
				method:'PUT',
				headers: {
					 'Content-Type': 'application/json'
				}, 
				body : JSON.stringify({
					"num":num.value,
					"name":name.value,
					"address":address.value
				})
			})
			.then(response => {
				if(!response.ok) {
					alert("수정에 실패하였습니다.");
				} else {
					alert("수정 되었습니다.");
					selectAll();
				}				
			})
		} else {
			alert("빈 값이 있습니다!!")
		}
	}//customerUpdate
	
	function clearText(){
		var num=document.getElementById("num");
		var name=document.getElementById("name");
		var address=document.getElementById("address");
		
		num.value = "";
		name.value = "";
		address.value = "";
		
		enableInputs();
	}
	
	// 요소들을 활성화하는 함수
	function enableInputs() {
	    document.getElementById("num").disabled = false;
	    document.getElementById("name").disabled = false;
	    document.getElementById("address").disabled = false;
	}
</script>
</head>
<body onload="selectAll()">
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>REST Customer Management</h2>
			<div class="form-group">
				<label>번호:</label> <input type="text" class="form-control" id="num">
			</div>
			<div class="form-group">
				<label>이름:</label> <input type="text" class="form-control" id="name">
			</div>

			<div class="form-group">
				<label>주소:</label> <input type="text" class="form-control"
					id="address">
			</div>

			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="등록"
					id="btnInsert" onclick="customerInsert()" /> <input type="button"
					class="btn btn-primary" value="수정" id="btnUpdate"
					onclick="customerUpdate()" /> <input type="button"
					class="btn btn-primary" value="삭제" id="btnDelete"
					onclick="customerDelete()" /> <input type="button"
					class="btn btn-primary" value="초기화" id="btnInit"
					onclick="clearText()" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>사용자 목록</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">번호</th>
					<th class="text-center">이름</th>
					<th class="text-center">주소</th>
				</tr>
			</thead>
			<tbody id="tb">

			</tbody>
		</table>
	</div>
</body>
</html>