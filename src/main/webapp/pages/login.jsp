<%--
  Created by IntelliJ IDEA.
  User: 21090705
  Date: 2022/8/12
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <c:if test="${error != null}">
        <span style="color:red">${error}</span>
    </c:if>
    <form action="/login" method="get">
        <h2>用户登录</h2>
        <p>用户名：<input type="text" name="wname" value="${worker.wname}"></p>
        <p>密码：<input type="text" name="wtel" value="${worker.wtel}"></p>
        <input type="submit" value="登陆">
    </form>
</head>
<body>

</body>
</html>
