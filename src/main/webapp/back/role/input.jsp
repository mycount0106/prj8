<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="<%=basePath%>js/jquery-3.4.1.min.js"></script>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="<%=basePath%>css/demo.css" type="text/css">
	<link rel="stylesheet" href="<%=basePath%>css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.excheck-3.5.js"></script>
<title>Insert title here</title>
	<script type="text/javascript">
	<!--
	var setting = {
			check: {
				enable: true
			},
			data: {
				simpleData: {
					enable:true,
					idKey: "tid",
					pIdKey: "pid",
					rootPId: ""
				}
			}
		};

		var zNodes =${alltree};
		
		var code;
		
		function setCheck() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			py = $("#py").attr("checked")? "p":"",
			sy = $("#sy").attr("checked")? "s":"",
			pn = $("#pn").attr("checked")? "p":"",
			sn = $("#sn").attr("checked")? "s":"",
			type = { "Y":py + sy, "N":pn + sn};
			setting.check.chkboxType = { "Y" : "ps", "N" : "ps" };
			zTree.setting.check.chkboxType = { "Y" : "ps", "N" : "ps" };
		}
		function showCode(str) {
			if (!code) code = $("#code");
			code.empty();
			code.append("<li>"+str+"</li>");
		}
		
		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			setCheck();
			$("#py").bind("change", setCheck);
			$("#sy").bind("change", setCheck);
			$("#pn").bind("change", setCheck);
			$("#sn").bind("change", setCheck);
			
			zTree = $.fn.zTree.getZTreeObj("treeDemo");//treeDemo界面中加载ztree的div

		/* 	alert("${role.trees}") */
			<c:forEach items="${role.trees}" var="t">
			var node = zTree.getNodeByParam("tid",${t.tid });
			zTree.checkNode(node,true,false);//将指定ID的节点选中
			</c:forEach>
			
		});
		//-->
		function dosave(){
			var zTreeObj = $.fn.zTree.getZTreeObj("treeDemo");
			var tids = "";
			var checkedNodes = zTreeObj.getCheckedNodes();
			for(var i=0;i<checkedNodes.length;i++){
				tids +=checkedNodes[i].tid;
				if(i<checkedNodes.length-1){
					tids +=",";
				}
				$("input[name=tids]").val(tids);
				document.forms[0].submit();
			}
		}
	</script>
</head>
<body>
	用户管理
	<form action="${role==null?'save':'update' }" method="post">
		<input type="hidden" name="rid" value="${role.rid }">
		<input type="hidden" name="tids">
		rname<input type="text" name="rname" value="${role.rname }"/>
		请选择角色:
		<div class="content_wrap">
			<div class="zTreeDemoBackground left">
				<ul id="treeDemo" class="ztree"></ul>
			</div>
		</div>
		<input type="button" onclick="dosave()" value="${role==null?'添加用户':'更新' }"/>
	</form>
</body>
</html>
