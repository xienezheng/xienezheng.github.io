<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   
       <%@page import="java.sql.*" %>
    <%@page import="com.javabean.adminoper.*" %>
    <%@page import="com.javabean.guestoper.*" %>
    <%@page import="com.javabean.jdbc.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>顾客信息</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <!-- Page Specific CSS -->
    <link rel="stylesheet" href="css/morris-0.4.3.min.css">
  </head>

  <body>

    <div id="wrapper">

      <!-- Sidebar -->
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.html">管理端主页</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav side-nav">
            <li class="active"><a href="Adminindex.jsp"><i class="fa fa-dashboard"></i>管理端主页</a></li>
            <li><a href="AdminQueryGuest.jsp"><i class="fa fa-bar-chart-o"></i>查询所有客户信息</a></li>
            <li><a href="AdminNameQueryGuest.jsp"><i class="fa fa-bar-chart-o"></i>姓名查询客户信息</a></li>
            <li><a href="AdminQueryadmin.jsp"><i class="fa fa-table"></i>查询所有管理员信息</a></li>
            <li><a href="AdminNameQueryadmin.jsp"><i class="fa fa-table"></i>姓名查询管理员信息</a></li>
            
            <li><a href="AdminQueryList.jsp"><i class="fa fa-edit"></i>查询所有交易清单</a></li>
             <li><a href="AdminNameQueryList.jsp"><i class="fa fa-edit"></i>姓名查询交易清单</a></li>
            <li><a href="AdminQueryBack.jsp"><i class="fa fa-font"></i>查看用户反馈</a></li>

 <li><a href="index.jsp"><i class="fa fa-font"></i>返回客户端首页</a></li>
        
                <div class="text-right">
                  <a href="#">查看所有动态 <i class="fa fa-arrow-circle-right"></i></a>
                </div>
              </div>
            </div>
          </div>
         
      </div><!-- /#page-wrapper -->

    </div><!-- /#wrapper -->
        
<%
try
{
request.setCharacterEncoding("utf-8");
ArrayList<Guest> user1=new ArrayList<Guest>();




user1=(ArrayList<Guest>)session.getAttribute("nameguest");
out.println("　　　　　　　　　　　　　　　　　　　　　　　　　　　姓名             地址                 电话                    性别<br/>");
for(int i=0;i<user1.size();i++)
{
	out.println("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　"+user1.get(i).getName()+user1.get(i).getAddress()+user1.get(i).getTel()+user1.get(i).getSex()+"<br/>");
}
}catch(Exception e)
{
	
}
finally
{
	
}


%>
     
    <!-- JavaScript -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.js"></script>

    <!-- Page Specific Plugins -->    <script src="js/raphael-min.js"></script>
    <script src="js/morris-0.4.3.min.js"></script>
    <script src="js/morris/chart-data-morris.js"></script>
    <script src="js/tablesorter/jquery.tablesorter.js"></script>
    <script src="js/tablesorter/tables.js"></script>

  </body>
</html>

