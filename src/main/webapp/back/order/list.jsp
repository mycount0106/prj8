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
<title>借款审核</title>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">

<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
<h2>借款列表</h2>
  <table width="800px" border="1px">
  <tr>
  <td>借款ID</td>
  <td>金额</td>
  <td>分期数</td>
  <td>利率</td>
  <td>状态</td>
  <td>操作</td>
  </tr>
  <c:forEach items="${orders }" var="order" >
  <tr>
  <td>${order.oid }</td>
  <td>${order.money }</td>
  <td>${order.deadline }</td>
  <td>${order.rate }</td>
  <td><c:if test="${order.status==0 }">未审核</c:if>
  <c:if test="${order.status==1 }">已通过</c:if>
  <c:if test="${order.status==2 }">已拒绝</c:if>
  </td>
  <td><button class="data">查看资料</button><input name="walletid" value="${order.walletid }" type="hidden" />
  <c:if test="${order.status==0 }">
        <select name="select"class="sel">
        <option value="0" selected="selected">未审核</option>
        <option value="1">审核通过</option>
        <option value="2">审核拒绝</option>
        </select>
        <input name="oid" value="${order.oid } " type="hidden" />
   </c:if>
  </td>
  
  </tr>
  </c:forEach>
  </table>
  <div id="win" class="easyui-window" title="用户详细信息" style="width:600px;height:400px"  
        data-options="iconCls:'icon-save',closed:true">  
        <h3>用户信息</h3>
        <table >
		<tr>
		<td>用户名：</td>
		<td id="a"></td>
		</tr>
		<tr>
		<td>手机号：</td>
		<td id="b"></td>
		</tr>
		</table>
		
		<h3>详细信息</h3>
		
		<table >
					<tr>
						<td>姓名：</td>
						<td id="c"></td>
					</tr>
					<tr>
						<td>性别：</td>
						<td id="d"></td>
					</tr>
					<tr>
						<td>年龄：</td>
						<td id="e"></td>
					</tr>
					<tr>
						<td>家庭地址：</td>
						<td id="f">
							
						</td>
					</tr>
					<tr>
						<td>身份证正面照片：</td>
						<td><img  width="20%" id="g"/></td>
					</tr>
					<tr>
						<td>身份证反面照片：</td>
						<td><img  width="20%" id="h"/></td>
					</tr>
					<tr>
						<td>身份证号：</td>
						<td id="i"></td>
					</tr>
					
					<tr>
						<td>公司名称：</td>
						<td id="j"></td>
					</tr>
					<tr>
						<td>职位：</td>
						<td id="k"></td>
					</tr>
					<tr>
						<td>月收入：</td>
						<td id="l"></td>
					</tr>
				
				</table>
				
				<h3>联系人信息</h3>
				
				<table id="tab">
		<tr  >
		<td align="center">联系人名称</td>
		<td>关系</td>
		<td>电话号码</td>
		</tr>
		
	</table>
</div>  
  
</body>
<script >
$(document).ready(function(){
     $(".sel").change(function(){
          let status=$(this).val();
          let oid=$(this).next().val();             
          alert(status);alert(oid);
          $.ajax({
               type:"post",
               url:"/order/updateStatus",
               data:{"status":status,"oid":oid},
          success:function(){
       	   window.location.reload();
              }
              });
         });
     $(".data").click(function(){
          let walletid=$(this).next().val();
           alert(walletid);
           $.ajax({
               type:"post",
               url:"/wallet/userdata",
               data:{"walletid":walletid},
               success:function(data){
                     var user=data["user"];
                     var userdata=data["userdata"];
                     var list=data["list"];
                     $("#a").text(user.uname);
                     $("#b").text(user.phone);
                     $("#c").text(userdata.uname);
                     $("#d").text(userdata.sex);
                     $("#e").text(userdata.age);
                     $("#f").text(userdata.adress);
                     $("#g").attr({"src":userdata.photoOne});
                     $("#h").attr({"src":userdata.photoTwo});
                     $("#i").text(userdata.cardid);
                     $("#j").text(userdata.company);
                     $("#k").text(userdata.position);
                     $("#l").text(userdata.income);
                     $("#tab").empty();
                     $.each(list, function(i,linkman){  
                    	
        $("#tab").append("<tr>"+"<td>"+linkman.linkname+"</td>"+"<td>"+linkman.relation+"</td>"+"<td>"+linkman.phone+"</td>"+"</tr>");  
                    	});  
                   $('#win').window('open');  

                   }
               })
         });
	
});

</script>
</html>