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

	
	<!--//////////////////////////////////////////////////-->
	<!--///////////////////Account Page///////////////////-->
	<!--//////////////////////////////////////////////////-->
	<div id="page-content" class="single-page">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="breadcrumb">
					
						<li><a href="index.jsp">用户名</a></li>
						<li><a href="account.jsp">密码</a></li>
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<div class="heading"><h2>登录</h2></div>
					<form name="form1" id="ff1" method="post" action="admindownload">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Username :" name="username" id="username" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" placeholder="Password :" name="password" id="email" required>
						</div>
						<button type="submit" class="btn btn-1" name="login" id="login">登录</button>
						<a href="#">忘记密码？</a>
					</form>
				</div>
				<div class="col-md-6">
					<div class="heading"><h2>新管理员请注册</h2></div>
					<form name="form2" id="ff2" method="post" action="adminloginup">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="姓名" name="firstname" id="firstname" required>
						</div>
						
						<div class="form-group">
							<input type="tel" class="form-control" placeholder="权限:" name="pri" id="email" required>
						</div>
						
						
						<div class="form-group">
							<input type="password" class="form-control" placeholder="密码" name="password" id="password" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" placeholder="再次输入密码" name="repassword" id="repassword" required>
						</div>
						<div class="form-group">
							<input name="agree" id="agree" type="checkbox" > 同意此网站协议
						</div>
						<button type="submit" class="btn btn-1">创建新账户</button>
					</form>
				</div>
			</div>
		</div>
	</div>
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
