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
			<li>权限管理</li>
		</ul>
	</div>
	<script type="text/javascript">
		function query(condition) {
			$("#keyword").attr("name", condition.value);
		}
	</script>


	<form action="${pageContext.request.contextPath}/system/adminpopedom/list.action"
		method="post" class="form-horizontal">
		<div class="row alert alert-info" style="margin: 0px; padding: 3px;">
			<div class="col-sm-3" style="margin-left: 150px">
				<select class="form-control  input-sm" onchange="query(this)"
					name="condition">
					<option value="">请选择</option>
					<option value="adminName">用户名称</option>
					<option value="departmentName">部门名称</option>
				</select>
			</div>
			<div class="col-sm-3">
				<input type="text" id="keyword" class="form-control input-sm" />
			</div>
			<input type="submit" class="btn btn-danger" value="查询" /> <input
				type="button" class="btn btn-success" value="添加"
				onClick="javascript:window.location='${pageContext.request.contextPath}/system/adminpopedom/beforeadd.action'"/>
		</div>
	</form>


	<div align="center">
		<div class="alert alert-warning"
			style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
			<button type="button" class="close" data-dismiss="alert">
				<span aria-hidden="true">&times;</span>

			</button>
			<p align="center" style="color: red;">权限信息-${info}</p>
		</div>
	</div>


	<div class="row" style="padding: 15px; padding-top: 0px;" align="right">
		<table class="table  table-condensed table-striped">
		</table>
		<display:table class="table table-condensed table-striped" name="list"
			pagesize="10"
			requestURI="${pageContext.request.contextPath }/system/adminpopedom/list.action">
			<display:column property="departmentName" title="部门名称"></display:column>
			<display:column property="adminName" title="用户名称"></display:column>
			<display:column
				href="${pageContext.request.contextPath }/system/adminpopedom/load.action"
				paramId="popedomId" paramProperty="popedomId" value="修改" title="修改"></display:column>
			<display:column
				href="${pageContext.request.contextPath }/system/adminpopedom/delete.action"
				paramId="popedomId" paramProperty="popedomId" value="删除" title="删除"></display:column>

		</display:table>
	</div>

</body>
</html>
