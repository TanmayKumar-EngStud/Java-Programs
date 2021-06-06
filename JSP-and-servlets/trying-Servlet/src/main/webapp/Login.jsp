<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Application Form</title>
</head>
<body bgcolor="#faebd7" marginwidth="100px">
<h1 style="font-family: 'Liberation Mono','sans-serif'">Registration form</h1>

<br/>
<form action = "/trying_Servlet_war_exploded/Login" method = "post">
    <dl>
        <dt>Name :</dt>
        <dd><input type="text" style="width: 150px;" name="name" /></dd>
        <br>
        <dt>e-mail :</dt>
        <dd><input TYPE="text" style="width: 250px;" name="e-mail" /></dd>
        <br>
        <dt>set Password :</dt>
        <dd><input TYPE="password" style="width: 150px;" name="password" /></dd>
        <br>
        <dt>Confirm Password :</dt>
        <dd><input TYPE="password" style="width: 150px;" name="cPassword" /></dd>
        <br>
        <input type="submit" value="submit" style="width: 150px;"/>
    </dl>
    <br>
</form>
<br>
<%
    Date date = new Date();
    out.print("<hr><p align=\"center\">"+date+"</p><hr>");
%>
</body>
</html>