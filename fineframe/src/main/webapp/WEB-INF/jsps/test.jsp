<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>c:import 标签实例</title>
</head>
<body>
test
<c:out value="<%=request.getContextPath()%>"></c:out>
</body>
</html>