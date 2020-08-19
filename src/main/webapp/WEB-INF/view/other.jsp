<%--
  Created by IntelliJ IDEA.
  User: xiaoxiannv
  Date: 2020/7/7
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--重定向转发不在同一个作用域所以不能通过${}取参数
但是Redirect.do和onther.jsp.两次请求之间传递数据，所以取参数应该使用
${param.key}相当于request.getParamenter（“myname"）

--%>
<h3>/WEB-INF/view/other.jsp</h3>
<h3>key数据：${param.key}</h3></body><br/>
<h3>key1数据：${param.key2}</h3>
</body>
</html>
