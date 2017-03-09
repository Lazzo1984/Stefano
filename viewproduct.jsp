<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VIEW PRODUCT</title>
</head>
<body>
		<%@page import="com.javatpoint.dao.ProductDAO,com.javatpoint.bean.*,java.util.*"%>  
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
		<h1>PRODUCTS LIST</h1>
			<%  
			List<Product> list=ProductDAO.getAllRecords();  
			request.setAttribute("list",list);  
			%>  
	  			<table border="1" width="90%">  
					<tr><th>Product_Id</th><th>Codice</th><th>Name</th><th>Posizione</th>  
					<th>Quantità</th><th>Descrizione</th><th>Edit</th><th>Delete</th></tr>  
					<c:forEach items="${list}" var="p">  
					<tr><td>${p.getProduct_Id()}</td><td>${p.getName()}</td><td>${p.getCodice()}</td>  
					<td>${p.getPosizione()}</td><td>${p.getQuantita()}</td><td>${p.getDescrizione()}</td>  
					<td><a href="editform.jsp?id=${p.getProduct_Id()}">Edit</a></td>  
					<td><a href="deleteproduct.jsp?id=${p.getProduct_Id()}">Delete</a></td></tr>  
					</c:forEach>  
				</table>  
			<br/><a href="addproductform.jsp">Add New Product</a>  
</body>
</html>