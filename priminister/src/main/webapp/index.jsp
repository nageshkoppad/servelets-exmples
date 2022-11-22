<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details of prime ministers</title>
</head>
<body>
<a href ="show">Show</a>
<form action="primeMinister" method = "post">
Name:<input type="text" id="name" name="name"><br>
Country:<select name="country">
		<option>----Select Country----</option>
		<option value = "India">India</option>
		<option value ="USA">USA</option>
		<option value = "Canada">Canada</option>
		<option value = "Australia">Australia</option>
		</select>
		<br>
Marriage Status:
<input type="radio" id ="marriage" name ="married" value = "Married">
<label for="marriage">Married</label>
<input type="radio" id ="marriage" name ="married" value = "UnMarried">
<label for="marriage">UnMarried</label>
<br>

Party:
<select name="Party">
		<option>----Select Party----</option>
		<option value = "BJP">BJP</option>
		<option value ="JDS">JDS</option>
		<option value = "AAP">AAP</option>
		<option value = "Congress">Congress</option>
		</select>
		<br>
Age:
<input type="text" id="age" name="age">
<br>		
Select Gender :<br>
<input type="radio" id ="gender" name ="gen" value = "male">
<label for="gender">male</label>&nbsp;&nbsp;
<input type="radio" id ="gender" name ="gen" value = "female">
<label for="gender">female</label>&nbsp;&nbsp;
<input type="radio" id ="gender" name ="gen" value ="others">
<label for="gender">others</label><br>
<br>	
Period:
<input type="text" id="period" name="period">
<br>
Times Represented:
<select name="times">
		<option>----Select Party----</option>
		<option value = "1">1</option>
		<option value ="2">2</option>
		<option value = "3">3</option>
		<option value = "4">4</option>
		</select>
		<br>
<input type = "submit"  value="click"/>
</form>

</body>
</html>