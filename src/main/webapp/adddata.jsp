<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>增加用户资料</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
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
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#">个人中心</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#">我的钱包</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#">登陆</a></span></td>
						<td align="center"	><span style="line-height: 50px; font-size: 20px"><a href="#">注册</a></span></td>
					</tr>
				</table>
			</div>
		</nav>
		<div class="col-md-8 col-md-offset-2">
			<form  class="form-horizontal" role="form" action="/userdata/save" method="post">
				<table class="table table-hover">
					<tr>
						<td>姓名：</td>
						<td><input name="uname" placeholder="请填写真实姓名" /></td>
					</tr>
					<tr>
						<td>性别：</td>
						<td><input type="radio" name="sex"/>男<input type="radio" name="sex"/>女</td>
					</tr>
					<tr>
						<td>年龄：</td>
						<td><input type="text" name="age"placeholder="年龄和身份证保持一致"/></td>
					</tr>
					<tr>
						<td>家庭地址：</td>
						<td>
							<div id="app">
								<select id="p" name="province" v-on:change="fillC($event.target.seleceedIndex)">
									<option v-for="p in json">{{p.pname}}</option>
								</select>
								<select id="c" name="city" v-on:change="fillZ($event.target.seleceedIndex)">
									<option v-for="c in citys">{{c.cname}}</option>
								</select>
								<select id="z" name="zone" >
									<option v-for="z in zones">{{z.zname}}</option>
								</select>
								<input name="adress" type="text" size="8" />
							</div>
						</td>
					</tr>
					<tr>
						<td>身份证正面照片：</td>
						<td><input type="file" name="photo_one"/></td>
					</tr>
					<tr>
						<td>身份证反面照片：</td>
						<td><input type="file" name="photo_two"/></td>
					</tr>
					<tr>
						<td>身份证号：</td>
						<td><input type="text" name="cardid" placeholder="请输入18位身份证号"/></td>
					</tr>
					<tr>
						<td>借款用途：</td>
						<td><select name="cause">
						<option>装修</option>
						<option>购物</option>
						<option>旅游</option>
						<option>其他</option>
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
						<option>2000以下</option>
						<option>2000--3500</option>
						<option>3500--5000</option>
						<option>5000--7000</option>
						<option>7000以上</option>
						</select></td>
					</tr>
					<tr>
						<td>备注：</td>
						<td><textarea name="remark" ></textarea> </td>
					</tr>
					<tr>
						<td colspan="1" align="center"><button type="submit" class="btn btn-danger">确认并下一步</button></td>
					</tr>
				</table>
				
			</form>
			
		</div>
</body>
</html>
<script>
	window.onload=function(){
		var vm=new Vue({
			el:"#app",
			data:{
				json:"",
				citys:"",
				zones:""
			},
			mounted:function(){
				this.fillP();
			},
			methods:{
				fillP:function(){
					this.$http({
						method:"post",
						url:"/provice/findAll",
						emulateJSON:true,
						params:{ },
					}).then(function(data){
						this.json=data.body,
						this.fillC(0);
					},function(){
						console.log("请求处理失败！");
					});
				},
				fillC:function(obj){
					this.citys=json[obj].citys;
					this.fillZ(0);
				},
				fillZ:function(obj){
					this.zones=citys[obj].zones;
				}
			}
		});
	}
	
</script>