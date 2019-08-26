<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/p2p.css">
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script
	src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="col-md-5">
			<span style="line-height: 50px; font-size: 20px">你我贷客服电话：400600800</span>
		</div>
		<div class="col-md-7">
			<table class="col-md-10">
				<tr>
					<td align="center"><span
						style="line-height: 50px; font-size: 20px";><a href="#">首页</a></span></td>
					<td align="center"><span
						style="line-height: 50px; font-size: 20px"><a href="#">帮助中心</a></span></td>
					<td align="center"><span
						style="line-height: 50px; font-size: 20px"><a
							href="/userdata/findMyCentre?uid=${user.uid }">个人中心</a></span></td>
					<td align="center"><span
						style="line-height: 50px; font-size: 20px"><a
							href="/wallet/findOne?uid=${user.uid}">我的钱包</a></span></td>
					<c:if test="${user!=null }">
						<td align="center"><span
							style="line-height: 50px; font-size: 20px">${user.uname }</span></td>
						<td align="center"><span
							style="line-height: 50px; font-size: 20px"><a href="#"
								id="reg1">退出登陆</a></span></td>
					</c:if>
					<c:if test="${user==null }">
						<td align="center"><span
							style="line-height: 50px; font-size: 20px"><a href="#"
								id="login">登陆</a></span></td>
						<td align="center"><span
							style="line-height: 50px; font-size: 20px"><a href="#"
								id="reg">注册</a></span></td>
					</c:if>
				</tr>
			</table>
		</div>
	</nav>
	<div class="line">
		<hr>
	</div>
	<div class="top">
		<div class="top_left">
			<h1 class="logo">
				<a href="#"></a>
			</h1>
		</div>
	</div>
	<div class="content">
		<div class="con_in">
			<h1 class="con">
				<a href="#"></a>
			</h1>
			<ul class="foo">
				<li><a>累计成交额<span>&nbsp;1&nbsp;2&nbsp;3&nbsp;</span>亿
				</a></li>
				<li><a>注册注册人数<span>&nbsp;1&nbsp;2&nbsp;3&nbsp;</span>万
				</a></li>
			</ul>
		</div>
	</div>
	<div class="novice">
		<div class="novice-exclusive-box">
			<div class="novice-top fn-clear">
				<div class="no-top-l">
				<span>薪享服务</span>
				<em>12个月服务期限</em>
				</div>
			</div>
			<div class="plan clearfix">
					<div class="p-rate">
						"10"<span class="percent">%</span>
						<div class="b-text">折费后年利率</div>
					</div>
					<div class="p-month">
						<div class="t-text">1个月</div>
						<div class="b-text">服务期限</div>
					</div>
					<div class="p-month">
						<div class="t-text">10,000元</div>
						<div class="b-text">授权出借上限</div>
					</div>
					<div class="p-title">
						<div class="p-title-text">新手专享，限投一次</div>
					</div>
					<div class="p-join pt7">
						<a href="">授权出借</a>
					</div>
			</div>
		</div>
	</div>
	<div class="compliance-uplan">
		<div class="novice-top">
			<div class="no-top-l">
				<span>U享服务</span>
				<span class="product-period-intro">12个月服务期限</span>
			</div>
			<div class="no-top-r hover">
				<a class="tu" href=""></a>
				<a class="zi" href="">查看更多</a>
			</div>
		</div>
		<div class="index-uplan-box clearfix">
					<div class="p-rate">
						<div>
						"9.5"<span class="percent">%</span>
						</div>
						<div class="b-text">折费后年利率</div>
					</div>
					<div class="p-month">
						<div class="t-text">12个月</div>
						<div class="b-text">固定服务期限</div>
					</div>
					<div class="p-month">
						<div class="t-text">1000元</div>
						<div class="b-text">最低授权本金</div>
					</div>
					<div class="p-title">
						<div class="p-title-text">分散投标，专业风控</div>
					</div>
					<div class="p-join pt7">
						<a href="">授权出借</a>
					</div>
		</div>
	</div>
		<div class="home-container">
			<div class="compliance-container salary-container salary">
				<div class="caption clearfix">
					<div class="l-title">
						<div>薪享服务</div>
						<span>12个月服务期限</span>
					</div>
					<a class="r-more" href="">
						<span more-link>查看更多</span>
						<img class="more-bg" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAMAAABEpIrGAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyNpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RjE0RTY0N0FDMEUxMTFFNjhBRDk5MjJEODM3NDJCMEMiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RjE0RTY0NzlDMEUxMTFFNjhBRDk5MjJEODM3NDJCMEMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NDg5NUFCMUFCQzI3MTFFNkEyNjNCMTg1NTI1M0REREMiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NDg5NUFCMUJCQzI3MTFFNkEyNjNCMTg1NTI1M0REREMiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4gNS6dAAAANlBMVEXa2tro6Ojd3d35+fn4+Pjg4OD9/f3h4eHy8vLr6+vb29vn5+fx8fHq6ur6+vrc3NzZ2dn///9/BJNqAAAAEnRSTlP//////////////////////wDiv78SAAAAz0lEQVR42oyT2RaDIAxEE9m1DeH/f7ZoqyxR6Dwpc88hZBJIl6xHFwGiQ2/LKZwfhCtfWpF6IAA3gtAAZFjIUAF05BtFfQJ062eCfoDhB5kvEPhRYQeo1L+8usuAMoDl/yXKxQS26k9UPbFa8E3dKqmW8IA8JBAcDwkHfZM6IsfLkrBbeagE9v7pChA5LJRoqa5wQz8XiUM/P9MP/dyoutXSB9uEJfw9rDpu3ftH3NXAbLr1+f3fyM2Hdjr288WZr96xvBUCqMR2P63/R4ABAOBSOtarLmH+AAAAAElFTkSuQmCC">
					</a>
				
				</div>	
				<div class="plan clearfix">
					<div class="p-rate">
						<div>
						"8"<span class="percent">%</span>
						</div>
						<div class="b-text">折费后年利率</div>
					</div>
					<div class="p-start">
						<div class="t-text">每月500元</div>
						<div class="b-text">出借起点</div>
					</div>
					<div class="p-month">
						<div class="t-text">12个月</div>
						<div class="b-text">服务期限</div>
					</div>
					<div class="p-day">
						<div class="t-text">26日</div>
						<div class="b-text">每月出借日</div>
					</div>
					<div class="p-join pt7">
						<a href="">授权出借</a>
						<div class="b-text">剩余名额184人</div>
					</div>
				
				
				</div>	
			</div>
			<a class="invite-friend" href=""></a>
	</div>
	<!-- 登陆模态块 -->
	<div class="modal" id="modalLogin">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">欢迎登陆</div>
				<div class="modal-body">
					<form action="#" method="post">
						<div class="form-group">
							<label>用户名：</label><input name="uname" class="form-control"
								id="loginUname" /><span id="error"></span>
						</div>
						<div class="form-group">
							<label>密码：</label><input name="password" class="form-control"
								type="password" id="loginPassword" />
							<div class="modal-footer">
								<button class="btn btn-danger" type="button" id="close1">取消</button>
								<button class="btn btn-info btn-primary" type="button"
									id="login11">登陆</button>
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
							<label>用户名：</label><input id="regUname" class="form-control"
								name="uname" type="text" placeholder="请输入用户名：" /><span
								id="regmge"></span>
						</div>
						<div class="form-group">
							<label>密码：</label><input id="regPassword" class="form-control"
								name="password" type="password" placeholder="请输入密码：" />
						</div>
						<div class="form-group">
							<label>确认密码：</label><input class="form-control" name="password1"
								type="password" placeholder="请再次输入密码：" />
						</div>
						<div class="form-group">
							<label>手机号：</label><input id="regPhone" class="form-control"
								name="phone" type="text" placeholder="请输入11位手机号码：：" />
							<button id="sendcode" class="btn">发送验证码</button>
							<span id="smsmegs"></span>
						</div>
						<div class="form-group">
							<label>验证码：</label><input id="regCode" class="form-control"
								name="code" type="text" placeholder="请输入4位验证码：：" />
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-danger" id="close2">取消</button>
							<button class="btn btn-info btn-primary" type="button"
								id="regAjax">注册</button>
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
	});
</script>
