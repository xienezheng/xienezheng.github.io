<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="">
    <meta name="author" content="">
    <title>诚缌科技线上商城</title>
	
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css">
	
	<!-- Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
	
	
	<!-- Custom Fonts -->
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css"  type="text/css">
    <link rel="stylesheet" href="fonts/font-slider.css" type="text/css">
	
	<!-- jQuery and Modernizr-->
	<script src="js/jquery-2.1.1.js"></script>
	
	<!-- Core JavaScript Files -->  	 
    <script src="js/bootstrap.min.js"></script>
	
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!--Top-->
	<nav id="top">
		<div class="container">
			<div class="row">
				<div class="col-xs-6">
					<select class="language">
						<option value="English" selected>中文</option>
						<option value="France">English</option>
						<option value="Germany">日语</option>
					</select>
					<select class="currency">
						<option value="USD" selected>现金</option>
						<option value="EUR">支付宝</option>
						<option value="DDD">微信</option>
					</select>
				</div>
				<div class="col-xs-6">
					<ul class="top-link">
						<li><a href="account.jsp"><span class="glyphicon glyphicon-user"></span> 个人中心</a></li>
						<li><a href="contact.jsp"><span class="glyphicon glyphicon-envelope"></span> 联系我们</a></li>
					</ul>
				</div>
			</div>
		</div>
	</nav>
	<!--Header-->
	<header class="container">
		<div class="row">
			<div class="col-md-4">
				<div id="logo"><img src="images/logo.jpg" /></div>
			</div>
			<div class="col-md-4">
				<form class="form-search">  
					<input type="text" class="input-medium search-query">  
					<button type="submit" class="btn"><span class="glyphicon glyphicon-search"></span></button>  
				</form>
			</div>
			<div class="col-md-4">
				<div id="cart"><a class="btn btn-1" href="cart.jsp"><span class="glyphicon glyphicon-shopping-cart"></span></a></div>
			</div>
		</div>
	</header>
	<!--Navigation-->
    <nav id="menu" class="navbar">
		<div class="container">
			<div class="navbar-header"><span id="heading" class="visible-xs">分类</span>
			  <button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse"><i class="fa fa-bars"></i></button>
			</div>
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li><a href="index.jsp">主页</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">PC端</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="category.jsp">安卓端</a></li>
									<li><a href="category.jsp">IOS</a></li>
							</ul>
							</div>
						</div>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">价位档次</a>
						<div class="dropdown-menu">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="category.jsp">基本档</a></li>
									<li><a href="category2.jsp">经济档</a></li>
									<li><a href="category3.jsp">豪华档</a></li>
									
								</ul>
							</div> 
						</div>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> 家居品牌</a>
						<div class="dropdown-menu" style="margin-left: -203.625px;">
							<div class="dropdown-inner">
								<ul class="list-unstyled">
									<li><a href="category.jsp">富安娜</a></li>
									<li><a href="category.jsp">水星</a></li>
									<li><a href="category.jsp">南极人</a></li>
									<li><a href="category.jsp">恒源祥</a></li>
									<li><a href="category.jsp">北极绒</a></li>
								</ul>
								<ul class="list-unstyled">
									<li><a href="category.jsp">lovo</a></li>
									<li><a href="category.jsp">梦洁</a></li>
									<li><a href="category.jsp">多喜爱</a></li>
									<li><a href="category.jsp">博洋</a></li>
									<li><a href="category.jsp">罗莱</a></li>
								</ul>
								<ul class="list-unstyled">
									<li><a href="category.jsp">三利</a></li>
									<li><a href="category.jsp">赤金</a></li>
									<li><a href="category.jsp">内野</a></li>
									<li><a href="category.jsp">洁丽雅</a></li>
									<li><a href="category.jsp">洁玉</a></li>
								</ul>
							</div>
						</div>
					</li>
					<li><a href="category.jsp"></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!--//////////////////////////////////////////////////-->
	<!--///////////////////HomePage///////////////////////-->
	
	<!--//////////////////////////////////////////////////-->
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
out.println("　　　　　　　　　　　尊敬的用户您好，我们已收到反馈，会尽快处理"+"<br/>");
response.setHeader("refresh","5;url=account.jsp");
out.println("　　　　　　　　　　　　　　　　　5秒后将自动跳转到登录页面");

%>
</body>
</html>


	<footer>
		<div class="container">
			<div class="wrap-footer">
				<div class="row">
					<div class="col-md-3 col-footer footer-1">
						<img src="images/logofooter.png" />
						<p>诚缌科技是中国地质大学在校生团队创办的一家新型的面向大学生群体的线上电商平台</p>
					</div>
					<div class="col-md-3 col-footer footer-2">
						<div class="heading"><h4>Customer Service</h4></div>
						<ul>
							<li><a href="#">关于我们</a></li>
							<li><a href="#"> 创始团队</a></li>
							<li><a href="#">投资融资</a></li>
							<li><a href="#">意见反馈</a></li>
							<li><a href="#">联系我们</a></li>
						</ul>
					</div>
					<div class="col-md-3 col-footer footer-3">
						<div class="heading"><h4></h4></div>
						<ul>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
						</ul>
					</div>
					<div class="col-md-3 col-footer footer-4">
						<div class="heading"><h4></h4></div>
						<ul>
							<li><span class="glyphicon glyphicon-home"></span>湖北武汉</li>
							<li><span class="glyphicon glyphicon-earphone"></span>15927170851</li>
							<li><span class="glyphicon glyphicon-earphone"></span>谢讷铮</li>
							<li><span class="glyphicon glyphicon-envelope"></span>xie_nazheng@163.com</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="copyright">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<a target="_blank" href="http://www.cssmoban.com/"></a>
					</div>
					<div class="col-md-6">
						<div class="pull-right">
							<ul>
								<li><img src="images/visa-curved-32px.png" /></li>
								<li><img src="images/paypal-curved-32px.png" /></li>
								<li><img src="images/discover-curved-32px.png" /></li>
								<li><img src="images/maestro-curved-32px.png" /></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>
>