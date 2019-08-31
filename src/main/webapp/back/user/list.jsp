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

 <form action="/userLogin/findAll" method="post"> 
   用户名:<input name="uname" value="${user.uname }" />手机号:<input name="phone" value="${user.phone }"  /><button type="submit">搜索用户</button>
  <table width="800px" border="1px">
  <tr>
  <td>用户Id</td>
  <td>用户名</td>
  <td>注册时间</td>
  <td>手机号</td>
  <td>账户额度</td>
  <td>状态</td>
  <td>操作</td>
  </tr>
  <c:forEach items="${list }" var="user">
  <tr >
   <td>${user.uid }</td>
   <td>${user.uname }</td>
   <td>${user.regtime }</td>
   <td>${user.phone }</td>
   <td>${user.wallet.countlimit }</td>
   <td>${user.isdelete==0?"正常":"封禁" }</td>
    <td>
    <c:if test="${user.isdelete==0 }"><button class="but">正常</button></c:if>
     <c:if test="${user.isdelete==1 }"><button class="but">封禁</button></c:if>
     <input type="hidden" value="${user.uid }" />
    <button class="but1" type="button">调整额度</button></td>
  </tr>
  </c:forEach>
  </table>
  <table>
      <tr>
      <td><button onclick="tijiao(1)">首页</button></td>
      <td><button onclick="tijiao(${pb.pageNow==1?1:pb.pageNow-1})">上一页</button></td>
      <td><button onclick="tijiao(${pb.pageNow==pb.pageCount?pb.pageCount:pb.pageNow+1 })">下一页</button></td>
      <td><button onclick="tijiao(${pb.pageCount})">尾页</button></td>
      <td>第<input type="text" name="pageNow" id="pageNow" value="${pb.pageNow }" size="1" /> 页</td>
      <td>每页<input type="text" name="limit" value="${pb.limit }" size="1" /> 条</td>
      <td>${pb.pageNow }/${pb.pageCount }总共：${pb.count }条记录<button type="submit">提交</button></td>
      </tr>
      </table>
      </form> 
  
  <div id="win" class="easyui-window" title="用户详细信息" style="width:600px;height:400px"  
        data-options="iconCls:'icon-save',closed:true"> 
   <table>
  
   <tr>
   <td>用户名：</td>
   <td id="a1"></td><input id="s2" type="hidden" />
   </tr>
   <tr>
   <td>原额度：</td>
   <td  id="a2"></td>
   </tr>
   <tr>
   <td>新额度：</td>
   <td >
    <select name="countlimit">
    <option value="1000">1000元</option>
    <option value="2000">2000元</option>
    <option value="3000">3000元</option>
    <option value="4000">4000元</option>
    <option value="5000">5000元</option>
    <option value="6000">6000元</option>
    <option value="7000">7000元</option>
    <option value="8000">8000元</option>
    <option value="9000">9000元</option>
    <option value="10000">10000元</option>
    </select>
   </td>
   </tr>
   <tr>
   <td colspan="2">
   <button id="s1">确定</button>
   </td>
   </tr>
   </table>
  </div> 
  
  
</body>
<script >
function tijiao(pageNow){
    
     $("#pageNow").val(pageNow);
       $("form").submit();
     };
  $(document).ready(function(){
	 
   $("#s1").click(function(){
         let uid=$("#s2").val();
         let countlimit=$("select[name='countlimit']").val();
         alert(uid);alert(countlimit);
         $.ajax({
          type:"post",
          url:"/wallet/updatelimit",
          data:{"uid":uid,"countlimit":countlimit},
          success:function(data){
              
       	   $('#win').window('close');  
       	   //window.location.href="/ufser/findAll";
              }
             });
       });
   $(".but1").click(function(){
	   $("#s2").val($(this).parent().prev().prev().prev().prev().prev().prev().text());
       $("#a1").text($(this).parent().prev().prev().prev().prev().prev().text());
       $("#a2").text($(this).parent().prev().prev().text());
       $('#win').window('open'); 
	   });
	   $(".but").click(function(){
      let uid=$(this).next().val();
      $.ajax({
       type:"post",
       url:"/userLogin/isdelete",
       data:{"uid":uid},
       success:function(){
            window.location.href="/userLogin/findAll";
           }
          });
      
      alert(uid);alert(isdelete);
	   }); 
	
  });

    

</script>
</html>