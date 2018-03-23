<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@page import="java.sql.*" %>
    <%@page import="com.javabean.adminoper.*" %>
    <%@page import="com.javabean.guestoper.*" %>
    <%@page import="com.javabean.jdbc.*" %>
    <%@page import="java.util.*" %>
    <%@page import="com.javabean.productlist.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
try
{request.setCharacterEncoding("utf-8");
ArrayList<ProductInfor> pro=new ArrayList<ProductInfor>();
	String name=(String)session.getAttribute("guest");
String sql="select * from guest_product_in where name='"+name+"'";
pro=UserDao.QueryList(sql);
if(pro==null)
{
	System.out.println("查询失败");
}
out.println("尊敬的"+pro.get(0).getName()+",您的购物记录如下："+"<br/>");
for(int i=0;i<pro.size();i++)
{
	
	out.println(pro.get(i).getProductname1());
	out.println(pro.get(i).getProductprice1()+"￥"+"<br/>");
}

}catch(Exception e)
{
	
}
finally
{
	
}



%>
</body>
</html>