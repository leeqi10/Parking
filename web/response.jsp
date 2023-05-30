<%@ page import="edu.xhu.web.po.Userinf" %><%--
  Created by IntelliJ IDEA.
  User: tq
  Date: 2023/5/31
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String info = null;
    info = (String) request.getAttribute("info");
    Userinf userinf1 = (Userinf) request.getAttribute("userinf");
%>
<%

    if (info!=null){
%>
<p>登录失败</p>
<%
    }
    if (userinf1!=null){
%>
<p>登录成功</p>
<%
    }
%>
</body>
</html>
