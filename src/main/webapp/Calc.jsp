<%@ page import="models.Calc" %><%--
  Created by IntelliJ IDEA.
  User: blackbeard
  Date: 11.12.2022
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>

</head>
<body>
<%Calc calc= (Calc) session.getAttribute("calc");%>
<p>
    Ответ : <%= calc.getResult() %>
</p>

</body>
</html>
