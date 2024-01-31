<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<script>
$(document).ready(function() {
	
	$("#btnModify").on('click', function(){
		
		location.href = "/board/modify?id=" + ${resultData.id};
		
	});

	$("#btnDelete").on('click', function(){
		
		$("#formDelete").submit();
		
	});
	
});

</script>
</head>
<body>
<h1>게시판 상세</h1>
<table class="table table-striped">
	<tr>
		<td>id</td>
		<td>제목</td>
		<td>내용</td>
	</tr>	
	<tr>
		<td>${resultData.id }</td>
		<td>${resultData.title }</td>
		<td>${resultData.contents }</td>
	</tr>	
</table>
<button id="btnModify">수정</button>
<button id="btnDelete">삭제</button>
<form id=formDelete method="post" action="/board/delete">
	<input type="hidden" name="id" value="${resultData.id }" />
</form>

</body>
</html>