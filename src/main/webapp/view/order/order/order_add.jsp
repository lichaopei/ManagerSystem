<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
			<li><a href="#">考勤功能</a></li>
			<li>考勤管理</li>
			<li>考勤规则</li>
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
	<form action="${pageContext.request.contextPath}/order/order/add.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">订单类型</label>
					<div class="col-sm-4">
						<select name="typeId" class="form-control input-sm">	
							<c:forEach items="${types}" var="type">
								<option value="${type.typeId}"}>${type.typeName}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">预约时间</label>
					<div class="col-sm-9">
						<div class="input-append date form_datetime">
    						<input type="text"  name="date" value="${order.date}" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" readonly class="form_datetime">
    						<span class="add-on"><i class="icon-th"></i></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">客户姓名</label>
					<div class="col-sm-9">
    						<input  type="text" name="customer" value="${order.customer}">
						</div>
					</div>
				</div>
				<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">客户电话</label>
					<div class="col-sm-9">
    						<input  type="text" name="phone" value="${order.phone}">
						</div>
					</div>
				</div>
		</div>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">门市</label>
					<div class="col-sm-9">
						<select name="floor" class="form-control input-sm">	
							<c:forEach items="${floor}" var="floor">
								<option value="${floor.employeeId}"}>${floor.employeeName}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> 
				<a class="btn btn-warning" href="${pageContext.request.contextPath}/order/order/list.action">返回上一级</a>
			</div>
		</div>     
	</form>
	          
</body>
</html>