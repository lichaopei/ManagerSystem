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
			<li>权限管理</li>
			<li>添加权限</li>
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

	<form action="${pageContext.request.contextPath}/system/adminpopedom/add.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">用户名称</label>
					<div class="col-sm-5">
						<select class="form-control input-sm" name="adminId">
						<option>	</option>
							<c:forEach items="${list2}" var="list2">
								<option value="${list2.adminId}">${list2.adminName}</option>							
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!-- 开始2 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">部门名称</label>
					<div class="col-sm-5">
						<select class="form-control input-sm" name="departmentId">
							<option>	</option>
							<c:forEach items="${list}" var="list">
								<option value="${list.departmentId}">${list.departmentName}</option>							
							</c:forEach>
						</select>
					</div>
				</div>

			</div>
		</div>
		<!-- 结束3 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> 
				<input type="reset" class="btn  btn-danger" value="取消" />
			</div>
		</div>
	</form>

</body>
</html>
