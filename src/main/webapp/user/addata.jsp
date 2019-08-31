<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>增加用户资料</title>
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
						<td align="center"><span style="line-height: 50px; font-size: 20px";><a href="/user/index.jsp">首页</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="/inform/findAllByHelp">帮助中心</a></span></td>
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
			<form  class="form-horizontal" role="form" action="/userdata/save" method="post" enctype="multipart/form-data">
				<table class="table table-hover">
					<tr>
						<td>姓名：</td>
						<td><input name="uname" placeholder="请填写真实姓名" /></td>
					</tr>
					<tr>
						<td>性别：</td>
						<td><input type="radio" name="sex" value="0" />男<input type="radio" name="sex" value="1"/>女</td>
					</tr>
					<tr>
						<td>年龄：</td>
						<td><input type="text" name="age"placeholder="年龄和身份证保持一致"/></td>
					</tr>
					<tr>
						<td>家庭地址：</td>
						<td>
							<div id="app">
								<select id="p" name="province" v-on:change="fillC($event.target.selectedIndex)">
									<option v-for="p in json">{{p.pname}}</option>
								</select>
								<select id="c" name="city" v-on:change="fillZ($event.target.selectedIndex)">
									<option v-for="c in citys">{{c.cname}}</option>
								</select>
								<select id="z" name="zone" >
									<option v-for="z in zones">{{z.zname}}</option>
								</select>
								</div>
								<input name="adress" type="text" size="8" />
						</td>
					</tr>
					<tr>
						<td>身份证正面照片：</td>
						<td><input type="file" name="files"/></td>
					</tr>
					<tr>
						<td>身份证反面照片：</td>
						<td><input type="file" name="files"/></td>
					</tr>
					<tr>
						<td>身份证号：</td>
						<td><input type="text" name="cardid" placeholder="请输入18位身份证号"/></td>
					</tr>
					<tr>
						<td>借款用途：</td>
						<td><select name="cause">
						<option value="装修">装修</option>
						<option value="购物">购物</option>
						<option value="旅游">旅游</option>
						<option value="其他">其他</option>
						</select>
						</td>
					</tr>
					<tr>
						<td>公司名称：</td>
						<td><input type="text" name="company"/></td>
					</tr>
					<tr>
						<td>职位：</td>
						<td><input type="text" name="position"/></td>
					</tr>
					<tr>
						<td>月收入：</td>
						<td><select name="income">
						<option value="2000以下">2000以下</option>
						<option value="2000--3500">2000--3500</option>
						<option value="3500--5000">3500--5000</option>
						<option value="5000--7000">5000--7000</option>
						<option value="7000以上">7000以上</option>
						</select></td>
					</tr>
					<tr>
						<td>备注：</td>
						<td><textarea name="remark" ></textarea>
						<input name="uid" type="hidden" value="${user.uid }"/>
						 </td>
					</tr>
					<tr>
						<td colspan="1" align="center"><button type="submit" class="btn btn-danger">确认并下一步</button></td>
					</tr>
				</table>
				
			</form>
			
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
	window.onload=function(){
		var vm=new Vue({
			el:"#app",
			data:{
				json:'',
				citys:'',
				zones:''
			},
			mounted:function(){
				this.fillP();
			},
			methods:{
				fillP:function(){
					this.$http({
						method:'post',
						url:'/province/findAll',
						emulateJSON:true,
						parames:{ },
					}).then(function(data){
						this.json=data.body,
						this.fillC(0);
					},function(){
						console.log("请求处理失败！");
					});
				},
				fillC:function(obj){
					this.citys=this.json[obj].citys;
					this.fillZ(0);
				},
				fillZ:function(obj){
					this.zones=this.citys[obj].zones;
				}
			}
		});
	};
	$(document).ready(function(){
		$("#login").click(function(){
			$("#modalLogin").modal("show")
		});
		$("#reg").click(function(){
			$("#modalreg").modal("show")
		});
		$("#close1").click(function(){
			$("#modalLogin").modal("hide")
		});
		$("#close2").click(function(){
			$("#modalreg").modal("hide")
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
                 }
             
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