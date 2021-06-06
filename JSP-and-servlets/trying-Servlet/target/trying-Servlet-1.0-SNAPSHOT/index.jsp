<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Application Form</title>
</head>
<body bgcolor="#faebd7" marginwidth="100px">
<h1 style="font-family: 'Liberation Mono','sans-serif'">Registration form</h1>

<br/>
<form>
    <dl>
        <dt>Name :</dt>
        <dd><input type="text" style="width: 150px;" name="name"/></dd>
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
</body>
</html>