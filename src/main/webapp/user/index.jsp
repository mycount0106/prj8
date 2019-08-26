<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/p2p.css">
    <script src="js/jquery-1.12.4.js"></script>
   <script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-default">
			<div class="col-md-5">
			<span style="line-height: 50px; font-size: 20px">ä½ æè´·å®¢æçµè¯ï¼400600800</span>
			</div>
			<div class="col-md-7">
				<table class="col-md-10">
					<tr>
						<td align="center"><span style="line-height: 50px; font-size: 20px";><a href="#">é¦é¡µ</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#">å¸®å©ä¸­å¿</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="/userdata/findMyCentre?uid=${user.uid }">ä¸ªäººä¸­å¿</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="/wallet/findOne?uid=${user.uid}">æçé±å</a></span></td>
						<c:if test="${user!=null }">
						<td align="center"><span style="line-height: 50px; font-size: 20px">${user.uname }</span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="reg">éåºç»é</a></span></td>
					    </c:if>
					  <c:if test="${user==null }">
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="login">ç»é</a></span></td>
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#" id="reg">æ³¨å</a></span></td>
					   </c:if>
					</tr>
					
				</table>
			</div>
		</nav>
   
<div class="content">
    <div class="con_in">
        <h1 class="con"><a href="#"></a></h1>
        <ul class="foo">
            <li><a>ç´¯è®¡æäº¤é¢<span>&nbsp;1&nbsp;2&nbsp;3&nbsp;</span>äº¿</a></li>
            <li><a>æ³¨åæ³¨åäººæ°<span>&nbsp;1&nbsp;2&nbsp;3&nbsp;</span>ä¸</a></li>
        </ul>
    </div>
</div>
<div class="next">
    <div class="first">
        <div class="card_title">æ¨èåºå</div>
        <div class="card_time">12ä¸ªææå¡æé</div>
        <div class="card_rate">9.5%</div>
        <div class="card_desc">æè´¹åå¹´å©ç</div>
        <button>ææåºå</button>
    </div>
    <div class="second">
        <div class="card_title">æ°æä¸äº«</div>
        <div class="card_time">1ä¸ªææå¡æé</div>
        <div class="card_rate">10%</div>
        <div class="card_desc">æè´¹åå¹´å©ç</div>
        <button>ææåºå</button>
    </div>
    <div class="third">
        <div class="card_title">Uäº«æå¡</div>
        <div class="card_time">1-36ä¸ªææå¡æé</div>
        <div class="card_rate">5.0%~11.0%</div>
        <div class="card_desc">æè´¹åå¹´å©ç</div>
        <button>ææåºå</button>
    </div>

</div>
<div class="copyright">
    <div class="title"><h1>åä½è¿è¥ï¼æä»¬ä¸æ¾æ¾æ</h1></div>
</div>
<div class="dess_top">
    <div class="dess_left">
        <div class="credit_title"><h2>é¶è¡èµéå­ç®¡</h2></div>
        <div class="credit_desc"></div>
    </div>
    <div class="dess_right">

    </div>
</div>
    <div class="dess_bottom">
        <div class="dess_left">
            <div class="credit_title"><h2>é¶è¡èµéå­ç®¡</h2></div>
            <div class="credit_desc"></div>
        </div>
        <div class="dess_right">

        </div>
    </div>
    <!-- ç»éæ¨¡æå -->
		<div class="modal" id="modalLogin">
		  <div class="modal-dialog">
		  <div class="modal-content">
		  <div class="modal-header"> æ¬¢è¿ç»é</div>
		  <div class="modal-body">
		  <form action="#" method="post">
		  <div class="form-group">
		  <label>ç¨æ·åï¼</label><input name="uname" class="form-control" id="loginUname"/><span id="error"></span>
		  </div>
		  <div class="form-group">
		  <label>å¯ç ï¼</label><input name="password" class="form-control" type="password" id="loginPassword"/>
		  <div class="modal-footer">
		  <button class="btn btn-danger" type="button"id="close1">åæ¶</button>
		   <button class="btn btn-info btn-primary" type="button" id="login11">ç»é</button>
		  </div>
		  </div>
		  </form>
		  </div>
		  </div>
		  </div>
		</div>
		<!-- æ³¨åæ¨¡æå -->
		<div class="modal" id="modalreg">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">æ¬¢è¿æ³¨å</div>
					<div class="modal-body">
						<form class="form-group" action="#" method="post">
							<div class="form-group">
							<label>ç¨æ·åï¼</label><input id="regUname" class="form-control"name="uname" type="text" placeholder="è¯·è¾å¥ç¨æ·åï¼" /><span id="regmge"></span>
						    </div>
						    <div class="form-group">
						    <label>å¯ç ï¼</label><input id="regPassword" class="form-control" name="password" type="password" placeholder="è¯·è¾å¥å¯ç ï¼" />
						    </div>
						    <div class="form-group">
						    <label>ç¡®è®¤å¯ç ï¼</label><input class="form-control" name="password1" type="password" placeholder="è¯·åæ¬¡è¾å¥å¯ç ï¼" />
						    </div>
						    <div class="form-group">
						    <label>ææºå·ï¼</label><input id="regPhone"class="form-control" name="phone" type="text" placeholder="è¯·è¾å¥11ä½ææºå·ç ï¼ï¼" /><button id="sendcode" class="btn">åééªè¯ç </button><span id="smsmegs"></span>
						    </div>
						    <div class="form-group">
						    <label>éªè¯ç ï¼</label><input id="regCode" class="form-control" name="code" type="text" placeholder="è¯·è¾å¥4ä½éªè¯ç ï¼ï¼" />
						    </div>
					<div class="modal-footer">
						<button type="button" class="btn btn-danger"id="close2">åæ¶</button>
						<button class="btn btn-info btn-primary" type="button" id="regAjax">æ³¨å</button>
					</div>
					</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>
<script>
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