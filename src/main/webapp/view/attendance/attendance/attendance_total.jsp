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
<form class="form-inline"  action="${pageContext.request.contextPath }/attendance/attendance/total.action">
     <div class="form-group">
        <input type="text" class="form-control" name="employeeName" required placeholder="请输入员工名称" style="width: 35%" >
   	 	<input  type="text"  name="attendanceDate" readonly required class="form_datetime form-control" placeholder="请输入日期" style="width: 30%" onfocus="WdatePicker({dateFmt:'yyyy-MM'})">
     </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    </form>
</div>
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">${info}</p>
	</div>	
</div>

<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table export="true" class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/attendance/attendance/total.action">
    	<display:column property="employeeName" title="员工名称"></display:column>
    	<display:column property="attendanceDate" title="考勤时间"  format="{0,date,yyyy-MM}"></display:column>
    	<display:column property="cq" title="出勤" > </display:column>
    	<display:column property="gx" title="公休"></display:column>
    	<display:column property="cd" title="迟到"></display:column>
    	<display:column property="kg" title="旷工"></display:column>
    	<display:column property="qj" title="请假"></display:column>
    	<display:column property="bt" title="半天"></display:column>
    </display:table>
</div>
</body>
</html>
