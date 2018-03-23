<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    

<html>
<head>
	<meta charset="UTF-8">
	<base href="<%=basePath%>">
	<title>展示</title>
	<link rel="stylesheet" type="text/css" href="/myssm/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="/myssm/css/icon.css">
	<link rel="stylesheet" type="text/css" href="/myssm/demo.css">
	<script type="text/javascript" src="/myssm/js/jquery.min.js"></script>
	<script type="text/javascript" src="/myssm/js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2></h2>
	
	<div style="margin:20px 0;"></div>
	
	   <table id="tt" class="easyui-datagrid" style="width:600px;height:250px"
    		url="/myssm/user/getusers"
    		title="Load Data" iconCls="icon-save"
    		rownumbers="true" pagination="true">
    	<thead>
    		<tr>
    			<th field="id" width="80">ID</th>
    			<th field="name" width="80">姓名</th>
    			<th field="telephone" width="80" align="right">电话</th>
    			
    		</tr>
    	</thead>
    </table>

</body>
</html>