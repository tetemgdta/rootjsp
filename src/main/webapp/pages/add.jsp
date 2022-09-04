<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2022/9/3
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="/add" method="get">
    <p><input type="text" name="wname"></p>
    <p><input type="text" name="wsex"></p>
    <p><input type="text" name="wtel"></p>
    <p><input type="text" name="deptid"></p>
    <input type="submit" value="add">
</form>
<%--<table align='center' width="400" border="1">--%>
<%--    <tr>--%>
<%--        <th>姓名</th>--%>
<%--        <th>性别</th>--%>
<%--        <th>电话</th>--%>
<%--        <th>部门名称</th>--%>
<%--    </tr>--%>
<%--<c:forEach items="${list}" var="worker">--%>
<%--    <tr>--%>
<%--        <td>--%>
<%--        <select>--%>
<%--            <option value="1">男</option>--%>
<%--            <option value="2">女</option>--%>
<%--        </select>--%>
<%--        </td>--%>
<%--    <td>--%>
<%--        <option value="0">-请选择-</option>--%>
<%--        <select name="deptid">--%>
<%--            <c:forEach var="${list}" items="${worker}">--%>
<%--                <option value="${department.dname}"></option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>
<%--    </td>--%>
<%--    </tr>--%>
<%--</c:forEach>--%>
<%--</table>--%>
</body>
</html>
