<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<%@ include file="/view/public/common.jspf"%>
</head>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px;">
			<li><a href="#">组织功能</a></li>
			<li>部门管理</li>
			<li>修改部门</li>
		</ul>
	</div>

	<!-- 显示错误信息 -->
	<div align="center">
		<div class="alert alert-warning"
			style="margin: 0px; padding: 5px; width: 100%;display:${empty allErrors?'none':'block'} ">
			<c:forEach items="${allErrors}" var="error">
		 	${error.defaultMessage }<br />
			</c:forEach>
			<div>${error}</div>
		</div>
	</div>

	<form
		action="${pageContext.request.contextPath}/construct/department/update.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<input type="hidden" name="departmentId"
				value="${department.departmentId}" class="form-control input-sm" />
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">部门名称</label>
					<div class="col-sm-9">
						<input type="text" name="departmentName"
							value="${department.departmentName}"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div>
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">办公电话</label>
					<div class="col-sm-9">
						<div class="input-append date form_datetime">
    						<input type="text" name="phone" 
    						value="${department.phone}"
    						class="form-control input-sm" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">员工人数</label>
					<div class="col-sm-9">
						<div class="input-append date form_datetime">
    						<input type="text" name="empNumber" 
    						value="${department.empNumber}"
    						readonly="readonly"
    						class="form-control input-sm" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<div class="input-append date form_datetime">
    						<textarea class="form-control" name="remarks">${department.remarks}</textarea>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> <a
					class="btn btn-warning"
					href="${pageContext.request.contextPath}/construct/department/list.action">返回上一级</a>
			</div>
		</div>
	</form>

</body>
</html>
