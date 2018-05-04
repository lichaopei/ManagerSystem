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
			<li><a href="#">组织功能</a></li>
			<li>部门管理</li>
			<li>添加部门</li>
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
	<form action="${pageContext.request.contextPath}/salaryrule/update.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">岗位</label>
					<div class="col-sm-8">
						<input name="position"  class="form-control input-sm" value="${rule.position}" readonly="readonly">
						<input name="salaryId"  class="form-control input-sm" value="${rule.salaryId}" style="display: none;">
						<input name="positionId"  class="form-control input-sm" value="${rule.positionId}" style="display: none;">
					</div>
				</div>
			</div>
		<!--开始 -->
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">基础工资(元)</label>
					<div class="col-sm-8">
						
    				<input type="number" name="baseSalary"  value="${rule.baseSalary}"  min="0"  required="required"
     						class="form-control input-sm" />
						
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">岗位补贴(元)</label>
					<div class="col-sm-8">
					<input type="number" name="positionSalary"  value="${rule.positionSalary}"  min="0" required="required"
    						class="form-control input-sm" />
    						
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">业务目标(元)</label>
					<div class="col-sm-8">
					<input type="number" name="targetMoney"  value="${rule.targetMoney}"  min="0" required="required"
    						class="form-control input-sm" />
    						
					</div>
				</div>
			</div>
		</div>
		
		
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">业务提成(百分比)</label>
					<div class="col-sm-8">
					<input type="number" name="upPercent"  value="${rule.upPercent}"  step="0.01" min=0  max=1 required="required"
    						class="form-control input-sm" />
    						
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">绩效提成(百分比)</label>
					<div class="col-sm-8">
					<input type="number" name="jxPercent"  value="${rule.jxPercent}"  step="0.01"  min=0  max=1 required="required"
    						class="form-control input-sm" />
    						
					</div>
				</div>
			</div>
		</div>
	
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-4 control-label">惩罚标准(元/分)</label>
					<div class="col-sm-8">
					<input type="number" name="scoreMoney"  value="${rule.scoreMoney }"  min=0   required="required"
    						class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div>
		
		<!--结束 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> <a
					class="btn btn-warning"
					href="${pageContext.request.contextPath}/salaryrule/list.action">返回上一级</a>
			</div>
		</div>
                        
	</form>
	          
</body>
</html>