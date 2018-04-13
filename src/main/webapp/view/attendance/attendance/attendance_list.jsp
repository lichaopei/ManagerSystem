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
    	<li><a href="#">考勤功能</a></li>
        <li>考勤查询</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
<form class="form-inline"  action="${pageContext.request.contextPath }/attendance/attendance/list.action">
     <div class="form-group">
        <input type="text" class="form-control" name="departmentName" placeholder="请输入部门名称" style="width: 20%">
        <input type="text" class="form-control" name="employeeName" placeholder="请输入员工名称" style="width: 20%" >
       	<input size="16" type="text" id="date" name="attendancedate" readonly class="form_datetime form-control" placeholder="请输入日期" style="width: 20%">
      	 <select class="form-control" name="typeName" style="width: 20%">
      						 	<option value="">--请选择状态--</option>
       							<option value="出勤">出勤</option>
       							<option value="公休">公休</option>
       							<option value="迟到">迟到</option>
       							<option value="旷工">旷工</option>
       							<option value="外出">外出</option>
       							<option value="出差">出差</option>
       							<option value="加班">加班</option>
       							<option value="倒休">倒休</option>
       							<option value="事假">事假</option>
       							<option value="病假">病假</option>
       							<option value="婚假">婚假</option>
       							<option value="丧假">丧假</option>
       							<option value="产假">产假</option>
       			</select>
      </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/attendance/attendance/beforeAdd.action">考勤录入</a>
    </form>
</div>
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">考勤信息-${info}</p>
	</div>	
</div>


<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/attendance/attendance/list.action">
    	<display:column property="employeeName" title="员工名称"></display:column>
    	<display:column property="cardNumber" title="卡号" ></display:column>
    	<display:column property="attendanceDate" title="考勤时间"  format="{0,date,yyyy-MM-dd HH:mm:ss}"></display:column>
    	<display:column property="typeName" title="考勤类型" > </display:column>
    	<display:column property="departmentName" title="部门名称" > </display:column>
    	<display:column property="adminName" title="负责人" > </display:column>
    	<display:column href="${pageContext.request.contextPath }/attendance/attendance/load.action" paramId="attendanceId" paramProperty="attendanceId" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/attendance/attendance/delete.action" paramId="attendanceId" paramProperty="attendanceId" value="删除" title="删除"></display:column>
    </display:table>
</div>
<script type="text/javascript">
    $("#date").datetimepicker({
    	 format: "yyyy-mm-dd",
    	 weekStart: 1,  
         autoclose: true,  
         startView: 2,  
         minView: 2,  
         forceParse: false,  
         language: 'cn' 
    });
    </script>
</body>
</html>
