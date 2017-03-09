<%@page import="com.javatpoint.dao.ProductDAO"%>  
<jsp:useBean id="p" class="com.javatpoint.bean.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>  
  
<%  
int i=ProductDAO.Save(p);  
if(i>0){  
response.sendRedirect("addproduct-success.jsp");  
}else{  
response.sendRedirect("addproduct-error.jsp");  
}  
%>  
