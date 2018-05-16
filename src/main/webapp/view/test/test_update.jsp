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
<style>
		input::-webkit-outer-spin-button, 
		input::-webkit-inner-spin-button{
		    -webkit-appearance: none !important;
		}
		input[type="number"]{-moz-appearance:textfield;}



</style>



<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">考核功能</a></li>
        <li>考核添加</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
		</button>
		<p align="center" style="color: red;">${info}</p>
	</div>	
</div>
<form class="form-inline"  action="${pageContext.request.contextPath }/test/update.action">
    <div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table class="table table-condensed table-striped" name="list" id="t" pagesize="10" requestURI="${pageContext.request.contextPath }/test/load.action">
    	<display:column property="targetName" title="指标名称"></display:column>
    	<display:column property="parentName" title="上级指标" ></display:column>
    	<display:column property="remarks" title="指标详细"></display:column>
    	<display:column title="权重">
			<input type='number' name="list[${t_rowNum-1}].weight" value="${t.weight}" required/>
		</display:column> 
		<display:column  title="分数">
			<input type='number' name='list[${t_rowNum-1}].score' value="${t.score}" required/>
		</display:column>
    	<display:column href="${pageContext.request.contextPath }/test/delete.action" paramId="recordId" paramProperty="recordId" value="删除" title="删除"></display:column>
		<display:column style="display:none">
			<input type='text' name="list[${t_rowNum-1}].recordId" value="${t.recordId}"/>
			<input type='text' name="list[${t_rowNum-1}].targetId" value="${t.targetId}"/>
			<input type='text' name="list[${t_rowNum-1}].parentTarget" value="${t.parentTarget}"/>
			<input type='text' name="list[${t_rowNum-1}].remarks" value="${t.remarks}"/>
		</display:column>
    </display:table>
	</div>
    <input type="submit"   class="btn btn-danger"     value="添加"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/test/test_main.jsp">返回首页</a>
    </form>
</div>
</body>
</html>
