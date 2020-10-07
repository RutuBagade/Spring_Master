<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model and view page.....</title>
</head>
<body>
${msg }<br>
<div align="center">
<h5>Primitive type data value..</h5>
My name is :${uname }
<h5>Array type data :.</h5>
My favourite Subjects are:.
<c:forEach var="subject" items="${subj }">
${ subject}<br>
  </c:forEach>
<h5>Collection type data..(list).....</h5>
Friends names are:
<c:forEach var="friends" items="${list }" >
<c:out value="${ friends },"></c:out>
</c:forEach>
<h5>Collection type data.......(map)</h5>
<c:forEach var="entry" items="${marks }">
${entry.key }=${entry.value }<br>
</c:forEach>
</div>
</body>
</html>