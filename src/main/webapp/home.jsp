<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to our service page</h1>
<!--  i am using a table to represent the data from controller -->

<table cellpadding="10" cellspacing="5" border="1">
  
  <tr>
    <th>##</th>
    <th>name</th>
    <th>email</th>
    <th>State</th>
  
  </tr>
  <tr>
    <td>${x.id}</td>
    <td>${x.name}</td>
    <td>${x.email}</td>
    <td>${x.state}</td>
  
  </tr>
  <tr>
    <td>${m.id}</td>
    <td>${m.name}</td>
    <td>${m.email}</td>
    <td>${m.state}</td>
  </tr>


</table>

</body>
</html>