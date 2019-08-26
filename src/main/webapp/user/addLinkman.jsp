<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>增加用户联系人</title>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
			<div class="col-md-5">
			<span style="line-height: 50px; font-size: 20px">你我贷客服电话：400600800</span>
			</div>
			<div class="col-md-7">
				<table class="col-md-10">
					<tr>
						<td align="center"><span style="line-height: 50px; font-size: 20px";><a href="#">首页</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#">帮助中心</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="/userdata/findMyCentre?uid=${user.uid }">个人中心</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="/wallet/findOne?uid=${user.uid}">我的钱包</a></span></td>
						<c:if test="${user!=null }">
						<td align="center"><span style="line-height: 50px; font-size: 20px">${user.uname }</span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="reg">退出登陆</a></span></td>
					    </c:if>
					  <c:if test="${user==null }">
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="login">登陆</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="reg">注册</a></span></td>
					   </c:if>
					</tr>
					
				</table>
			</div>
		</nav>
		<div class="col-md-8 col-md-offset-2" style="color: green;"><h3 >增加联系人</h3></div>
		<div class="col-md-8 col-md-offset-2">
		<form action="/linkman/save" method="post">
		<table class="table table-hover" ">
		<tr class="danger" >
		<td align="center">联系人名称</td>
		<td>关系</td>
		<td>电话号码</td>
		</tr>
		<tr>
		<td align="center"><input name="linkname" type="text"/></td>
		<td>
		<select name="relation">
		<option value="亲属">亲属</option>
		<option value="朋友">朋友</option>
		<option value="同事">同事</option>
		<option value="其他">其他</option>
		</select>
		</td>
		<td><input name="phone" type="text"/></td>
		</tr>
		<tr>
		<td align="center"><input name="linkname" type="text"/></td>
		<td>
		<select name="relation">
		<option value="亲属">亲属</option>
		<option value="朋友">朋友</option>
		<option value="同事">同事</option>
		<option value="其他">其他</option>
		</select>
		</td>
		<td><input name="phone" type="text"/></td>
		</tr>
		<tr>
		<td colspan="3" align="center"><input name="uid" type="hidden" value="${user.uid }" /></td>
		</tr>
		<tr>
		<td colspan="3" align="center"><button class="btn btn-success" id="sub">确认并提交</button></td>
		</tr>
		</table>
		</div>	
		</form>
		<!-- 登陆模态块 -->
		<div class="modal" id="modalLogin">
		  <div class="modal-dialog">
		  <div class="modal-content">
		  <div class="modal-header"> 欢迎登陆</div>
		  <div class="modal-body">
		  <form action="#" method="post">
		  <div class="form-group">
		  <label>用户名：</label><input name="uname" class="form-control" id="loginUname"/><span id="error"></span>
		  </div>
		  <div class="form-group">
		  <label>密码：</label><input name="password" class="form-control" type="password" id="loginPassword"/>
		  <div class="modal-footer">
		  <button class="btn btn-danger" type="button"id="close1">取消</button>
		   <button class="btn btn-info btn-primary" type="button" id="login11">登陆</button>
		  </div>
		  </div>
		  </form>
		  </div>
		  </div>
		  </div>
		</div>
		<!-- 注册模态块 -->
		<div class="modal" id="modalreg">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">欢迎注册</div>
					<div class="modal-body">
						<form class="form-group" action="#" method="post">
							<div class="form-group">
							<label>用户名：</label><input id="regUname" class="form-control"name="uname" type="text" placeholder="请输入用户名：" /><span id="regmge"></span>
						    </div>
						    <div class="form-group">
						    <label>密码：</label><input id="regPassword" class="form-control" name="password" type="password" placeholder="请输入密码：" />
						    </div>
						    <div class="form-group">
						    <label>确认密码：</label><input class="form-control" name="password1" type="password" placeholder="请再次输入密码：" />
						    </div>
						    <div class="form-group">
						    <label>手机号：</label><input id="regPhone"class="form-control" name="phone" type="text" placeholder="请输入11位手机号码：：" /><button id="sendcode" class="btn">发送验证码</button><span id="smsmegs"></span>
						    </div>
						    <div class="form-group">
						    <label>验证码：</label><input id="regCode" class="form-control" name="code" type="text" placeholder="请输入4位验证码：：" />
						    </div>
					<div class="modal-footer">
						<button type="button" class="btn btn-danger"id="close2">取消</button>
						<button class="btn btn-info btn-primary" type="button" id="regAjax">注册</button>
					</div>
					</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>
<script>

	$(document).ready(function(){
		$("#login").click(function(){
			$("#modalLogin").modal("show");
		});
		$("#reg").click(function(){
			$("#modalreg").modal("show");
		});
		$("#close1").click(function(){
			$("#modalLogin").modal("hide");
		});
		$("#close2").click(function(){
			$("#modalreg").modal("hide");
		});
		$("#login11").click(function(){
			
	         var uname=$("#loginUname").val();
	         var password=$("#loginPassword").val();
	         $.ajax({
	             type:"post",
	             url:"/userLogin/login",
	             data:{"uname":uname,"password":password},
	             success:function(data){
	                 if(data!=null){
	                   alert(data);
	                	 $("#error").val("登陆成功 ");
	                  }else{
		                  alert(1);
	                     $("#error").val("用户名或密码错误 ");
	                      }
	                 },
	             
	             });
			});
		$("#sendcode").click(function(){
			
	        
	        var phone=$("input[name=phone]").val();
	        $.ajax({
	            type:"post",
	            url:"/userLogin/SmS",
	            data:{"phone":phone},
	            success:function(data){
	                $("#smsmegs").val(data);
	                }
	            
	            });
			}); 
		$("#regAjax").click(function(){
			var uname=$("#regUname").val();
			var password=$("#regPassword").val();
			var phone=$("#regPhone").val();
			var code=$("#regCode").val();
			 $.ajax({
	             type:"post",
	             url:"/userLogin/reg",
	             data:{"uname":uname,"password":password,"phone":phone,"code":code},
	             success:function(data){
	                 if(data!=null){
	                	 $("#regmge").val(data);
	           			
	                  }
	                 }
	             
	             });
			});
	  $("#sub").click(function(){
           alert("已提交资料,您可以通过我的钱包查看额度 ");

		  });
	});
	
</script>