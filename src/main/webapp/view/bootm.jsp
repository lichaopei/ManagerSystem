<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>

</head>
	<base href="<%=basePath%>"> 
<%@ include file="/view/public/common.jspf" %>

<body>

<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style=" padding:0px; padding-left:20px;" >
  <li ><a href="#">首页</a></li>
  <li>工作台</li>
</ul>
</div>
<div class="row" style="padding:15px; padding-top:50px; " align="center">
	<div>
	<a href="http://localhost:8080/ManageSystem/getMajorChart.action">订单金额统计</a>
	</div>
	<table class="table  table-condensed table-striped">
 			<img src="${chartURL}">
	</table>
</div>
</body>
</html>
