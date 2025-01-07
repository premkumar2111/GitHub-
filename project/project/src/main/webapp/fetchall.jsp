<%@page import="model.userdetail"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style> body{
background-color: yellow;
}
#t{

margin: 20%;
gap
}

</style>
</head>


<body>

<% 
List<userdetail> l=(List<userdetail>) request.getAttribute("list");
%>



<table border="2px" id=t>
	<tr>
		<th>id</th>
		<th>fname</th>
		<th>lname</th>
		<th>gender</th>
		<th>email</th>
		<th>pssword</th>
		<th>phone</th>
		<th>delete</th>
		<th>updata</th>
	
	</tr>
	<%     
		for(userdetail u : l){
	%>
	<tr>
		 <td><%=u.getId() %></td>
		 <td><%=u.getFname() %></td>
		 <td><%=u.getLname() %></td>
		 <td><%=u.getGender() %></td>
		 <td><%=u.getEmail() %></td>
		 <td><%=u.getPassword() %></td>
		 <td><%=u.getPhone() %></td>
		 <td><a href="delete?id=<%=u.getId()%>">delete</a></td>
		 <td><a href="fetchbyid?id=<%=u.getId()%>">updata</a></td>
		 
	</tr>
<%
	}
	%>
</table>









</body>
</html>