<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form method="post" action="login">
    帐号:<input type="text" name="account"/>
    密码:<input type="password" name="password"/>
    <input type="submit" value="登录"/>
</form>

</body>
</html>