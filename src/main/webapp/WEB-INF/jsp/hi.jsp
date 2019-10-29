<%@page language="java" contentType="text/html; UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lover</title>
</head>
<body>
<h1 align="center">Hi ls' lovers</h1>
<div style="width:500px;margin: 20px auto; text-align: center">
    <table align="center" border="1" cellspacing="0">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="girl" items="${page.list}" varStatus="st">
            <tr>
                <td>${girl.id}</td>
                <td>${girl.name}</td>
                <td>${girl.price}</td>
                <td><a href="editGirl?id=${girl.id}">Edit</a> </td>
                <td><a href="delGirl?id=${girl.id}">Del</a> </td>

            </tr>
        </c:forEach>


    </table>
    <br>
    <div>
        <a href="?start=1">首页</a>
        <a href="?start=${page.pageNum-1}">上一页</a>
        <a href="?start=${page.pageNum+1}">下一页</a>
        <a href="?start=${page.pages}">末页</a>

    </div>
    <form action="addGirl" method="post">

        name: <input name="name"> <br>
        price: <input name="price"> <br>

        <button type="submit">提交</button>
    </form>
</div>


</body>
</html>