<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>sample1_from.jsp</title>
</head>
<body>
	<h2>getAttribute_referer.jsp</h2>
	<!-- セッションIDを取得 -->
	<p>
		session ID:<%=session.getId()%></p>
	<!-- セッションで値を設定 -->
	<%
	session.setAttribute("あれ", "これ");
	session.setAttribute("それ", "どれ");
	%>
	<p>
		<a href="getAttribute_referer.jsp">getAttribute_referer.jsp</a>
	</p>
</body>
</html>