<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>

<head>

</head>
<body>Choose a preferred Language:
<a href="login?lang=en"><spring:message code="label.English"/></a> |
<a href="login?lang=fr"><spring:message code="label.French"/></a> |
<a href="login?lang=tel"><spring:message code="label.Telugu"/></a>
<br>
   <h3><spring:message code="label.title"/></h3><br>
   <form name='f' action="doLogin" method='POST'>
      <table>
         <tr>
            <td><spring:message code="label.username"/> :</td>
            <td><input type='text' name='username'></td>
         </tr>
         <tr>
            <td><spring:message code="label.password"/>:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="<spring:message code="label.submit"/>" /></td>
         </tr>
      </table>
  </form>
</body>
</html>