<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
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
    	<li><a href="#">组织功能</a></li>
        <li>部门管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
</div>
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
		</button>
		<p align="center" style="color: red;">${info}</p>
	</div>	
</div>

		<form action="${pageContext.request.contextPath}/system/admin/ud.action"
				class="form-horizontal">
			<div class="row">
					<div class="col-sm-5">
						<div class="form-group">
						<label class="col-sm-3 control-label">新密码</label>
						<div class="col-sm-9">
    						<input  type="password" name="adminPwd"  required>
    						
    						<input type="text" name="adminId" value="${admin.adminId}" style="display: none;">
    						<input type="text" name="adminAccount" value="${admin.adminAccount}" style="display: none;">
    						<input type="text" name="adminState" value="${admin.adminState}" style="display: none;">
    						<input type="text" name="adminRight" value="${admin.adminRight}" style="display: none;">
    						<input type="text" name="adminName" value="${admin.adminName}" style="display: none;">
						</div>
					</div>
			</div>
		</div>
			
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="确认" /> 
			</div>
		</div>   
	</form>
		


</body>
</html>
