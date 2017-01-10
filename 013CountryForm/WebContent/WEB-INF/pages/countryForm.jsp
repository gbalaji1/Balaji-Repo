<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
  <form:form action="saveCountry" method="post" commandName="country">
	<tr>  <td>Country Name:</td> <td><form:input  path="countryName"/> </td> </tr> 
	<tr> <td> PM Name :</td> <td><form:input path="pmName"/> </td> </tr> 
	<tr> <td colspan=2>   <input type="submit"> </td>
  </form:form>
</table> 

</body>
</html>