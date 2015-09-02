<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.david.service.*,com.david.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<form action="Register" method="post">
		<input type="hidden" name="from" value="modifyuser"/>
		<%
		String userid = request.getParameter("userid");
		UserService service = new UserService();
		User userinfo = service.getUser(userid);
		String userName = userinfo.getUserName();
		int age = userinfo.getAge();
		
		%>
		<table border="1">
			<tr>
				<td>用户ID</td><td><input type="text" name="userid" value="<%=userid %>" /></td>
			</tr>
			<tr>
				<td>用户名</td><td><input type="text" name="username"  value="<%=userName %>"/></td>
			</tr>
			<tr>
				<td>年龄</td><td><input type="text" name="age"  value="<%=age %>"/></td>
			</tr>
			<tr>
				<td></td><td><input type="submit" value="update" /></td>
			</tr>
		</table>
	</form>
	
</div>
</body>
</html>