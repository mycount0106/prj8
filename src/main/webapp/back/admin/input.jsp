<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.4.min.js"></script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		<c:forEach items="${admin.roles}" var="r">
			$("input[name=chk][value=${r.rid}]").attr("checked","checked");
		</c:forEach>
	});
</script>
</head>
<body>
	用户管理
	<form action="${admin==null?'save':'update' }" method="post">
		<input type="hidden" name="aid" value="${admin.aid }">
		<!-- <input type="hidden" name="tids"> -->
		用户名<input type="text" name="aname" value="${admin.aname }"/><br/>
		密码<input type="password" name="password" value="${admin.password }"/>
		请选择角色
		<c:forEach items="${roles }" var="role">
			<input type="checkbox" name="chk" value="${role.rid }">${role.rname }
		</c:forEach>
		<input type="submit" value="${admin==null?'增加':'更新' }"/>
	</form>
</body>
</html>
