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
			<li><a href="#">订单模块</a></li>
			<li>订单类型</li>
			<li>类型添加</li>
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
	<form action="${pageContext.request.contextPath}/order/type/update.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
			
			<div style="display: none;">
				<input type="text" name="typeId" value="${photoType.typeId}">
			</div>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">类型名称</label>
					<div class="col-sm-6">
						
    						<input type="text" name="typeName" value="${photoType.typeName}" class="form-control input-sm">
					</div>
				</div>
				
			</div>
		</div>
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">价格</label>
					<div class="col-sm-6">
    						<input  type="text" name="cost" value="${photoType.cost}" class="form-control input-sm">
   
					</div>
				</div>
			</div>
		</div>    
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="修改" /> 
				<a href="${pageContext.request.contextPath}/order/type/list.action"  class="btn  btn-danger" >返回上一级</a>
			</div>
		</div>      
	</form>
	          
</body>
</html>