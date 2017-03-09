<%@page import="com.javatpoint.dao.ProductDAO"%>  
<jsp:useBean id="p" class="com.javatpoint.bean.Product"></jsp:useBean>  
<jsp:setProperty property="*" name="p"/>  
<%  
ProductDAO.Delete(p);  
response.sendRedirect("viewproduct.jsp");  
%>  
