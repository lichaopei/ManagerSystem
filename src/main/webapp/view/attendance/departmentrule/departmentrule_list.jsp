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
<form class="form-inline"  action="${pageContext.request.contextPath }/attendance/departmentrule/list.action">
     <div class="form-group">
        <input type="text" class="form-control" name="departmentName" placeholder="请输入部门名称"  >
      </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    
    <input id="right" value="${admin.adminRight}" style="display: none;">
    <a id="d" class="btn btn-success"  href="${pageContext.request.contextPath}/attendance/departmentrule/before.action">添加规则</a>
    </form>
</div>
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">部门信息-${info}</p>
	</div>	
</div>


<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/attendence/departmentrule/list.action">
    	<display:column property="departmentName" title="部门名称"></display:column>
    	<display:column property="startTimeAm" title="上午上班时间"  format="{0,date,HH:mm:ss}"></display:column>
    	<display:column property="endTimeAm" title="上午下班时间"  format="{0,date,HH:mm:ss}"></display:column>
    	<display:column property="startTimePm" title="下午上班时间" format="{0,date,HH:mm:ss}"> </display:column>
    	<display:column property="endTimePm" title="下午下班时间" format="{0,date,HH:mm:ss}"> </display:column>
    	<display:column href="${pageContext.request.contextPath }/attendance/departmentrule/load.action" paramId="ruleId" paramProperty="ruleId" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/attendance/departmentrule/delete.action" paramId="ruleId" paramProperty="ruleId" value="删除" title="删除"></display:column>
    </display:table>
    
</div>
<script type="text/javascript">
window.onload=function(){
	var s=document.getElementById("right").value;	
		if(s=="否"){
			var list=document.getElementById("d").style.display="none";
		}
	};


</script>
</body>
</html>
