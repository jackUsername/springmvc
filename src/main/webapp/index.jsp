
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+
            ":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<p>当出来方法返回值ModelAnDview实现forword</p>
<form action="some.do" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    <input type="submit" value="提交请求">
</form>

<p>当出来方法返回值ModelAnDview实现redirect</p>
<form action="Redirect.do" method="post">
    姓名:<input type="text" name="name"><br/>
    年龄:<input type="text" name="age"><br/>
    <input type="submit" value="提交请求">
</form>
</body>
</html>
