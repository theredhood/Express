<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EMP information update</title>
</head>
<body>
<h1>修改员工信息</h1>
<h2>只填需要修改的项（不需修改则留空）</h2>
<form action="EMPUpdate" method="get">
<table align="center">

<tr>
<td>姓名：</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>部门：</td>
<td><input type="text" name="department"></td>
</tr>

<tr>
<td>Email:</td>
<td> <input type="text" name="email"/></td>
</tr>
<tr>
<td><input type="submit" value="提交"/></td>
</tr>
</table>
</form>
<input type="button"  value="上一页" onclick="javascript:history.back(-1);">
<input type="button"  value="返回主页" onclick="window.location.href='HomePage.jsp'">

</body>
</html>