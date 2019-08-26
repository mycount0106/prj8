<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/vue/2.6.10/vue.js"></script>
<script src="https://cdn.bootcss.com/vue-resource/1.5.1/vue-resource.js"></script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/js/bootstrap.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
   <div id="app" class="container">
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">产品管理</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

 <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="addproduct.jsp">添加产品</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
	 <form class = “form-horizo​​ntal”  role = “form” >
	<div class="form-group">
		<label class="col-sm-2 control-label">产品编号</label>
		<div class="col-sm-10">
			<input class="form-control" id="focusedInput" type="text"  value="该输入框获得焦点...">
		</div>
	</div>
	<div class="form-group">
		<label for="inputPassword" class="col-sm-2 control-label">
			产品名称
		</label>
		<div class="col-sm-10">
			<input class="form-control" 	type="text" placeholder="该输入框禁止输入..." disabled>
		</div>
	</div>
	<fieldset disabled>
		<div class="form-group">
			<label for="disabledTextInput"  class="col-sm-2 control-label">禁用输入（Fieldset disabled）
			</label>
			<div class="col-sm-10">
				<input type="text" id="disabledTextInput" class="form-control"  placeholder="禁止输入">
			</div>
		</div>
		<div class="form-group">
			<label for="disabledSelect"  class="col-sm-2 control-label">禁用选择菜单（Fieldset disabled）
			</label>
			<div class="col-sm-10">
				<select id="disabledSelect" class="form-control">
					<option>禁止选择</option>
				</select>
			</div>
		</div>
	</fieldset>
	<div class="form-group has-success">
		<label class="col-sm-2 control-label" for="inputSuccess">
			输入成功
		</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="inputSuccess">
		</div>
	</div>
	<div class="form-group has-warning">
		<label class="col-sm-2 control-label" for="inputWarning">
			输入警告
		</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="inputWarning">
		</div>
	</div>
	<div class="form-group has-error">
		<label class="col-sm-2 control-label" for="inputError">
			输入错误
		</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="inputError">
		</div>
	</div>
</form>
	 
		
	
	
	
	
	
	
	
	
	
	
	
	</form>
</div>		

	 




</body>
<script>
window.onload = function(){
	 $(".form-horizontal").hide();
    new Vue({
        el : '#app',
        data :{
        	 json:'',
        	 id:'',
        	 pageNow:1,
	         limit:10
        },
        mounted:function(){
        	this.get();
        },
        methods:{
        	 get:function(){
	            	this.$http({
	                	method:'get',
	                	url:'/api/productall',
	                	emulateJSON:true, 
	                	params:{
	                		pageNow:this.pageNow,
	                		limit:this.limit,
	                	},	
	                }).then(function(res){
	                	 this.json=res.body;
	                },function(){
	                    console.log('请求失败处理');
	              }); 
	         },
	         del:function(index){
	        	 this.$http({
	                	method:'delete',
	                	url:'/api/del',
	                	emulateJSON:false, 
	                	params:{
	                		id:index
	                	},	
	                }).then(function(){
	                	this.get();
	                },function(){
	                    console.log('请求失败处理');
	              }); 

	        	 
		         },
					refresh:function(index){
		        	 this.$http({
		                	method:'post',
		                	url:'/api/revoke',
		                	emulateJSON:false, 
		                	params:{
		                		id:index
		                	},	
		                }).then(function(){
		                	this.get();
		                },function(){
		                    console.log('请求失败处理');
		              }); 

		        	 
			         }
        },
    });
$("btn btn-primary btn-lg").click(function(){
	 $(".form-horizontal").show();
});
   
}
</script>
