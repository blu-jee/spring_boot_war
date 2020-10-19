<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>

<h1>게시판</h1>

<button type="button" onclick="location.href='/post'">글쓰기</button>
<table class="table table-bordered table-strpied nanum table-hover"  style="text-align:center">
     <tr>
        <th>id</th>
        <th>title</th>
        <th>date</th>
     </tr>
     <c:forEach var="row" items="${list}" varStatus="status">
     <tr>
        <td>${row.id}</td>
        <td>${row.title }</td>
        <td>${row.date}</td>
     </tr>
     </c:forEach>
  </table>

</body>
</html>