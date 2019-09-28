<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>商品信息</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../css/intemDetails.css" />
		<link href="../font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet" />
		<link rel="stylesheet" href="../css/common.css" />
	<!-- 	<script src="../js/jquery.min.js"></script>  -->
	<script src="../js/jquery-1.8.3.js"></script>
		<script src="../js/jquery-ui-1.9.2.custom.js"></script>
		<style type="text/css">
		   .ui-effects-transfer { background: #f0ad4e;opacity: 0.5; }
			.navtext {
				color: #696969;
			}
			
			.menulist {
				color: white;
				margin-right: 40px;
               margin-left: 30px;
				font: larger;
			}
			
			#InputAmount {
				width: 70px;
				text-align: center;
			}
			
			#addCartFrame {
				padding-left:5% ;
			}
			#addcart{
				margin-left: 10%;
			}
			.userCommmettbl{
				width: 80%;
				margin: 20px auto;
			}
			.intemclass{
			
			}
			.input-group-addon:hover{
			cursor:pointer;
			}
			
		</style>
		<script type="text/javascript">
		$(function(){
			// 运行当前选中的特效
		    function runEffect() {
		      var selectedEffect = "transfer";
		      var  options = { to: "#cart", className: "ui-effects-transfer" };
		      $("#addcart").effect( selectedEffect, options, 300, callback );
		    };
		    function callback() {
		      setTimeout(function() {
		        $( "#addcart" ).removeAttr( "style" ).hide().fadeIn();
		      }, 1000 );
		    };
		    $( "#addcart" ).click(function() {
		      runEffect();
		      var itemId="${itemCustom.itemId}";
		      var itemNumble=$("#InputAmount").val();
		      $.ajax({
		    	  url:"${pageContext.request.contextPath}/order/addcart.action",
		    	  data:"itemId="+itemId+"&itemNumble="+itemNumble,
		    	 dataType:"json",
		    	  type:"POST",
		    	  success:function(data){
		    		  var cartCustom = data;
		    		  $("#cartCount").text(cartCustom.cartCount);
		    	  }
		      })
		      return false;
		    });
			$(".manlist").click(function(){
			     $(this).children(".intemclass").slideToggle("fast",function(){
			    	 });
			 })
			 var price =parseFloat($("#price").text()).toFixed(2);
			 $("#sum").text(price);
			 $("#subnum").click(function(){
				 num= $("#InputAmount").val();
				 num = parseInt(num);
				 if(num>0){
				    	num=num-1;
				    	}
				 $("#InputAmount").val(num);
				 $("#sum").text(num*price);
			 })
			 $("#addnum").click(function(){
				 num= $("#InputAmount").val();
				 num = parseInt(num);
				 num=num+1;
				 $("#InputAmount").val(num);
				 var sum =(num*price).toFixed(2);
				 $("#sum").text(sum);
			 })
			 
		})
		</script>
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
						<a class="navtext " href="${pageContext.request.contextPath }/order/cart.action "><i id="cart" class="fa fa-shopping-cart"></i> 购物车(<span id="cartCount">${cartCustom.cartCount }</span>)</a>
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
							<a class="navtext " href="${pageContext.request.contextPath }/order/cart.action"><i id="cart"  class="fa fa-shopping-cart"></i> 购物车(<span id="cartCount">${cartCustom.cartCount }</span>)</a>
						</div>
			    	</c:if>
		</div>
		<div class="container-fluid">
			
			<div class="mycontainer">
				<div class="row" style="width: 100%;">
					<div class="col-sm-7 ">
						<img src="../img/logo1.png" alt="公司logo" />&nbsp;
						<span id="logoW"><p>您身边的美食搬运工</p></span>
					</div>
					<div class="col-sm-3 col-sm-offset-2 searchFrame">
						<form action="${pageContext.request.contextPath }/item/itemsearch.action" method="post" style="display: inline;">
							<div class="input-group">
								<input class="form-control input-lg" type="text" name="itemName" id="searchInput" value="" placeholder="搜索美食食材 " />
								<span class="input-group-addon"><input class="searchButton" type="submit" value="搜索"/></span>
							</div>
						</form>
					</div>
				</div>
			</div>
			<nav class="navbar-inverse mymenu">
				<div class="mycontainer">
					<ul class="nav navbar-nav">
						<li class="manlist" style="  height: 50px;width: 170px;">
							<a class="menulist">食材分类<span class="caret"></span></a>
							<ul class="intemclass pull-left"  id="itemclasslist" style="display:none">
							   <c:forEach items="${itemclasses}" var="itemclass">
								 <a href="${pageContext.request.contextPath }/item/itemsearch.action?itemClass=${itemclass.classId }"><li class="classlist" value="${itemclass.classId }" >${itemclass.className }</li></a>
							</c:forEach>
							</ul>
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
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-10">
						<div class="container-fluid">
							<div class="row">
								<div class="col-sm-6">
									<img class="showImg img-rounded " src="/pic/${itemCustom.itemImg1}"  alt="${itemCustom.itemName }"  />
								</div>
								<div class="col-sm-6">
									<h3>${itemCustom.itemName }</h3>
									<p>${itemCustom.itemDesc }</p>
									<p class="saleInfo">价格：￥<span class="preprice">${itemCustom.itemPrice }</span></p>
									<p class="saleInfo">促销价：￥<span class="price" id="price">${itemCustom.itemPrice*itemCustom.itemDiscount}</span></p>
									<div class="saleDeTails">月销量<em>239</em></div>
									<div class="saleDeTails">累计评价<em>56</em></div>
									<div id="addCartFrame">
										<div class="form-inline">
											<div class="form-group">
												<div class="input-group">
													<span class="input-group-addon" id="subnum">-</span>
													<input type="text" class="form-control" id="InputAmount" value="1">
													<span class="input-group-addon" id="addnum">+</span>
												</div>
											</div>
											<button id="addcart" class="btn btn-warning"><i class="fa fa-cart-plus"></i>&nbsp;加入购物车</button>
										</div>
									</div>
									<p>小计：￥<span class="price" id="sum"></span></p>
								</div>
							</div>
							<div class="row-fluid">
						        <div class="widget-box">
						          <div class="widget-title">
						            <ul class="nav nav-tabs">
						              <li class="active"><a data-toggle="tab" href="#tab1">产品描述</a></li>
						              <li><a data-toggle="tab" href="#tab2">产品属性</a></li>
						              <li><a data-toggle="tab" href="#tab3">其他信息</a></li>
						              <li><a data-toggle="tab" href="#tab4">商品评价</a></li>
						            </ul>
						          </div>
						          <div class="widget-content tab-content">
						            <div id="tab1" class="tab-pane active">
						             <c:if test="${itemCustom.itemDescimg1!=null}">
								    	<img src="/pic/${itemCustom.itemDescimg1}" width="100%"/>
								     </c:if>
								     <c:if test="${itemCustom.itemDescimg2!=null}">
								    	<img src="/pic/${itemCustom.itemDescimg2}" width="100%"/>
								     </c:if>
								     <c:if test="${itemCustom.itemDescimg3!=null}">
								    	<img src="/pic/${itemCustom.itemDescimg3}" width="100%"/>
								     </c:if>
								     <c:if test="${itemCustom.itemDescimg4!=null}">
								    	<img src="/pic/${itemCustom.itemDescimg4}" width="100%"/>
								     </c:if>
								     <c:if test="${itemCustom.itemDescimg5!=null}">
								    	<img src="/pic/${itemCustom.itemDescimg5}" width="100%"/>
								     </c:if>
								     
						             </div>
						            <div id="tab2" class="tab-pane"> 
						             <table class="table">
						             <tr>
							             <td>产品名称：${itemCustom.itemName }
							             </td>
						             </tr>
						             <tr>
							             <td>规格：${itemCustom.itemNorm }
							             </td>
						             </tr>
						             <tr>
							             <td>生产产地：${itemCustom.itemAddress }
							             </td>
						             </tr>
						              <tr>
							             <td>生产日期：${itemCustom.itemCreatetime }
							             </td>
						             </tr>
						              <tr>
							             <td>保质期：${itemCustom.itemExpirtime }
							             </td>
						             </tr>
						             </table>
						          
						            </div>
						            <div id="tab3" class="tab-pane">
						              <p>And is full of waffle to It has multiple paragraphs and is full of waffle to pad out the comment. Usually, you just wish these sorts of comments would come to an end.multiple paragraphs and is full of waffle to pad out the comment. </p>
						              <img src="img/demo/demo-image3.jpg" alt="demo-image"/>
						            </div>
						              <div id="tab4" class="tab-pane">
										<table class="table userCommmettbl">
											<caption>客户评价</caption>
											<tr><td>用户一</td><td>美味佳肴，极品</td><td><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i></td></tr>
											<tr><td>用户二</td><td>价格实惠，物美价廉 </td><td><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i></td></tr>
										</table>
						            </div>
						          </div>
						          
						        </div>
							</div>
							
						</div>
					</div>
					<div class="col-sm-2">
						<div class="row">
						<p class="hotItems">热门食材</p>
							<c:forEach items="${itemCustom.itemCustomlist }" var="item">
							   <div class="col-xs-12">
								<a href="${pageContext.request.contextPath }/item/scopeItem.action?itemId=${item.itemId}"">
									<div class="thumbnail">
										<img src="/pic/${item.itemImg1}" class="img-rounded " alt="${item.itemName }">
										<div class="caption">
											<h5>${item.itemName }</h5>
											<p>促销价：￥<span class="price"><fmt:formatNumber type="number" value="${item.itemPrice*item.itemDiscount}" pattern="0.00" maxFractionDigits="2"></fmt:formatNumber></span> <span class="preprice">${item.itemPrice }</span></p>
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
		<script src="../js/bootstrap.min.js"></script> 
	</body>
</html>