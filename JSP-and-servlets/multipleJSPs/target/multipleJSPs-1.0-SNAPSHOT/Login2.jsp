<%--
  Created by IntelliJ IDEA.
  User: tanmay
  Date: 06/06/21
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body bgcolor="#7fffd4" style = "font-family: 'Liberation Mono','sans-serif'; margin-left: 30px;">
<h1>Login Form</h1>
<form action="/multipleJSPs_war_exploded/Login2" method="post">
    <DL>
        <dt>Email :</dt><dd><label>
        <input type="text" name ="email" style="width: 250px"/>
    </label></dd><br>
        <dt>Password :</dt><dd><label>
        <input type="password" name ="nPassword" style="width: 150px"/>
    </label></dd><br>
        <br>
        <input type = "submit" value="Register"/>

    </DL>
    <br>
</form>
<br><hr>
<p style="font-family: 'C059','sans-serif'">
    Please Make Sure, these were your Credentials:-
    Email    :=&nbsp;&nbsp; ${gmail}<br>
    password :=&nbsp;&nbsp; ${password}<br>
</p>
<br>
</body>
</html>
