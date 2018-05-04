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
    	<li><a href="#">订单模块</a></li>
        <li>订单管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;text-align: center;" >
<form class="form-inline"  action="${pageContext.request.contextPath }/order/order/list.action">
     <div class="form-group">
        <input type="text" class="form-control" name="customer" placeholder="请输入顾客姓名"  >
      </div>
    <input type="submit"   class="btn btn-danger"     value="查询"/>
    
     <input id="right" value="${admin.adminRight}" style="display: none;">
    <a  class="btn btn-success"  href="${pageContext.request.contextPath}/order/order/beforeAdd.action">添加订单</a>
    </form>
</div>
<div align="center">
	<div class="alert alert-warning" style="margin: 0px; padding: 5px; width: 80%;display:${empty info?'none':'block'} ">
		<button type="button" class="close" data-dismiss="alert">
			<span aria-hidden="true">&times;</span>
			
		</button>
		<p align="center" style="color: red;">类型信息-${info}</p>
	</div>	
</div>


<div class="row" style="padding:15px; padding-top:0px; " align="right">
	<table class="table  table-condensed table-striped">
    </table>
    <display:table  export="true"   class="table table-condensed table-striped" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/order/order/list.action">
    	<display:column property="typeName" title="订单类型"></display:column>
    	<display:column property="customer" title="客户姓名"
    	href="${pageContext.request.contextPath}/order/order/show.action"  paramId="orderId" paramProperty="orderId"></display:column>
    	<display:column property="date" title="预订时间"  format="{0,date,yyyy-MM-dd HH:mm:ss}"></display:column>
    	<display:column property="flag" title="完成状态"></display:column>
    	<display:column href="${pageContext.request.contextPath }/order/order/load.action" paramId="orderId" paramProperty="orderId" value="修改" title="修改"></display:column>
    	<display:column href="${pageContext.request.contextPath }/order/order/delete.action" paramId="orderId" paramProperty="orderId" value="删除" title="删除"></display:column>
    </display:table>
    
</div>
</body>
</html>