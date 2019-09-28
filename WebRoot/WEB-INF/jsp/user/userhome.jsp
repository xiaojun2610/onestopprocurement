<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>我的美食达——用户信息</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../css/intemDetails.css" />
		<link href="../font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet" />
		<link rel="stylesheet" href="../css/common.css" />
		<script src="../js/jquery-1.11.1.js"></script>
		<script src="../js/calendar.js"></script>
	</head>
	<style type="text/css">
	.list-group-item{
	    background-color:rgb(107,197,53);
	    color:white;
	    width:80%;
	    }
	 .badge{
	 background-color: #e7b76c;
	 }
	</style>
	<body>
		<div class="nav navbar-default mynav">
			<p class="pull-left  navbar-text">
				<a class="navtext" href="${pageContext.request.contextPath }/item/home.action"><i class="fa fa-home"></i>欢迎来到美食达食材一体化采购系统</a> &nbsp;&nbsp;欢迎
				<a class="navtext" href="#">${userCustom.userName }</a>
			</p>
			<div class="pull-right " style="margin-right:20px">
				<div  style="display: inline-block;">
					<div class="dropdown">
					  <button class="btn  dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" style="color:#696969 ;" >
					  <i class="fa fa-user-circle"></i>  我的美食达
					    <span class="caret"></span>
					  </button>
					  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" style="min-width: inherit;">
					    <li><a href="#">个人资料</a></li>
					    <li><a href="#">查看积分</a></li>
					    <li role="separator" class="divider"></li>
					    <li><a href="${pageContext.request.contextPath }/user/user_exit.action">退出登录</a></li>
					  </ul>
					</div>
				</div>
				<a class="navtext " href="${pageContext.request.contextPath }/order/cart.action"><i id="cart" class="fa fa-shopping-cart"></i>购物车(<span id="cartCount">${cartCustom.cartCount }</span>)</a>
			</div>
		</div>
		<div class="container-fluid">

			<div class="mycontainer">
				<div class="row" style="width: 100%;">
					<div class="col-sm-7 ">
						<img src="../img/logo1.png" alt="公司logo" />&nbsp;&nbsp;&nbsp;
						<span id="logoW"><p>您身边的美食搬运工</p></span>
					</div>
				</div>
			</div>
			<div class="container-fluid" >
				<div class="row">
					<div class="col-sm-2">
						<ul class="list-group">
							<li class="list-group-item">
								我的资料
							</li>
							<li class="list-group-item">
								<span class="badge">${cartCustom.cartCount }</span> 我的购物车
							</li>
							<li class="list-group-item">
								我的订单
							</li>
							<li class="list-group-item">
								我的积分
							</li>
						</ul>

					</div>
					<div class="col-sm-8">
						<div class="container-fluid"  >
							<div class="row" style="min-height:250px">
								<p class="hotItems">我买过的食材</p>
								<hr/>
								
							</div>
							<div class="row" style="min-height:250px" >
								<p class="hotItems">我浏览过的食材</p>
								<hr/>
							</div>
						</div>

					</div>
					<div class="col-sm-2">
						<br/>
						<p class="hotItems">友情链接：</p>
						<ul style="list-style:none;
						margin-left:20px">
						<li><a href="#">中国菜谱网</a></li>
						<li><a href="#">豆果网</a></li>
						<li><a href="#">京东商城</a></li>
						<li><a href="#">淘宝网</a></li>
						<li><a href="#">百度一下</a></li>
						<li><a href="#">腾讯网</a></li>
						<li><a href="#">新浪网</a></li>
						<li><a href="#">搜狐网</a></li>
						</ul>
						

					</div>
                </div>
			</div>
	   </div>
	   <div > 
	   
	   </div>
		<div class="footer">
			<p class="footert">
				<a href="#">关于美食达</a>
				<a href="#">帮助中心</a>
				<a href="#">诚聘英才</a>
				<a href="#">联系我们</a>
				<a href="#">全国统一热线：4008637688</a>
				<br />&copy; Copyright by贵州美食达食品有限公司. ALL Rights Reserved.
			</p>
		</div>
		<script src="../js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	</body>

</html>