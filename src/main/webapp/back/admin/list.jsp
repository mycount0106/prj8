<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	用户管理
		<table border="1" width="100%">
			<tr>
				<td>用户ID</td>
				<td>用户名</td>
				<td>所属角色</td>
				<td>创建时间</td>
				<td>是否可用</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${admins }" var="admin">
				<tr>
					<td>${admin.aid }</td>
					<td>${admin.aname }</td>
					<td>${admin.roles }</td>
					<td>
						<f:formatDate value="${admin.regtime }" pattern="yyyy-MM-dd hh:mm:ss"/>
					</td>
					<td>${admin.isdelete==1?'已删除':'正常' }</td>
					<td>
						<a href="${admin.isdelete==0?'delete':'revoke' }?aid=${admin.aid }">${admin.isdelete==1?'删除':'恢复' }</a>
						<a href="findById?aid=${admin.aid }">更新</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="goInput">添加用户</a>
</body>
</html>
