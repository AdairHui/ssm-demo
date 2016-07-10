<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
</head>
<body>
	<h1>列表</h1>
	<a href="<%=request.getContextPath() %>/app/add">添加</a><br/>
	<hr/>
	<table>
		<tr>
			<td width="80px">序号</td>
			<td width="100px">姓名</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${appList}" var="app"> 
		<tr>
			<td>${app.id }</td>
			<td>${app.name }</td>
			<td>
				<a href="<%=request.getContextPath() %>/app/delete/${app.id}">删除</a> &nbsp;&nbsp;
				<a href="<%=request.getContextPath() %>/app/edit/${app.id}">修改</a>
			</td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>