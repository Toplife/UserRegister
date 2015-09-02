<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="Register" method="post">
		<input type="hidden" name="from" value="Register"/>
			<table>
				<tr><td><label>UserId</label></td><td><input type="text" name="userId" /></td></tr>
				<tr><td><label>UserName</label></td><td><input type="text" name="UserName" /></td></tr>
				<tr><td><label>UserAge</label></td><td><input type="text" name="userAge" /></td></tr>
				<tr><td><td><input type="submit" value="Register" /></td></tr>
			</table>
		</form>
	</div>
	
</body>
</html>