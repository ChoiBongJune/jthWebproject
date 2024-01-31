<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<script>
	$(document).ready(function() {
		
		$("#btnRegister").on("click", function() {
			
			location.href = "/board/register";
			
		});
		
	}); 
</script>

</head>
<body>
<h1>게시판</h1>
	<table class="table table-striped">
		<c:forEach var="board" items="${resultList }" varStatus="stats">
			<tr>
				<td>${board.id }</td>
				<td><a href="/board/detail?id=${board.id }">${board.title }</a></td>
				<td>${board.contents }</td>
			</tr>
		</c:forEach>	
	</table>
	<button id="btnRegister">등록</button>
</body>
</html>