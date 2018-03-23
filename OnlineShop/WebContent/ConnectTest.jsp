<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.javabean.adminoper.*" %>
    <%@page import="com.javabean.guestoper.*" %>
    <%@page import="com.javabean.jdbc.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
try
{
Connection conn=JdbcCon.getConnection();
if(conn!=null)
{
	out.println("数据库连接成功");
}
Guest guest=new Guest();
ArrayList<Guest> user1=new ArrayList<Guest>();



String sql="select * from guest_in where name='王琳瑷'";

user1=UserDao.QueryGuest(sql);
for(int i=0;i<user1.size();i++)
{
	out.println(user1.get(i).getPwd());
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