<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>公告中心</title>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script >
      $(document).ready(function(){
        $(".del").click(function(){
           var a= window.confirm("确定删除吗 ");
            if(a){
                  location.href="/inform/delete?informid="+$(this).val();
                }
            });

          });

</script>
</head>
<body>
<h2>公告列表</h2>
  <table width="800px" border="1px">
  <tr>
  <td>公告ID</td>
  <td>标题</td>
  <td>内容</td>
  <td>编辑</td>
  <td>删除</td>
  </tr>
  <c:forEach items="${informs }" var="inform" >
  <tr>
  <td>${inform.informid }</td>
  <td>${inform.title }</td>
  <td>${inform.content }</td>
  <td><button onclick="location.href='/inform/findOne?informid=${inform.informid }'">编辑</button></td>
  <td><button class="del" value="${inform.informid }">删除</button></td>
  </tr>
  </c:forEach>
  </table>
</body>
</html>