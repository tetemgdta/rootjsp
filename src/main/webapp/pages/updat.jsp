<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2022/9/3
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户修改</title>
</head>
<body>
<form action="/update" method="get">
    <p><input type="text" name="wname" value="${worker.wname}" readonly></p>
        <p><input type="text" name="wsex" value="${worker.wsex}" disabled></p>
        <p><input type="text" name="wtel" value="${worker.wtel}"></p>
        <p><input type="text" name="deptid" value="${worker.deptid}"></p>
        <input type="submit" value="update">
</form>
</body>
</html>
