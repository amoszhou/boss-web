<%--
  Created by IntelliJ IDEA.
  User: amoszhou
  Date: 16/3/20
  Time: 下午3:52
  To change this template use File | Settings | File Templates.
--%>
<%@include file="common.jsp" %>

<html>
<head>
    <title>userINfo</title>
</head>
<body>
<body>
username: ${user.username }
<br />
userId:${user.id }
<br />
<c:if test="${user.id eq 1}">
    success
</c:if>
</body>
</body>
</html>
