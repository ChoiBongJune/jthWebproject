<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/test/list" method="get">
	<input type="submit" value="list(GET)">
</form>

<form action="/test/detail" method="get">
	<input type="submit" value="detail(GET)">
</form>

<form action="/test/insert" method="post">
	<input type="submit" value="insert(POST)">
</form>

<form action="/test/update" method="post">
	<input type="submit" value="update(POST)">
</form>

<form action="/test/delete" method="post">
	<input type="submit" value="delete(POST)">
</form>



</body>
</html>