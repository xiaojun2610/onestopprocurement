<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="UTF-8">
		<title>登录</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="../css/common.css" />
	</head>
	<style type="text/css">
		#loginform {
			width: 90%;
		}
		
		@media only screen and (min-width: 1200px) {
			#loginform {
				width: 80%;
			}
			
		}
		
		@media only screen and (max-width: 1000px){
			#logiImg{
			display:none;
			}
			#loginform {
				width:50%;
				margin:300px auto;
				
			}
		}
	</style>
	   <script type="text/javascript">
     var msg="${msg}";
     if(msg=="fail"){
    	 alert("用户名或密码错误!");
    	 
     }
     
   </script>
	<body>
		<div class="container-fluid" style="min-height:700px">
			<ol class="breadcrumb" style="background:white">
				<li>
					<a href="${pageContext.request.contextPath }/item/home.action">首页</a>
				</li>
				<li class="active">登录</li>
			</ol>
			<div class="container" style="margin: 30px 50px;">
				<div class="row">
					<div class="col-sm-7 ">
						<img src="../img/logo1.png" alt="公司logo" />&nbsp;&nbsp;&nbsp;
						<span id="logoW"><p>您身边的美食搬运工</p></span>
					</div>
					<!--						<div class="col-sm-3 col-sm-offset-2">
							<div class="form-group">
								<input type="" name="" id="" value="" placeholder="搜索美食食材"/>
							</div>
						</div>-->
				</div>
			</div>
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-7" id="logiImg"><img src="../img/01.jpg" width="100%" height="300px" />
					</div>
					<div class="col-md-5">
						<div id="loginform">
							<form  method="post" class="form-horizontal" role="form" action="${pageContext.request.contextPath }/user/userlogin.action">
								<h4 align="center" style="margin-bottom: 60px;">用户登录</h4>
								<div class="form-group" style="height:60px">
									<label for="firstname" class="col-sm-3 control-label">用户:</label>
									<div class="col-sm-9">
										<input type="text" class="form-control"  name="userName" id="userName" placeholder="用户名、手机、邮箱" />
									</div>
								</div>
								<div class="form-group" style="height:60px">
									<label for="password" class="col-sm-3 control-label">密码:</label>
									<div class="col-sm-9">
										<input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="密码" />
									</div>
								</div>
								<div class="form-actions">
									<span class="pull-left" style="margin-left: 50px;"><a href="#" class="flip-link btn btn-info" id="to-recover">忘记密码?</a></span>
									<span class="pull-right"><input type="submit" class="btn btn-success" value="&nbsp; &nbsp; 登录  &nbsp; &nbsp;  " /> </span>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
      <div class="footer" >
      <p class="footert">
      	<a href="#">关于美食达</a> <a href="#">帮助中心</a>
      	<a href="#">诚聘英才</a><a href="#">联系我们</a>
      	<a href="#">全国统一热线：4008637688</a>
       <br />&copy; Copyright by贵州美食达食品有限公司. ALL Rights Reserved. 
     </p>
	</div>
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	</body>
</html>