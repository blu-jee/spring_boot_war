<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
</head>
<body>
    <button onclick="location.href='/'">back</button>
    <form action="/post" method="post">
        <span>Title</span> <input type="text" id="title" name="title">
        <textarea id="content" name="content"></textarea>
        <span>비밀번호</span> <input type="text" id="password" name="password">
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>