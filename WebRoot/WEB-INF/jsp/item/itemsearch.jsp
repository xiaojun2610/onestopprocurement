<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>美食达食材一体化采购系统——首页</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css" />
	<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
	<link rel="stylesheet" href="../css/common.css" />
	<link href="../font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet" />
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../js/masonry.pkgd.min.js" ></script>
	 <script type="text/javascript" src="../js/imagesloaded.pkgd.min.js" ></script>
    <style type="text/css">
        .navtext {
			color: #696969;
		}
		.menulist {
			color: white;
			margin-right: 50px;
			font: larger;
		}
    </style>

</head>
<body>
	<div class="nav navbar-default mynav">
				<c:if test="${userCustom ==null }">
					<p class="pull-left  navbar-text">
						<a class="navtext" href="${pageContext.request.contextPath }/item/home.action"><i class="fa fa-home"></i>欢迎来到美食达食材一体化采购系统</a> &nbsp;&nbsp;
						<a class="navtext " href="${pageContext.request.contextPath }/user/login.action ">请登录</a> &nbsp;&nbsp;
						<a class="navtext " href="${pageContext.request.contextPath }/user/register.action ">免费注册</a>
					</p>
					<p class="pull-right  navbar-text">
						<a class="navtext " href="${pageContext.request.contextPath }/user/login.action "><i class="fa fa-user-o"></i>我的美食达</a> &nbsp;&nbsp;
						<a class="navtext " href="${pageContext.request.contextPath }/order/cart.action "><i class="fa fa-shopping-cart"></i> 购物车(<span id="cartCount">${cartCustom.cartCount }</span>)</a>
					</p>
				</c:if>
				<c:if test="${userCustom != null }">
				   <p class="pull-left  navbar-text">
							<a class="navtext" href="${pageContext.request.contextPath }/item/home.action"><i class="fa fa-home"></i>欢迎来到美食达食材一体化采购系统</a> &nbsp;&nbsp;欢迎
							<a class="navtext" href="${pageContext.request.contextPath }/user/userhome.action">${userCustom.userName }</a>
						</p>
						<div class="pull-right " style="margin-right:20px">
							<div  style="display: inline-block;">
								<div class="dropdown">
								  <button class="btn  dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" style="color:#696969 ;" >
							   	<i class="fa fa-user-circle"></i> 我的美食达
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
							<a class="navtext " href="${pageContext.request.contextPath }/order/cart.action"><i class="fa fa-shopping-cart"></i> 购物车(<span id="cartCount">${cartCustom.cartCount }</span>)</a>
						</div>
			    	</c:if>
		</div>
<div class="container-fluid">
		<div class="mycontainer">
			<div class="row" style="width: 100%;">
				<div class="col-sm-7 ">
					<img src="../img/logo1.png" alt="公司logo" />&nbsp;&nbsp;&nbsp;
					<span id="logoW"><p>您身边的美食搬运工</p></span>
				</div>
				<div class="col-sm-3 col-sm-offset-2 searchFrame">
					<form action="${pageContext.request.contextPath }/item/itemsearch.action" method="post" style="display: inline;">
						<div class="input-group">

							<input class="form-control" type="text" name="itemName" id="searchInput" value="" placeholder="搜索美食食材" />
							<span class="input-group-addon"><input class="searchButton" type="submit" value="搜索"/></span>

						</div>
					</form>
				</div>
			</div>
		</div>
		<nav class="navbar-inverse mymenu">
			<div class="mycontainer">
				<ul class="nav navbar-nav">
					<li >
						<a class="menulist" id="itemClassname">食材分类<span class="caret"></span></a>
					</li>
					<li>
						<a class="menulist" href="">新品推荐</a>
					</li>
					<li>
						<a class="menulist" href="">菜品展示</a>
					</li>
				</ul>
			</div>
		</nav>
		<div class="container-fluid" style="min-height:550px">
			<div class="row">
				<div class="col-md-2">
					<ul class="intemclass pull-right"  id="itemclasslist" style="">
					   <c:forEach items="${itemclasses}" var="itemclass">
							<a href="${pageContext.request.contextPath }/item/itemsearch.action?itemClass=${itemclass.classId }"><li class="classlist" value="${itemclass.classId }" >${itemclass.className }</li></a>
					</c:forEach>
					</ul>
				</div>
				<div class="col-md-10">
				
					<div class="row">
					   <br/>
					     <p class="hotItems">已选条件：<span class="hotItems">${itemCustom.className }</span>&nbsp;&nbsp; <span class="hotItems">${itemCustom.itemName }</span></p> 
					   <br/>
						<p class="hotItems">搜素结果</p>
						<hr/>
						<div class="row masonry">
						<c:forEach items="${itemCustom.itemCustomlist }" var="item">
						   <div class="col-xs-12 col-sm-6 col-md-4 item">
							<a href="${pageContext.request.contextPath }/item/scopeItem.action?itemId=${item.itemId}"">
								<div class="thumbnail">
									<img src="/pic/${item.itemImg1}" class="img-rounded " alt="${item.itemName }">
									<div class="caption">
										<h3>${item.itemName }</h3>
										<p>${item.itemDesc }</p>
										<p>促销价：￥<span class="price">${item.itemPrice*item.itemDiscount}</span> <span class="preprice">${item.itemPrice }</span></p>
									</div>
								</div>
							</a>
						</div>
						</c:forEach>
					</div>
					

					</div>
				</div>
				
			</div>
		</div>
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
    <script type="text/javascript">
    $(document).ready(function(){
    	$('.masonry').imagesLoaded(function() {
    		$('.masonry').masonry({
    		itemSelector: '.item'
    		});
    		});
    $("#itemClassname").click(function(){
      $("#itemclasslist").slideToggle("fast",function(){
    	 });
    	})
    	
    })
    </script>
</body>
</html>