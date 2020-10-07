<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<meta charset="ISO-8859-1">
<title>Download</title>
</head>
<body>

<c:forEach items="${files }" var="f">
<a href="doDownload?fileid=${f[0]}"><c:out value="${f[1]} "><br></c:out></a>

</c:forEach>
</body>
</html>