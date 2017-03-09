<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//ITA" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDIT FORM</title>
</head>
<body>
	<%@page import="com.javatpoint.dao.ProductDAO,com.javatpoint.bean.Product"%>
		<%  
		String id=request.getParameter("product_id");  
		Product p=ProductDAO.getRecordById(Integer.parseInt(id));  
	%>  
	<h1>EDIT FORM</h1>  
	<form action="editproduct.jsp" method="post">  
	<input type="hidden" name="product_id" value="<%=p.getProduct_Id() %>"/>  
	<table>  
<tr><td>ID:</td><td>  
<input type="number" name="product_id" value="<%= p.getProduct_Id()%>"/></td></tr>  
<tr><td>Codice:</td><td>  
<input type="number" name="codice" value="<%= p.getCodice()%>"/></td></tr>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= p.getName()%>"/></td></tr>   
<tr><td>Posizione:</td><td>  
<input type="text" name="posizione" value="<%= p.getPosizione()%>"/></td></tr>
<tr><td>Quantità:</td><td>  
<input type="number" name="quantità" value="<%= p.getQuantita()%>"/></td></tr>  
<tr><td>Descrizione:</td><td>  
<input type="text" name="descrizione" value="<%= p.getDescrizione()%>"/></td></tr>  
</td></tr>  
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>  
  
 
</body>
</html>