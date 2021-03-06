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
<script type="text/javascript">
	function jsGetAge() {
		document.getElementById("staffAge").value = null;
		var returnAge;
		var strBirthday = document.getElementById("staffBirthday").value;
		var strBirthdayArr = strBirthday.split("-");
		var birthYear = strBirthdayArr[0];
		d = new Date();
		var nowYear = d.getYear();
		if (nowYear == birthYear) {
			returnAge = 0;//同年 则为0岁  
		} else {
			returnAge = nowYear - birthYear + 1900; //年之差 ;
		}
		if (returnAge < birthYear) {
			document.getElementById("staffAge").value = returnAge;
		}

	}
</script>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px;">
			<li><a href="#">系统管理</a></li>
			<li>员工管理</li>
			<li>添加员工</li>
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

	<form
		action="${pageContext.request.contextPath}/construct/employee/add.action"
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
				<div class="form-group" style="display: none;">
					<label class="col-sm-3 control-label">编号</label>
					<div class="col-sm-9">
						<input type="text" name="employeeId" readonly="readonly"
							class="form-control input-sm" />
					</div>
				</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">姓名</label>
					<div class="col-sm-9">
						<input type="text" name="employeeName" value="${employee.employeeName}"
							class="form-control input-sm" />
					</div>
				</div>
			</div>

		</div>
		<!-- 开始2 -->
		<div class="row">
			<%-- <div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">年龄</label>
					<div class="col-sm-5">
						<input type="text" id="staffAge" name="staffAge"
							readonly="readonly" value="${staffInfo.staffAge}"
							class="form-control input-sm" />
					</div>
				</div>

			</div> --%>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">性别</label>
					<div class="col-sm-4">
						<select class="form-control input-sm" name="employeeGender">
							<option></option>
							<option ${employee.employeeGender=='男'?'selected':''}>男</option>
							<option ${employee.employeeGender=='女'?'selected':''}>女</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!-- 结束2 -->
		<!-- 开始3 -->
		<div class="row">
			<%-- <div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">籍贯</label>
					<div class="col-sm-6">
						<input type="text" name="staffNativePlace"
							value="${staffInfo.staffNativePlace}"
							class="form-control input-sm" />
					</div>
				</div>
			 --%>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">职位</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="position">
							<c:forEach items="${list2}" var="list2">
								<option value="${list2.positionId}">${list2.positionName}</option>							
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">部门</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="department">
							<c:forEach items="${list}" var="list">
								<option value="${list.departmentId}">${list.departmentName}</option>							
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">身份证号</label>
					<div class="col-sm-9">
						<input type="text" name="cardNumber"
							value="${employee.cardNumber}" class="form-control input-sm" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">手机号码</label>
					<div class="col-sm-9">
						<input type="text" name="phone"
							value="${employee.phone}" class="form-control input-sm" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">地址</label>
					<div class="col-sm-9">
						<input type="text" name="address"
							value="${employee.address}" class="form-control input-sm" />
					</div>
				</div>
			</div>
			
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">员工状态</label>
					<div class="col-sm-9">
						<select class="form-control input-sm" name="employeeState">
							<option value="0" ${employee.employeeState=='0'?'selected':'' }>停用</option>
							<option value="1" ${employee.employeeState=='1'?'selected':''}>正常      </option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!-- 结束3 -->
		<!-- 开始4 -->
		<%-- <div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">出生日期</label>
					<div class="col-sm-9">
						<input type="text" id="staffBirthday" name="staffBirthday"
							value="${staffInfo.staffBirthday}" onfocus="WdatePicker()"
							onblur="jsGetAge()" readonly="readonly"
							class="form-control input-sm" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">办公电话</label>
					<div class="col-sm-9">
						<input type="text" name="staffOfficePhone"
							value="${staffInfo.staffOfficePhone}"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div> --%>
		<!-- 结束4 -->
		<!-- 开始4 -->
		<%-- <div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">电子邮件</label>
					<div class="col-sm-9">
						<input type="text" name="staffEmail"
							value="${staffInfo.staffEmail}" class="form-control input-sm" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">移动电话</label>
					<div class="col-sm-9">
						<input type="text" name="staffMobilePhone"
							value="${staffInfo.staffMobilePhone}"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div> --%>
		<!-- 结束4 -->
		<!-- 开始5 -->
		<%-- <div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">家庭住址</label>
					<div class="col-sm-9">
						<input type="text" name="staffAddr" value="${staffInfo.staffAddr}"
							class="form-control input-sm" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">QQ</label>
					<div class="col-sm-9">
						<input type="text" name="staffQq" value="${staffInfo.staffQq}"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div> --%>
		<!-- 结束5 -->
		<!-- 开始6 -->
		<%-- <div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">入职时间</label>
					<div class="col-sm-9">
						<input type="text" name="staffEntryTime"
							value="<fmt:formatDate value="${staffInfo.staffEntryTime }" pattern="yyyy-MM-dd" type="both"/>"
							onclick="WdatePicker()" readonly="readonly"
							class="form-control input-sm" />
					</div>
				</div>

			</div> --%>
		<%-- 	<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">教育水平</label>
					<div class="col-sm-6">
						<select class="form-control input-sm" name="staffEducationLevel">
							<option></option>
							<option ${staffInfo.staffEducationLevel=='博士'?'selected':''}>博士</option>
							<option ${staffInfo.staffEducationLevel=='博士'?'selected':''}>硕士</option>
							<option ${staffInfo.staffEducationLevel=='博士'?'selected':''}>本科</option>
						</select>
					</div>
				</div>
			</div>
		</div> --%>
		<!-- 结束6 -->
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="employeeMemo">${employee.employeeMemo}</textarea>
					</div>
				</div>

			</div>

		</div> 
		<%-- <h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">账号信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">账号</label>
					<div class="col-sm-9">
						<input type="text" name="staffNumber"
							value="${staffInfo.staffNumber}" class="form-control input-sm" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">密码</label>
					<div class="col-sm-9">
						<input type="password" name="staffPassword"
							value="${staffInfo.staffPassword}" class="form-control input-sm" />
					</div>
				</div>
			</div>
		</div> --%>
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> 
				<input type="reset" class="btn  btn-danger" value="取消" />
			</div>
		</div> 
	</form>

</body>
</html>
