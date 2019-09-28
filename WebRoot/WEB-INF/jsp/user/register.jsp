<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8"/>
<title>注册</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="../css/common.css" />
<link rel="stylesheet" type="../text/css" href="css/register.css" />
<script src="../js/jquery.min.js"></script>
<style type="text/css">
.box-body {
	margin: auto auto;
	overflow: visible;
}

.box-header {
	font-size: larger;
	text-align: center;
	font-weight: bold;
	margin-bottom: 20px;
}

.warn {
	display: inline-block;
	float: left;
	color: red;
	font-size: 6px;
}
</style>
<script   type="text/javascript" charset="utf-8">
	$(function(){
		$("#userName").blur(function(){
	     var url = "${pageContext.request.contextPath}/user/usernameCheckJsonregister.action";
	     $.post(
			url,
			{userName:this.value},
			function(data) {
				$("#userNamewarn").html(data);
			}
		);
    });
	});
		
function repasswcheck(){
	var userPassword = document.getElementById("userPassword").value.trim();
	var reuserPassword = document.getElementById("reuserPassword").value.trim();
	if(userPassword != reuserPassword){
		document.getElementById("reuserPasswordwarn").innerText="密码不一致";
	}
	else{
		document.getElementById("reuserPasswordwarn").innerText = "";
	}
}
function passwcheck() {
	var passw = document.getElementById("userPassword").value.trim();
	if(passw.length < 6) {
		document.getElementById("userPasswordwarn").innerText = "密码长度小于6";
	}
	if(passw.length > 5) {
		document.getElementById("userPasswordwarn").innerText = null;
	}
}
function namewarnoff(){
	var name=document.getElementById("userName").value;
	if(name!=null||name!="")
	{
		document.getElementById("userNamewarn").innerText = "";
	}
}
function userEmailcheck(){
	var userEmail=document.getElementById("userEmail").value.trim();
	var szReg=/^(\w)+(\.\w+)*@(\w)+((\.\w{2,3}){1,3})$/; 
	if(!(szReg.test(userEmail))){
		document.getElementById("userEmailwarn").innerText = "请输入正确的邮箱";
	}
	else{
		document.getElementById("userEmailwarn").innerText = "";
	}
}
function userMobilephonecheck(){
	var userMobilephone=document.getElementById("userMobilephone").value.trim();
	if(!(/^1[34578]\d{9}$/.test(userMobilephone))){ 
		document.getElementById("userMobilephonewarn").innerText = "请输入正确的手机";
	}
	else{
		document.getElementById("userMobilephonewarn").innerText ="";
	}
	
}
function mycheck(){
				var userName = document.getElementById("userName").value.trim();
				var userPassword = document.getElementById("userPassword").value.trim();
				var reuserPassword = document.getElementById("reuserPassword").value.trim();
				var userMobilephone=document.getElementById("userMobilephone").value.trim();
				if(userName == null || userName == ""){
					document.getElementById("userNamewarn").innerText = "请输入用户名";
					document.getElementById("userName").focus();
					return false;
				} 
				if(userPassword == null || userPassword == ""){
					document.getElementById("userNamewarn").innerText = "";
					document.getElementById("userPasswordwarn").innerText = "请输入密码";
					document.getElementById("userPassword").focus();
					return false;
				}
				if(reuserPassword == null || reuserPassword == ""){
					document.getElementById("userPasswordwarn").innerText ="";
					document.getElementById("reuserPasswordwarn").innerText = "请确认密码";
					document.getElementById("reuserPassword").focus();
					return false;
				} 
			 if(document.getElementById("affirm").checked == false) {
					alert("是否同意相关服务条款");
					return false;
				}
				 
			}

</script>
</head>
<body>
	<div class="container-fluid" style="min-height:700px">
		<ol class="breadcrumb" style="background: white">
			<li><a href="${pageContext.request.contextPath }/item/home.action">首页</a></li>
			<li class="active">注册</li>
		</ol>
		<div class="container" style="margin: 30px 50px;">
			<div class="row">
				<div class="col-sm-7 ">
					<img src="../img/logo1.png" alt="公司logo" />&nbsp;&nbsp;&nbsp; <span
						id="logoW"><p>您身边的美食搬运工</p></span>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<!--<div class="container-fluid">-->
			<div class="row">
				<div class="col-sm-8">
					<div class="box-body">
						<div class="box-header">
							<span>用户注册</span>
						</div>
						<div class="embed-responsive-item">
							<form onsubmit="return mycheck()" action="${pageContext.request.contextPath }/user/userregister.action" id="sign-up" method="post" class="form-horizontal" >
								<div class="form-group">
									<label class="control-label col-sm-3" for="userName">用户名:</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" name="userName" id="userName" placeholder="请设置用户名，长度为2~10个字符，不包含特殊字符" onblur="namewarnoff()" />
									</div>
									<div class="col-sm-2" style="padding-left:0px;">
										<p class="warn" id="userNamewarn"></p>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-3" for="userPassword">设置密码:</label>
									<div class="col-sm-7">
										<input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="请设置密码，长度为6~20个字符，不包含特殊字符" onblur="passwcheck()" />
									</div>
									<div class="col-sm-2" style="padding-left:0px">
										<p class="warn" id="userPasswordwarn"></p>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-3" for="userPassword_again">确认密码:</label>
									<div class="col-sm-7">
										<input type="password" class="form-control"  name="reuserPassword" id="reuserPassword"  placeholder="确认密码" onblur="repasswcheck()"/>
									</div>
									<div class="col-sm-2" style="padding-left:0px">
										<p class="warn" id="reuserPasswordwarn"></p>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-3" for="userEmail">电子邮箱:</label>
									<div class="col-sm-7">
										<input type="email" class="form-control" name="userEmail" id="userEmail"  placeholder="请输入您的邮箱" onblur="userEmailcheck()"/>
									</div>
									<div class="col-sm-2" style="padding-left:0px">
										<p class="warn" id="userEmailwarn"></p>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label col-sm-3" for="userMobilephone">手机号码</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" name="userMobilephone" id="userMobilephone"  placeholder="请输入您使用的手机号，进行手机短信验证" onblur="userMobilephonecheck()"/>
									</div>
									<div class="col-sm-2" style="padding-left:0px">
										<p class="warn" id="userMobilephonewarn"></p>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-4 col-sm-offset-3">
										<input type="text" class="form-control" name="phoneValiate" placeholder="请输入短信验证码" readonly>
									</div>
									<div class="col-sm-3">
										<button type="button" class="btn btn-info disabled">点击验证</button>
									</div>
									<div class="col-sm-2">
										<p class="warn" id="userMobilephonewarn"></p>
									</div>
								</div>

								<div class="form-group">
									<label class="checkbox col-sm-offset-2">
	                                 <input type="checkbox" data-form="uniform" name="affirm" id="affirm" value="yes" checked="" /> 同意美食达<a href="" style="text-decoration: none;">服务条款</a>
	                                </label>
	                            </div>
                                <div class="form-group">
									<div class="form-actions" style="margin-top: 30px;padding-left: 20%;padding-right: 5%;width: 80%;">
										<input type="submit" class="btn btn-success pull-left" value="立&nbsp;&nbsp;即&nbsp;&nbsp;注&nbsp;&nbsp;册" />
										<input type="reset" class="btn btn-primary pull-right" value="重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;置" />
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>

				<div
					style="position: relative; float: left; width: 1px; left: 10px; height: 500px; background-color: #C0C0C0"></div>
				<div class="col-sm-2 col-sm-offset-1">
					<div class="have-login">
						<p align="center">已有账号? 请直接登录</p>
						<p align="center">
							<a href="${pageContext.request.contextPath }/user/login.action"><button class="btn btn-success">登录</button>
						</p>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<div class="footer" >
		<p class="footert">
			<a href="#">关于美食达</a> <a href="#">帮助中心</a> <a href="#">诚聘英才</a><a
			   href="#">联系我们</a> <a href="#">全国统一热线：4008637688</a> <br />&copy;
			Copyright by贵州美食达食品有限公司. ALL Rights Reserved.
		</p>
	</div>
    <script src="js/bootstrap.min.js"></script>   
</body>
</html>