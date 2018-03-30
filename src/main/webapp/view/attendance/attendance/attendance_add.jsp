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
			<li>添加考勤</li>
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
	<form action="${pageContext.request.contextPath}/attendance/attendance/add.action"	
		class="form-horizontal">
		
		<table>
			<tr>
				<td>员工姓名</td>
				<td>部门</td>
				<td>考勤时间</td>
				<td>考勤状态</td>
				<td>单据编号</td>				
			</tr>
			<c:forEach items="" var="">
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</c:forEach>
			
		
		
		
		
		</table>
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">员工名称</label>
					<div class="col-sm-9">
						<input type="text" name="employeeName"
							value="${attendance.employeeName }"
							class="form-control input-sm"/>
					</div>
				</div>
			</div>
		</div>
		<!--开始 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">卡号</label>
					<div class="col-sm-9">
						<input type="text" name="cardNumber"
							value="${attendance.cardNumber }"
							class="form-control input-sm"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">考勤状态</label>
					<div class="col-sm-9">
						<div class="input-append date form_datetime">
    						 <select class="form-control" name="attendancetype">
       							<option value="1">出勤</option>
       							<option value="2">公休</option>
       							<option value="3">迟到</option>
       							<option value="4">旷工</option>
       							<option value="5">外出</option>
       							<option value="6">出差</option>
       							<option value="7">加班</option>
       							<option value="8">倒休</option>
       							<option value="9">事假</option>
       							<option value="10">病假</option>
       							<option value="11">婚假</option>
       							<option value="12">丧假</option>
       							<option value="13">产假</option>
        					</select>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">单据编号</label>
					<div class="col-sm-9">
						<input type="text" name="nodeId"
							value="${attendance.nodeId }"
							class="form-control input-sm"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="attendanceMemo">${attendance.attendanceMemo}</textarea>
					</div>
				</div>
			</div>
		</div>
		<!--结束 -->
		<!--结束 -->
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> <a
					class="btn btn-warning"
					href="${pageContext.request.contextPath}/attendance/attendance/list.action">返回上一级</a>
			</div>
		</div>
                        
	</form>
	          
</body>
</html>