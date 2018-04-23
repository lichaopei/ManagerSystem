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
        <li>考核设置</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
<form class="form-inline"  action="${pageContext.request.contextPath }/test/add.action">
	<div class="form-group" >
		<select  class="form-control"  onchange="change()" id="d">
			<option value="">-请选择部门-</option>
			<c:forEach items="${list}" var="list">
				<option value="${list.targetId}">${list.targetName}</option>
			</c:forEach>
		</select>
	</div>
	
	<div class="row" style="padding:15px; padding-top:0px; " align="right">
    <display:table  class="table table-condensed table-striped" name="target"   id="t" pagesize="10" requestURI="${pageContext.request.contextPath }/test/create.action">
    	<display:column title="指标选择">
			<input  id="h"  type='checkbox' name="targetId" value="${t.targetId}" onclick='ChkSonClick()'/>
		</display:column> 
		<display:column style="display:none">
			<input id="t1" type='checkbox' name="parentTarget"/>
		</display:column>
    	<display:column property="targetName" title="指标名称"></display:column>
    	<display:column property="remarks" title="内容"></display:column>
    </display:table>
    
</div>
		<input type="submit"   class="btn btn-danger"     value="确认"/>
</form>
</div>
<script type="text/javascript">

	function change(){
		var v=document.getElementById("d").value;
		var controls=document.getElementsByName("parentTarget");
		for(var i=0;i<controls.length;i++)
		{
		    controls[i].value=v;
		}

	}
	function ChkSonClick(){
		var id=document.getElementsByName("targetId");
		var parent=document.getElementsByName("parentTarget");
		for(var i=0;i<id.length;i++){
			if(id[i].checked){
				parent[i].checked=true;
			}else{
				parent[i].checked=false;
			}
		}
	}
	
</script>
</body>
</html>
