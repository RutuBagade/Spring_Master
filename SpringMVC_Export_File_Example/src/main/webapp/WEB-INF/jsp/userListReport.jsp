<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border="1" >
  <thead>
   <tr>
    <td>ID</td>
    <td>USERNAME</td>
    <td>FIRST NAME</td>
    <td>LAST NAME</td>
   </tr>
  </thead>
  <tbody>
   <c:forEach items="${userList }" var="user" >
    <tr>
     <td>${user.id }</td>
     <td>${user.username }</td>
     <td>${user.firstname }</td>
     <td>${user.lastname }</td>
    </tr>
   </c:forEach>
  </tbody>
 </table>
 
 <spring:url value="/report/?type=xls" var="xlsURL" />
 <spring:url value="/report/?type=pdf" var="pdfURL" />
 <spring:url value="/report/?type=csv" var="csvURL" />
 <a href="${xlsURL }">Download Excel</a>
 <a href="${pdfURL }">Download PDF</a>
 <a href="${csvURL }">Download CSV</a>
 
</body>
</html>