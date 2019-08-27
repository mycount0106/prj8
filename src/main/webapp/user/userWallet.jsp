<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个人中心</title>
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
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="removeLogin">退出登陆</a></span></td>
					    </c:if>
					  <c:if test="${user==null }">
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="login">登陆</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="reg">注册</a></span></td>
					   </c:if>
					</tr>
					
				</table>
			</div>
		</nav>
		<div class="col-md-8 col-md-offset-2">
		<div class="col-md-8 "><h3>资产总览</h3></div>
		<table class="table">
		<tr>
		<td>账户金额：</td>
		<td>${wallet.money }<input type="hidden" name="user" value="${user.uid }" /></td>
		</tr>
		<tr>
		<td>总额度：</td>
		<td>${wallet.countlimit }</td>
		</tr>
		<tr>
		<td>可用额度：</td>
		<td>${wallet.canlimit }</td>
		</tr>
		<tr>
		<td>支付宝账户：</td>
		<td>${wallet.account }</td>
		</tr>
		<tr>
		<td>支付密码：</td>
		<c:if test="${wallet.password!=null }">
		<td><button class="btn a1">修改密码</button></td>
		</c:if>
		<c:if test="${wallet.password==null }">
		<td><button class="btn a1">设置密码</button></td>
		</c:if>
		</tr>
		</table>
		</div>
		<div id="pas"class="col-md-8 col-md-offset-2">
		<div class="col-md-8 "><h3>修改密码</h3></div>
		<table class="table col-md-8">
		<tr>
		<td><div>登陆密码：</div></td>
		<td><div><input type="password" id="upas"/></div></td>
		</tr>
		<tr>
		<td><div>设置支付密码：</div></td>
		<td><div><input type="password" id="wpas"/></div></td>
		</tr>
		<tr>
		<td colspan="1" align="center"><button class="btn btn-success" id="updataPas">确定</button></td>
		
		</tr>
		</table>
		</div>
		<div class="col-md-8 col-md-offset-2">
		<div class="col-md-8 "><h3>我的借款</h3></div>
		<table class="table col-md-8">
		<tr>
		<td><div>暂无数据</div></td>
		</tr>
		
		</table>
		</div>
		<div class="col-md-8 col-md-offset-2">
		<div class="col-md-8 "><h3>我的理财</h3></div>
		<table class="table col-md-8">
		<tr>
		<td><div>暂无数据</div></td>
		</tr>
		
		</table>
		</div>
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
		 $("#pas").hide();
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
		$(".a1").click(function(){
           $("#pas").show(1000);
			});
		$("#login11").click(function(){
			
	         var uname=$("#loginUname").val();
	         var password=$("#loginPassword").val();
	         $.ajax({
	             type:"post",
	             url:"/userLogin/login",
	             data:{"uname":uname,"password":password},
	             success:function(data){
	            	 if(data==0){
		                   alert("登陆成功 ");
		                   $("#modalLogin").modal("hide");
		                   window.location.reload();
		                	
		                  }else{
			                  alert("用户名或密码错误 ");
		                     
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
	  $("#updataPas").click(function(){
         alert(1);
          var uid=$("input[name=user]").val();
	      var password=$("#upas").val();
        var password1=$("#wpas").val();
        $.ajax({
            type:"post",
            url:"/wallet/update",
            data:{"uid":uid,"password":password,"password1":password1},
            success:function(data){
               if(data!=null){
                   alert("修改成功 ");
                   $("#pas").hide();
                   }else{
                   alert("密码不正确 ");
                       }
                }
            });
		  });
	  $("#removeLogin").click(function(){
	         $.ajax({
	               type:"post",
	               url:"/userLogin/removeLogin",
	               success:function(data){
	                 alert(data);
	                 window.location.reload();
	                   }
	             });

			});
	});
	
</script>