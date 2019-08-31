<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户管理</title>
<script type="text/javascript" src="<%=basePath%>js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.core-3.5.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">

<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>

</head>
<body>
<h2>用户列表</h2>

 
  <table width="800px" border="1px">
  <tr>
  <td>利率Id</td>
  <td>期限</td>
  <td>存款利率</td>
  <td>借款利率</td>
  <td>操作</td>
  </tr>
  <c:forEach items="${list }" var="rate">
  <tr >
   <td>${rate.rateid }</td>
   <td>${rate.deadline }</td>
   <td>${rate.depostitrate }</td>
   <td>${rate.loanrate }</td>
    <td><button class="s1">编辑</button><button class="dele">删除</button>
   </td>
  </tr>
  </c:forEach>
  </table>
  <button id="zj">增加</button>
  <div id="win" class="easyui-window" title="用户详细信息" style="width:600px;height:400px"  
        data-options="iconCls:'icon-save',closed:true">
        <table>
        <tr>
        <td>期限：</td>
        <td ><input type="text" id="a"  /></td>
        </tr>
        <tr>
        <td>存款利率：</td>
        <td ><input type="text" id="b"  /></td>
        </tr>
        <tr>
        <td>借款利率：</td>
        <td ><input type="text" id="c"  /></td><input type="hidden" id="a1" />
        </tr>
        <tr>
       
        <td colspan="2"><button id="w">确定</button></td>
        </tr>
        </table> 
  </div>
  
  
  
</body>
<script >

  $(document).ready(function(){
	 $(".s1").click(function(){
    $("#a1").val($(this).parent().prev().prev().prev().prev().text());
    $("#a").val($(this).parent().prev().prev().prev().text());
    $("#b").val($(this).parent().prev().prev().text());
    $("#c").val($(this).parent().prev().text());
    $('#win').window('open'); 
		 });
    $("#w").click(function(){
   let rateid=$("#a1").val();
   let deadline=$("#a").val();
   let depostitrate=$("#b").val();
   let loanrate=$("#c").val();
   if(rateid==null||rateid!=undefined||rateid==""){
       alert(rateid);
	   $.ajax({
	        type:"post",
	        url:"/rate/save",
	        data:{"deadline":deadline,"depostitrate":depostitrate,"loanrate":loanrate},
	        success:function(){
	        	$('#win').window('close'); 
	            window.location.href="/rate/findAll";
	            }
		   });


	   }else{
   $.ajax({
        type:"post",
        url:"/rate/update",
        data:{"rateid":rateid,"deadline":deadline,"depostitrate":depostitrate,"loanrate":loanrate},
        success:function(){
        	$('#win').window('close'); 
            window.location.href="/rate/findAll";
            }
	   });
	   }
        });
    $(".dele").click(function(){
    	let rateid=$(this).parent().prev().prev().prev().prev().text();
         var a= window.confirm("确定删除吗 ");
         if(a){
             $.ajax({
              type:"post",
              url:"/rate/delete",
              data:{"rateid":rateid},
              success:function(){
            	  window.location.href="/rate/findAll";
                  }
              });
             }
        });
     $("#zj").click(function(){
    	 $('#win').window('open'); 

         });
	
  });

    

</script>
</html>