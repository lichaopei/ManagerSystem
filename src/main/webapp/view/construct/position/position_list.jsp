<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<%@ include file="/view/public/common.jspf" %>
</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">组织管理</a></li>
        <li>职务管理</li>
    </ul>
</div>



<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
<form class="form-inline" action="${pageContext.request.contextPath}/construct/position/list.action"">
    <div class="form-group">
    	<input type="text"  name="positionName" class="form-control input-sm" placeholder="请输入职务名称" />
    </div>
    <input type="submit"   class="btn btn-danger"    value="查询"/>
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/view/construct/position/position_add.jsp">添加职位</a>
    </form>
</div>

<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color:red;">职务-${info}</p>
	</div>	
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
    <display:table class="table  table-condensed table-striped" name="list" requestURI="${pageContext.request.contextPath}/construct/position/list.action" pagesize="10">
    	<display:column property="positionName" title="职务名称"></display:column>
    	<display:column property="positionMemo" title="职务描述"></display:column>
    	<display:column href="${pageContext.request.contextPath }/construct/position/load.action" paramId="positionId" paramProperty="positionId" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/construct/position/delete.action" paramId="positionId" paramProperty="positionId" value="删除" title="删除"></display:column>
    </display:table>
</div>

</body>
</html>
