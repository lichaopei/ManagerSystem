<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>

<%@ include file="/view/public/common.jspf"%>

</head>

<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px;">
			<li><a href="#">系统功能</a></li>
			<li>用户管理</li>
		</ul>
	</div>
	<script type="text/javascript">
		function query(condition) {
			$("#keyword").attr("name", condition.value);
		}
	</script>


	<form action="${pageContext.request.contextPath}/system/admin/list.action"
		method="post" class="form-horizontal">
		<div class="row alert alert-info" style="margin: 0px; padding: 3px;">
			 <input type="button"  style="margin-left: 500px"  class="btn btn-success" value="添加"
				onClick="javascript:window.location='${pageContext.request.contextPath}/view/system/admin/admin_add.jsp'" />
		</div>
	</form>


	<div align="center">
		<div class="alert alert-warning"
			style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
			<button type="button" class="close" data-dismiss="alert">
				<span aria-hidden="true">&times;</span>

			</button>
			<p align="center" style="color: red;">用户信息-${info}</p>
		</div>
	</div>


	<div class="row" style="padding: 15px; padding-top: 0px;" align="right">
		<table class="table  table-condensed table-striped">
		</table>
		<display:table class="table table-condensed table-striped" name="list"
			pagesize="10"
			requestURI="${pageContext.request.contextPath }/system/admin/list.action">
			<display:column property="adminAccount" title="账号"></display:column>
			<display:column property="adminPwd" title="密码"></display:column>
			<display:column property="adminState" title="启用状态"></display:column>
			<display:column property="adminRight" title="是否是超级管理员"></display:column>
			<display:column property="adminName" title="用户姓名"></display:column>
			<display:column
				href="${pageContext.request.contextPath }/system/admin/load.action"
				paramId="adminId" paramProperty="adminId" value="修改" title="修改"></display:column>
			<display:column
				href="${pageContext.request.contextPath }/system/admin/delete.action"
				paramId="adminId" paramProperty="adminId" value="删除" title="删除"></display:column>

		</display:table>


	</div>

</body>
</html>
