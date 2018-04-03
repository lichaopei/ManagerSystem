<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<li>修改用户</li>
		</ul>
	</div>
	<!-- 显示错误信息 -->
	<div align="center">
		<div class="alert alert-warning"
			style="margin: 0px; padding: 5px; width: 100%;display:${empty allErrors?'none':'block'} ">
			<c:forEach items="${allErrors}" var="error">
			 	${error.defaultMessage }<br />
			</c:forEach>
		</div>
	</div>

	<form action="${pageContext.request.contextPath}/system/admin/update.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">账号</label>
					<div class="col-sm-9">
						<input type="text" name="adminId" value="${admin.adminId}" style="display: none;">
						<input type="text" name="adminAccount" value="${admin.adminAccount}"
							class="form-control input-sm" />
					</div>
				</div>
			</div>

		</div>
		<!-- 开始2 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">密码</label>
					<div class="col-sm-5">
						<input type="text" id="adminpwd" name="adminPwd"
							 value="${admin.adminPwd}"
							class="form-control input-sm" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">状态</label>
					<div class="col-sm-4">
						<select class="form-control input-sm" name="adminState">
							<option value="否" ${admin.adminState=='否'?'selected':''}>否</option>
							<option value="是" ${admin.adminState=='是'?'selected':''}>是</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!-- 结束2 -->
		<!-- 开始3 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">超级管理员</label>
					<div class="col-sm-6">
						<select class="form-control input-sm" name="adminRight">
							<option value="否"  ${admin.adminRight=='否'?'selected':''}>否</option>
							<option value="是"   ${admin.adminRight=='是'?'selected':''}>是</option>
						</select>
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">姓名</label>
					<div class="col-sm-9">
						<input type="text" name="adminName"
							value="${admin.adminName}" class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div>
		<!-- 结束3 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> 
				<a class="btn btn-warning" href="${pageContext.request.contextPath}/system/admin/list.action">返回上一级</a>
			</div>
		</div>
	</form>

</body>
</html>
