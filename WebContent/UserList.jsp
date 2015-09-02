<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.david.service.*,com.david.model.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserList</title>
</head>
<body>
<div align="center">
		<table border="1">
			<tr>
				<th>用户id</th><th>用户名</th><th>年龄</th>
			</tr>
			<%
			UserService service = new UserService();
			List<User> userList = service.getAll();
			String userid = null;
			String username = null;
			int age = 0;
			int role = -1;
			for(int i=0;i<userList.size();i++) {
				userid = userList.get(i).getUserId();
				username = userList.get(i).getUserName();
				age =userList.get(i).getAge();
			%>
			<tr>
				<td><a href="updateUserInfo.jsp?userid=<%=userid %>"><%=userid %></a></td><td><%=username %></td><td><%=age %></td>				
			</tr>
			<%
			}
			%>
		</table>
</div>

</body>
</html>