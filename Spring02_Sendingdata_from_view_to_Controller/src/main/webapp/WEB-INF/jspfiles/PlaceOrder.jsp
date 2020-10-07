<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="processorder" method="post">
    <label for="food"><b>FoodItem</b></label>
    <input type="text" placeholder="What type of food u want?"  id="food" name="fooditem" required>

   <label for="foodquantity">Quantity</label>

<select name="quantity" id="foodquantity">
  <option value="Half Plate">Half Plate</option>
  <option value="Full Plate">Full Plate</option>
  <option value="1kg">1 kg</option>
  <option value="1/2kg">1/2 kg</option>
</select>

    <button type="submit">Order</button>
    <label>
      <input type="checkbox"  name="check">Confirm
    </label>
    </form>
  </div>
</body>
</html>