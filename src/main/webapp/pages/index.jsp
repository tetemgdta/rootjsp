<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2022/8/29
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<div align='center'>
    <h3>用户列表</h3>
    <button>全选</button>
    <button><a href="/add.jsp"> 添加</a></button>
    <button><a href="updat.jsp">修改</a></button>

<table align='center' width="800" border="1">
    <tr>
        <th>选择</th>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>电话</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="worker">
    <tr>
        <td></td>
        <td>${worker.wid}</td>
        <td>${worker.wname}</td>
        <td>${worker.wsex}</td>
        <td>${worker.wtel}</td>
        <td><a href="/delet?wid=${worker.wid}">删除</a></td>
    </tr>
    </c:forEach >
</table>
</div>

</body>
</html>