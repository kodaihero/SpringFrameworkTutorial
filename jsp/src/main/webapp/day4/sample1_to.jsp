<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>sample1_to</title>
</head>
<body>
	<%
    String age[] = {"10歳未満","10代","20代","30代","40代以上"};
    request.setCharacterEncoding("utf-8");
    String family = request.getParameter("family");
    String name = request.getParameter("name");
    String sex = request.getParameter("sex");
    String age_area = age[Integer.parseInt(request.getParameter("age_id"))];
%>
	<b>受信結果</b>
	<table>
		<tr>
			<th>姓</th>
			<td><%=family %></td>
		</tr>
		<tr>
			<th>名</th>
			<td><%=name %></td>
		</tr>
		<tr>
			<th>性別</th>
			<td><%=sex %></td>
		</tr>
		<tr>
			<th>年代</th>
			<td><%=age_area %></td>
		</tr>
	</table>
	<br />
	<a href="sample2_from.jsp">戻る</a>
</body>
</html>