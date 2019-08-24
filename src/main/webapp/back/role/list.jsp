<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	角色管理
		<table border="1" width="100%">
			<tr>
				<td>rid</td>
				<td>rname</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="role">
				<tr>
					<td>${role.rid }</td>
					<td>${role.rname }</td>
					<td>
						<a href="findById?rid=${role.rid }">更新</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="goInput">添加角色</a>
</body>
</html>
