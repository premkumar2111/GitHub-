<%@page import="model.userdetail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password],input[type=number] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: 1px black solid;
  background-color: rgb(255, 255, 255);
}

input[type=text]:focus, input[type=password]:focus,input[type=number]:focus {
  background-color: rgb(0, 255, 0);
  opacity:0.5;
  
  outline: none;
}
body{
background: rgba(0, 255, 255);
}

form{

background-color: rgb(255, 255, 255);
border-radius:10px;

display: flex;
align-items: center;
justify-content: center;



}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}
form{
	width:700px
	
}
h1{

margin-left:260px;
color: blue;
}
p{
margin-left:190px;
color: blue;

}
span{
	color: red;
}
label{

}
#b{
	margin:0;
	
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>

<body>


<%userdetail u=(userdetail) request.getAttribute("u"); %>


<form action="updata">
  <div class="container">
    <hr>

   <label>Enter id</label>
	<input type="number" name="id"  value="<%=u.getId() %>" readonly="readonly"> <br><br>
	
	<label>Enter first name</label>
	<input type="text" name="fname"  value="<%=u.getFname()%>">
	
	<label>Enter last name</label>
	<input type="text" name="lname"  value="<%=u.getLname()%>">
	
	<label>Enter gender</label>
	<input type="text" name="gender"  value="<%=u.getGender()%>">
	
	<label>Enter email</label>
	<input type="text" name="email" value="<%=u.getEmail()%>">
	
	<label>Enter password </label>
	<input type="text" name="password" value="<%=u.getPassword()%>">
	
	<label>Enter phone</label>
	<input type="number" name="phone" value="<%=u.getPhone()%>"> <br><br>


	<input type="submit">
	
  </div>
</form>




</body>
</html>