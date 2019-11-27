<%@page language="java" contentType="text/html; UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lover</title>
    <script>
        function del() {
            var msg = "您真的确定要删除吗？\n\n请确认！";
            if (confirm(msg)==true){
                return true;
            }else{
                return false;
            }
        }
    </script>
    <script src="js/hi.js"></script>
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
                <td><a href="edit?id=${girl.id}">Edit</a> </td>
                <td><a href="del?id=${girl.id}" onclick="javascript:return del();">Del</a></td>

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
    <img src="imgs/a.jpg" width="800" height="450" onclick="makelove('徐睿')">
    <form action="add" method="post">

        name: <input name="name"> <br>
        price: <input name="price"> <br>

        <button type="submit">提交</button>
    </form>
</div>


</body>
</html>