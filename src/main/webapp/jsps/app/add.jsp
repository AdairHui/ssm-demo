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
	<h1>添加App</h1>
	<form action="<%=request.getContextPath() %>/app/add" method="post">
	<table>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit"/></td>
			<td></td>
		</tr>
	</table>
	</form>
</body>
</html>