<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <style type="text/css">
            .errormsg {
                color: red;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2 align="center" class="text-primary">Spring MVC Form Validation Example</h2>
            <hr />
            <div class="col-md-8 offset-mb-3"> 
 
            <form:form action="login" method="POST" modelAttribute="userform">
                 <div class="form-group">
                    <label>Name:</label><form:input path="name" size="30" cssClass="form-control" placeholder="Enter name" />             
                    <small><form:errors path="name" cssClass="errormsg" /></small>
                 </div>
                  <div class="form-group">
                    <label>Role:</label><form:input path="role" size="30" cssClass="form-control" placeholder="Enter role" />             
                    <small><form:errors path="role" cssClass="errormsg" /></small>
                 </div>
                 <div class="form-group">
                    <label>Email :</label><form:input path="email" size="30" cssClass="form-control" placeholder="Enter valid Email" />
                    <small><form:errors path="email" cssClass="errormsg" /></small>
                 </div>
                 <div class="form-group">
                    <label>Password :</label><form:password path="password" size="30" cssClass="form-control" placeholder="Enter password" />
                    <small><form:errors path="password" cssClass="errormsg" /></small>
                 </div>
                 <div class="form-group">
                    <label>Age :</label><form:input path="age" size="30" cssClass="form-control" placeholder="Enter age" />
                    <small><form:errors path="age" cssClass="errormsg" /></small>
                 </div>
                 <div class="form-group">
                    <label>Address :</label><form:textarea path="address" size="30" cssClass="form-control" rows="3" cols="10" placeholder="Enter address" />
                    <small><form:errors path="address" cssClass="errormsg" /></small>
                 </div>
                 <div class="form-check">

  <form:radiobutton  path="gender" cssClass="form-check-input"  />
  <label  >
    Male
  </label>
</div>
<div class="form-check">
 
 <form:radiobutton  path="gender" cssClass="form-check-input"   />
  <label  >
    Female
  </label>
   <small><form:errors path="gender" cssClass="errormsg" /></small>
  </div>
   <div class="form-group">
                    <label>Date :</label><form:input path="birthday" cssClass="form-control" placeholder="Enter Date in MM/dd/yyyy format" />
                    <small><form:errors path="birthday" cssClass="errormsg" /></small>
                 </div>
      <div class="form-group">
    <label > Languages ::</label>
    <form:select path="languages" multiple="true">
    <form:option value="" >Select</form:option>
    <form:option value="US English">US English</form:option>
            <form:option value="UK English">UK English</form:option>
            <form:option value="Spanish">Spanish</form:option>
            <form:option value="Hindi">Hindi</form:option>
            <form:option value="Mandarin">Mandarin</form:option>
          </form:select>
          <form:errors path="languages" cssClass="errormsg" /></div>         
                 <div class="form-group">
                    <button type="submit" class="btn btn-primary">Register</button>
                 </div>
                 
            </form:form>
            </div>
            </div>
        
    </body>
</html>