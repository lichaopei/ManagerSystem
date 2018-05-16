<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<%@ include file="/view/public/common.jspf" %>
</head>
<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">系统管理</a></li>
        <li>员工管理</li>
        <li>修改员工</li>
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
<form action=""
		class="form-horizontal">
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
			<div class="row">
				<div class="form-group" style="display: none;">
					<label class="col-sm-3 control-label">编号</label>
					<div class="col-sm-9">
						<input type="text" name="employeeId" value="${employeeVO.employeeId }" readonly="readonly"
							class="form-control input-sm" />
					</div>
				</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">姓名</label>
					<div class="col-sm-9">
						<input type="text" name="employeeName" value="${employeeVO.employeeName}" readonly="readonly"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
		<!-- 开始2 -->
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">性别</label>
					<div class="col-sm-4">
						<input type="text" name="employeeGender" required
							value="${employeeVO.employeeGender}" class="form-control input-sm" readonly="readonly"/>
					</div>
				</div>
			</div>
			</div>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">职位</label>
					<div class="col-sm-9">
						<input type="text" name="positionName" 
							value="${employeeVO.positionName}" class="form-control input-sm" readonly="readonly"/>
					</div>
				</div>
			</div>
	
				
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">部门</label>
					<div class="col-sm-9">
						<input type="text" name="department" required
							value="${employeeVO.departmentName}" class="form-control input-sm" readonly="readonly"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">身份证号</label>
					<div class="col-sm-9">
						<input type="text" name="cardNumber" required
							value="${employeeVO.cardNumber}" class="form-control input-sm" readonly="readonly"/>
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">手机号码</label>
					<div class="col-sm-9">
						<input type="text" name="phone"  required  readonly="readonly"
							value="${employeeVO.phone}" class="form-control input-sm" />
					</div>
				</div>
			</div>
	</div>
	
	<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">地址</label>
					<div class="col-sm-9">
						<input type="text" name="address" required
							value="${employeeVO.address}" class="form-control input-sm" readonly="readonly" />
					</div>
				</div>
			</div>
		</div>
		<!-- 结束6 -->
			<div class="row">
			<div class="col-sm-7">
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<textarea class="form-control" readonly="readonly" name="employeeMemo">${employeeVO.employeeMemo}</textarea>
					</div>
				</div>

			</div>

		</div> 
		
   	<div class="row">
    	<div class="col-sm-3 col-sm-offset-4">
           	 <a href="${pageContext.request.contextPath }/construct/employee/list.action" class="btn btn-success">返回上一级</a>
        </div>
    </div>
</form>
<script type="text/javascript">
		var o= document.getElementById('t1').value;
		if(o==1){
			document.getElementById('t1').value="正常";
		}else{
			document.getElementById('t1').value="禁用";
		}
</script>
</body>
</html>
