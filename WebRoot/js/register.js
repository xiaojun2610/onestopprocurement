
function mycheck(){
				var username = document.getElementById("username").value.trim();
				var password = document.getElementById("password").value.trim();
				var repassword = document.getElementById("repassword").value.trim();
				var email=document.getElementById("email").value.trim();
				var cellphone=document.getElementById("cellphone").value.trim();
				if(username == null || username == ""){
					document.getElementById("usernamewarn").innerText = "请输入用户名";
					document.getElementById("username").focus();
					return false;
				} 
				if(password == null || password == ""){
					document.getElementById("usernamewarn").innerText = "";
					document.getElementById("passwordwarn").innerText = "请输入密码";
					document.getElementById("password").focus();
					return false;
				}
				if(repassword == null || repassword == ""){
					document.getElementById("passwordwarn").innerText ="";
					document.getElementById("repasswordwarn").innerText = "请确认密码";
					document.getElementById("repassword").focus();
					return false;
				} 
				if(password!=repassword){
					alert("两次输入的密码不一致，请重新输入");
					document.getElementById("passwordwarn").value="";
					document.getElementById("repasswordwarn").value="";
					document.getElementById("password").focus();
					return false;
				}
				if(document.getElementById("affirm").checked == false) {
					alert("是否同意相关服务条款");
					return false;
				}
				else { 
						alert("注册成功，欢迎"+this.username); 
						return true;
				}   
			}
