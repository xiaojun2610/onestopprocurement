<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="../css/common.css" />
<link href="../font-awesome-4.7.0/css/font-awesome.css" rel="stylesheet" />
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<style type="text/css">
  .input-group-addon{
   background:#C0C0C0;
  }
  .input-group-addon:hover{
   cursor:pointer;
  }
  
  .table tbody tr td{
     
  }
</style>
<script type="text/javascript">
    function change(){
	sum = 0;
   	 $(".item").each(function(i,part){
   		 if($(part).find(".itemId").attr("checked")=="checked"){
	    		var price  = $(part).children(".partprice").text();
	    		var count = $(part).find(".InputAmount").val();
	    		 a = price*count;
	    		 sum = sum+a;
   		 }
   	 })
   	 $("#sum").text(sum.toFixed(2)); 
	}  
 	function allChoose(){
		for(var i=0;i<document.getElementsByClassName("itemId").length;i++){
		document.getElementsByClassName("itemId")[i].checked=true;
		}
		change();
	}
	function antaChoose(){
		for(var i=0;i<document.getElementsByClassName("itemId").length;i++){
			if(document.getElementsByClassName("itemId")[i].checked==true)
		     document.getElementsByClassName("itemId")[i].checked=false;
		    else
		    document.getElementsByClassName("itemId")[i].checked=true;
		}
		check();
		change();
	}
	function check(){
		for(var i=0;i<document.getElementsByClassName("itemId").length;i++){
		if(document.getElementsByClassName("itemId")[i].checked==false){
		    document.getElementById("all").checked=false;
		    break;
		}
		}
		change();
	}
 $(function(){
	 sum = 0;
   	 $(".item").each(function(i,part){
   		 if($(part).find(".itemId").attr("checked")=="checked"){
	    		var price  = $(part).children(".partprice").text();
	    		var count = $(part).find(".InputAmount").val();
	    		 a = price*count;
	    		 sum = sum+a;
   		 }
   	 })
   	 $("#sum").text(sum.toFixed(2)); 
	$(".subnum").click(function(){
		 var price =$(this).parents().children(".partprice").text();
		 num= $(this).parent().children(".InputAmount").val();
		 num = parseInt(num);
		 if(num>0){
		    	num=num-1;
		    	}
		 $(this).parent().children(".InputAmount").val(num);
		 change(); 
	})
	$(".addnum").click(function(){
		var price =$(this).parents().children(".partprice").text();
		 num= $(this).parent().children(".InputAmount").val();
		 num = parseInt(num);
		 num=num+1;
		 $(this).parent().children(".InputAmount").val(num);
		  change(); 
     })
     
     $(".InputAmount").change(function(){
    	  change();  
     }
    )
     
     
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
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
		   <div class="col-md-2">
		   </div>
		    <div class="col-md-8" style="min-height:550px">
		    <form action=""></form>
		     <table class="table" style="text-align:center;">
		     <caption ><i class="fa fa-shopping-cart  fa-5x" style="color:#FFCC00"></i>购物车</caption>
		       <thead>
		         <tr>
		          <td>选择</td>
		          <td>商品图片</td>
		          <td>商品名称</td>
		          <td>单价</td>
		          <td>数量</td>
		         </tr>
		        </thead>
		        <tbody>
		        <c:forEach items="${cartCustom.cartCustomlist }" var="cartCustom">
							<tr class="item">
								<td><input type="checkbox" class="itemId" name="itemId" checked onclick="check()" value="${cartCustom.itemId}"/></td>
								<td><img src="/pic/${cartCustom.itemImg}" class="img-rounded " alt="${cartCustom.itemName }" width="100px" height="100px"></td>
								<td>${cartCustom.itemName }</td>
								<td class="partprice">${cartCustom.itemPrice }</td>
								<td>
								<div class="input-group" style="width:120px;margin:auto auto;"  >
								   <span class="input-group-addon subnum" >-</span>
								   <input type="text" class="form-control InputAmount" value="${cartCustom.itemNumble}">
								   <span class="input-group-addon addnum" >+</span>
								</div>
								</td>
							</tr>
				</c:forEach>
		        </tbody>
		     </table> 
		     <p>全选<input type="checkbox" name="" id="all" value="全选" checked style="width:20px" onclick="allChoose()" />&nbsp;&nbsp;反选<input type="checkbox" name="" id="" value="反选"  style="width:20px" onclick="antaChoose()" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总价：￥<span class="price" id="sum"> </span>  <button  type="submit" class="btn btn-danger pull-right"><i class="fa fa-calculator"></i> &nbsp;去结算</button></p>
		     </form>
		   </div>
		    <div class="col-md-2">
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
</body>
</html>