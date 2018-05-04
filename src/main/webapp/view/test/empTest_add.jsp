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
<form class="form-inline"  action="${pageContext.request.contextPath }/empTest/add.action">
	<div class="form-group" >
		<label >考核对象</label>
		<input type="text" readonly="readonly" value="${emp.employeeName}" >
		<input type="text" required="required"   name="testDate" onfocus="WdatePicker({dateFmt:'yyyy-MM'})"
		class="Wdate" placeholder="请选择考核年月" />
		<input type="text" style="display: none;" name="empId" value="${emp.employeeId }">
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
  	<display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/empTest/load.action">
    	<display:column property="targetName" title="指标名称"></display:column>
    	<display:column property="parentName" title="上级指标" ></display:column>
    	<display:column property="remarks" title="指标详细"></display:column>
    	<display:column property="weight" title="权重"></display:column> 
    	<display:column property="score" title="分数"></display:column> 
    	<display:column title="考核分数">
    		<input type="number" name="d1" required  min="0"/>
    	</display:column> 
    </display:table>
	</div>
		<input type="text" name="testScore" style="display: none;"  id="t1">
		<input type="submit" class="btn btn-danger"  value="添加" onclick="get()"/>
    </form>
 </div>   
 
 <script type="text/javascript">
 function get(){
	 var s=document.getElementsByName("d1");
	 var num=0;
	 for(var i=0;i<s.length;i++){
		num+=parseInt(s[i].value);
	}
	 document.getElementById("t1").value=num;
	 
 }
 
 </script>
</body>
</html>
