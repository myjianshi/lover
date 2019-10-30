<%@page language="java" contentType="text/html; UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>EditLover</title>
</head>
<body>
<h1 align="center">Edit ls' lovers</h1>
<div style="margin:0px auto; width:500px">

    <form action="update" method="post">

        name: <input name="name" value="${girl.name}"> <br>
        price: <input name="price" value="${girl.price}"> <br>

        <input name="id" type="hidden" value="${girl.id}">
        <button type="submit">提交</button>

    </form>
</div>
</body>
</html>
