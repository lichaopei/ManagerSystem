<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib  uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    	<li><a href="#">考核功能</a></li>
        <li>考核表查询</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
<form class="form-inline"  action="${pageContext.request.contextPath }/empTest/main.action">
	<div class="form-group" >
		<input type="text" name="employeeName" placeholder="请输入员工姓名">
		<input type="text" name="testDate" 
						onfocus="WdatePicker({dateFmt:'yyyy-MM'})"
						class="Wdate" placeholder="请选择查询年月" readonly="readonly"/>
	</div>
	<input type="submit" class="btn btn-danger"  value="查询"/>
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
  	<display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/empTest/main.action">
    	<display:column property="employeeName" title="员工姓名"></display:column>
    	<display:column property="baseSalary" title="基础工资"></display:column>
    	<display:column property="positionSalary" title="岗位补贴"></display:column>
    	<display:column property="upSalary" title="业务提成"></display:column>
    	<display:column property="jxSalary" title="绩效工资"></display:column>
    	<display:column property="allSalary" title="总计"></display:column>
    	<display:column property="testDate" title="日期"></display:column>
    	<display:column href="${pageContext.request.contextPath }/empTest/deleteMain.action" paramId="testId" paramProperty="testId" value="删除" title="删除"></display:column>
    </display:table>
</div>
</body>
</html>
