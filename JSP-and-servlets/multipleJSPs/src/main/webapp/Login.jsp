<%--
  Created by IntelliJ IDEA.
  User: tanmay
  Date: 06/06/21
  Time: 4:26 PM
--%>
<%@ page import=" java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Application Registeration</title>
</head>
<body bgcolor="#7fffd4" style = "font-family: 'Liberation Mono','sans-serif'; margin-left: 30px;margin-top: 30px;">
<h1>Registration Form</h1>
    <form action="/multipleJSPs_war_exploded/Login" method="post">
        <DL>
            <dt>Name :</dt><dd><input type="text" name="name" style="width: 150px"/> </dd><br>
            <dt>Email :</dt><dd><input type="text" name ="email" style="width: 250px"/></dd><br>
            <dt>New Password :</dt><dd><input type="password" name ="nPassword" style="width: 150px"/></dd><br>
            <dt>Confirm Password :</dt><dd><input type="password" name ="cPassword" style="width: 150px"/></dd><br>
            <br>
            <input type = "submit" value="Register"/>
        </DL>
        <p style="color: orangered">
            ${correct}
        </p>
        <br>
        <hr>
        <%
            Date date = new Date();
            out.println("<h3>"+date+"</h3>");
        %>

        <hr>
    </form>
</body>
</html>
