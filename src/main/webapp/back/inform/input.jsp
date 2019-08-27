<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>公告中心</title>
</head>
<body>
<h2>添加公告</h2>
  <form action="${inform==null?'/inform/save':'/inform/update' }" method="post">
  <table>
  <tr>
  <td>标题：</td>
  <td><input name="title" value="${inform.title }"/></td>
  </tr>
  <tr>
  <td>内容：</td>
  <td><textarea rows="4" cols="21" name="content" >${inform.content }</textarea></td>
  </tr>
  <tr>
  <td colspan="2"><button>提交</button></td>
  </tr>
  </table>
  
  </form>
</body>
</html>