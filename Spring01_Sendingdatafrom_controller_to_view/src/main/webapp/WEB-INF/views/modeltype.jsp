<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>owner name</title>
</head>
<body>
${msg }<br>
<h2>hii user ..I am ${uname} owner of company.....</h2>
<h3>List of members (Collection Type data):</h3>
<c:forEach items="${members}" var="names">
${names }<br>
</c:forEach>
<h3>hashmap data type: (Collection Type data):</h3>
<c:forEach items="${histogram}" var="entry">
     Key = ${entry.key}, value = ${entry.value}<br>
</c:forEach>
<h3>Array type data:...</h3>
<c:forEach var="no" items="${num }">
${no }<br>
</c:forEach>
</body>
</html>