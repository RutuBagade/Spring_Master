<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
 <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Hello, world!</title></head>
<body>
 <div class="col-md-6 mb-3">
<form action="reg" method="POST" >
<div class="form-group">
    <label for="nameofid">Employee Id ::</label>
    <input type="text" class="form-control" id="nameofid" aria-describedby="emailHelp" name="empId">
   
  </div>
  <div class="form-group">
    <label for="nameofemployee"> Email :</label>
    <input type="email" class="form-control" id="nameofemployee" aria-describedby="emailHelp" name="empName">
   
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="empPwd">
  </div>
  
<div class="form-check">

  <input class="form-check-input" type="radio" name="empGen" id="exampleRadios1" value="Male" checked>
  <label class="form-check-label" for="exampleRadios1">
    Male
  </label>
</div>
<div class="form-check">
 
  <input class="form-check-input" type="radio" name="empGen" id="exampleRadios2" value="Female">
  <label class="form-check-label" for="exampleRadios2">
  Female
  </label>
</div>
<div class="form-group">
    <label for="exampleFormControlTextarea1">Employee Address ::</label>
    <textarea class="form-control" name="empAddr" id="exampleFormControlTextarea1" rows="3" cols="15"></textarea>
  </div>


<div class="form-group">
    <label for="exampleFormControlSelect1"> Employee Country ::</label>
    <select class="form-control"  name="empCountry" id="exampleFormControlSelect1">
      <option> INDIA </option>
<option> RUSIA </option>
<option>ISRIAL </option>
<option> AMERICA </option>
    </select>
    <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  </div>
   <button class="btn btn-primary" type="submit">Submit form</button>
</form>

</div>

</body>
</html>