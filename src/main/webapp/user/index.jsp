<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/p2p.css">
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
						<td align="center"><span style="line-height: 50px; font-size: 20px"><a href="#">个人中心</a></span></td>
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
    <div class="line">
        <hr>
    </div>
    <div class="top">
        <div class="top_left">
        <h1 class="logo"><a href="#"></a></h1>
        </div>
    </div>
<div class="content">
    <div class="con_in">
        <h1 class="con"><a href="#"></a></h1>
        <ul class="foo">
            <li><a>累计成交额<span>&nbsp;1&nbsp;2&nbsp;3&nbsp;</span>亿</a></li>
            <li><a>注册注册人数<span>&nbsp;1&nbsp;2&nbsp;3&nbsp;</span>万</a></li>
        </ul>
    </div>
</div>
<div class="next">
    <div class="first">
        <div class="card_title">推荐出借</div>
        <div class="card_time">12个月服务期限</div>
        <div class="card_rate">9.5%</div>
        <div class="card_desc">折费后年利率</div>
        <button>授权出借</button>
    </div>
    <div class="second">
        <div class="card_title">新手专享</div>
        <div class="card_time">1个月服务期限</div>
        <div class="card_rate">10%</div>
        <div class="card_desc">折费后年利率</div>
        <button>授权出借</button>
    </div>
    <div class="third">
        <div class="card_title">U享服务</div>
        <div class="card_time">1-36个月服务期限</div>
        <div class="card_rate">5.0%~11.0%</div>
        <div class="card_desc">折费后年利率</div>
        <button>授权出借</button>
    </div>

</div>
<div class="copyright">
    <div class="title"><h1>合作运营，我们不曾松懈</h1></div>
</div>
<div class="dess_top">
    <div class="dess_left">
        <div class="credit_title"><h2>银行资金存管</h2></div>
        <div class="credit_desc"></div>
    </div>
    <div class="dess_right">

    </div>
</div>
    <div class="dess_bottom">
        <div class="dess_left">
            <div class="credit_title"><h2>银行资金存管</h2></div>
            <div class="credit_desc"></div>
        </div>
        <div class="dess_right">

        </div>
    </div>
</body>
</html>