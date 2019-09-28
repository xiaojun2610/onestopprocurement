package com.huaxin.onestopprocurement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huaxin.onestopprocurement.po.ItemCustom;
import com.huaxin.onestopprocurement.po.ItemQueryVo;
import com.huaxin.onestopprocurement.po.Itemclasses;
import com.huaxin.onestopprocurement.po.Pagination;
import com.huaxin.onestopprocurement.po.User;
import com.huaxin.onestopprocurement.po.UserCustom;
import com.huaxin.onestopprocurement.service.ItemService;
import com.huaxin.onestopprocurement.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController  {
	
	@Autowired
	private ItemService itemService;
	
    @Autowired
	private UserService userService;
    
    HttpSession session = null;
    /**
     * 用户注册请求
     */
   @RequestMapping(value="/userregister.action",method={RequestMethod.POST})
	public String register(UserCustom userCustom,HttpServletRequest request,HttpServletResponse reponse) throws Exception{
	   reponse.setContentType("text/html;charset=utf-8");
	   reponse.setCharacterEncoding("utf-8");
	   if(userService.register(userCustom)){
	    session = request.getSession();
 		session.setAttribute("userCustom", userCustom);
		return "redirect:userhome.action";
	   }
	   else{
		   return "user/register";
	   }
	}
   /**
    *  用户登录请求
    * @param userCustom
    * @return
    * @throws Exception
    */
   @RequestMapping(value="/userlogin.action",method={RequestMethod.POST} )
  	public ModelAndView login(UserCustom userCustom,HttpServletRequest request,HttpServletResponse response) throws Exception{
  	  UserCustom backuserCustom=userService.login(userCustom);
  	  ModelAndView modelAndView = new ModelAndView();
  	  if(backuserCustom!=null){
  		session = request.getSession();
  		session.setAttribute("userCustom", backuserCustom);
  		modelAndView.setViewName("redirect:/item/home.action");
  	  }else{
  		String msg = "fail";
  		modelAndView.addObject("msg", msg);
  		modelAndView.setViewName("user/login");
  	  }
  	  return modelAndView;
  	}
   
   @RequestMapping(value="/userhome.action")
    public String  gotoUserHome() {
	   return "user/userhome";
	}
   @RequestMapping(value="/user_exit.action")
   public String  userExit() {
	   session.setAttribute("userCustom", null);
	   return "redirect:login.action";
	}
   
   @RequestMapping(value="/login.action")
   public String  userLogin() {
	   return "user/login";
	}
   
   @RequestMapping(value="/register.action")
   public String  userRegister() {
	   return "user/register";
	}
   
   @RequestMapping("/usernameCheckJsonregister.action")
   public void usernameCheck(HttpServletRequest request,HttpServletResponse response) throws Exception{
	   String msg=null;
	   String name=request.getParameter("userName");
	   boolean flag = userService.usernameCheck(name); 
	   response.setContentType(" text/html;charset=UTF-8");
	   if(flag){
		   response.getWriter().write("<font color='red'>此用户名已存在</font>");
		}
	   else{
		   response.getWriter().write("<font color='green'>此用户名可用</font>");
	   }
       }
   }
