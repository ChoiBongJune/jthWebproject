<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<script>
$(document).ready(function() {

	$("#btnRegister").on("click", function(){
		
		$("#formData").submit();
		
	});
	
	$('#btnList').on("click",function() {
		
		location.href = "/board/list";
		
	});
	
});


</script>
</head>
<body>
<form id="formData" method="post" action="/board/register">
게시판 id<input type="text" id=boardId name="id" /><br/>
게시판 제목<input type="text" id=boardTitle name="title" /><br/>
게시판 내용<input type="text" id=boardContents name="contents" />
</form>
<input type="button" id="btnRegister" value="등록" />
<input type="button" id="btnList" value="목록" />
</body>
</html>