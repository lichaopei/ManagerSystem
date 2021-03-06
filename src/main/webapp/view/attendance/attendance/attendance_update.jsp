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
<script type="text/javascript">
$("#datetimeStartAM").datetimepicker({
	 format: "yyyyMMdd hh:ii:00",
     startView:1,
     autoclose: true
});
</script>

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
	
	<form
		action="${pageContext.request.contextPath}/attendance/attendance/update.action"
		class="form-horizontal">
	<div class="row" style="padding:15px; padding-top:0px; ">
		<table ">
			<thead>
			<tr>
				<td>员工姓名</td>
				<td>卡号</td>
				<td>部门</td>
				<td>考勤时间</td>
				<td>考勤状态</td>
			</tr>
			</thead>
		
				<tr>
					<td style="display:none;">
						<input type="text" name="attendanceId" value="${temp.attendanceId}" />
						<input type="text" name="employeeId" value="${temp.employeeId}" />
						<input type="text" name="tempDepartmentId" value="${temp.tempDepartmentId}" />
						<input type="text" name="adminId" value="${temp.adminId}" />
					</td>
					<td><input type="text" name="employeeName" value="${temp.employeeName}" readonly="readonly" style="border:0;outline:0;background-color:none;" ></td>
					<td><input type="text" name="cardNumber"
						value="${temp.cardNumber}" readonly="readonly" style="border:0;outline:0;background:rgba(0, 0, 0, 0);"/></td>
					<td><input type="text" name="departmentName"
						value="${temp.departmentName}" readonly="readonly" style="border:0;outline:0;"/></td>
					<td>
					<input type="text" name="attendanceDate" 
					 value='<fmt:formatDate value="${temp.attendanceDate}" pattern="yyyyMMdd HH:mm:ss"/>'
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
						class="Wdate" style="width: 250px ;height:28px;border:0;outline:0;" readonly="readonly" /></td>
					<td>
						<select class="form-control" name="attendanceType" 
							style="width: 100px;height: 28px">
							<option value="1" ${temp.attendanceType=='1'?'selected':'' }>出勤</option>
							<option value="2" ${temp.attendanceType=='2'?'selected':'' }>公休</option>
							<option value="3" ${temp.attendanceType=='3'?'selected':'' }>迟到</option>
							<option value="4" ${temp.attendanceType=='4'?'selected':'' }>旷工</option>
							<option value="5" ${temp.attendanceType=='5'?'selected':'' }>事假</option>
					</select>
					</td>
				</tr>
		</table>
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