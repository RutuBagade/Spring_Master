<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Register Here</title>
<style type="text/css">
.errors {
color: red;
}
</style>
</head>
<body>

<a href="?lang=en">ENGLISH</a>
<a href="?lang=hi">HINDI</a>
<a href="?lang=fr">French</a>
<a href="?lang=spa">Spanish</a>
<h2><spring:message code="title"/></h2>
<form:form action="insert" method="post" modelAttribute="student">
<pre>
<spring:message code="studname"/> :
<form:input path="studName"/>
<form:errors path="studName" cssClass="errors"/>

<spring:message code="studpwd"/> :
<form:password path="studPwd"/>
<form:errors path="studPwd" cssClass="errors"/>

<spring:message code="studgen"/> :
<form:radiobutton path="studGen" value="Male"/> Male
<form:radiobutton path="studGen" value="Female"/> Female
<form:errors path="studGen" cssClass="errors"/>

<spring:message code="studaddr"/> :
<form:textarea path="studAddr"/>
<form:errors path="studAddr" cssClass="errors"/>
<spring:message code="studcntry"/> :

<form:select path="studCntry">
<form:option value="">-SELECT-</form:option>
<form:option value="IND">IND</form:option>
<form:option value="AUS">AUS</form:option>
<form:option value="DNR">DNR</form:option>
</form:select >
<form:errors path="studCntry" cssClass="errors"/>
<spring:message code="studlang"/>:
<form:checkbox path="studLang" value="ENG"/> ENG
<form:checkbox path="studLang" value="HIN"/> HIN
<form:checkbox path="studLang" value="Fren"/> TEL
<form:checkbox path="studLang" value="Spa"/> TAM
<form:errors path="studLang" cssClass="errors"/>
<input type="submit" value="Register"/> 
</pre>
</form:form>
${message}
</body>
</html>