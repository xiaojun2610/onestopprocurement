package com.huaxin.onestopprocurement.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.huaxin.onestopprocurement.po.Cart;
import com.huaxin.onestopprocurement.po.CartCustom;
import com.huaxin.onestopprocurement.po.ItemCustom;
import com.huaxin.onestopprocurement.po.UserCustom;
import com.huaxin.onestopprocurement.service.ItemService;


@Controller
@RequestMapping("/order")
public class OrderController {
	

@Autowired
private ItemService itemService;
	
   @RequestMapping("/orderbegin.action")
	public ModelAndView orderbegin(){
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
   @RequestMapping("/cart.action")
  	public ModelAndView gotocart(HttpServletRequest request) throws Exception{
  		ModelAndView modelAndView = new ModelAndView();
  		HttpSession session = request.getSession();
		if(session.getAttribute("cartCustom")==null){
			CartCustom cartCustom  = new CartCustom();
			cartCustom.setCartCount(0);
			session.setAttribute("cartCustom", cartCustom);
		}
  		CartCustom cartCustom =(CartCustom) session.getAttribute("cartCustom");
  		List<CartCustom> cartlist = cartCustom.getCartCustomlist();
  		if(cartlist!=null){
 		   for(CartCustom cartCustomin:cartlist){
 			int index = cartlist.indexOf(cartCustomin);
 			ItemCustom  itemCustom = itemService.queryItemById(cartCustomin.getItemId());
 			if(itemCustom.getItemImg1()!=null){
 				cartCustomin.setItemImg(itemCustom.getItemImg1());
 			}
 			if(itemCustom.getItemDiscount()!=null){
 				cartCustomin.setItemPrice(itemCustom.getItemPrice()*itemCustom.getItemDiscount());
 			}
 			if(itemCustom.getItemName()!=null){
 				cartCustomin.setItemName(itemCustom.getItemName());
 			}
 			cartlist.set(index,cartCustomin);
 		   }
 		}
  		cartCustom.setCartCustomlist(cartlist);
  		modelAndView.addObject("cartCustom", cartCustom);
  		modelAndView.setViewName("order/cart");
  		return modelAndView;
  	}
   @RequestMapping("/addcart.action")
   public  @ResponseBody CartCustom  addCartAjax(CartCustom cart,HttpServletRequest request) throws Exception{
	   HttpSession session = request.getSession();
	   UserCustom userCustom = (UserCustom) session.getAttribute("userCustom");
	   CartCustom cartCustom =(CartCustom) session.getAttribute("cartCustom");
	   List<CartCustom> cartlist = cartCustom.getCartCustomlist();
	   int precartCount =  cartCustom.getCartCount();
	   int  cartCount = precartCount;
	   boolean flag = false;
	   if(cartlist!=null){
		   for(CartCustom cartin:cartlist){
			   if(cartin.getItemId()==cart.getItemId()){
				   int index = cartlist.indexOf(cartin);
				   flag = true;
				   cartin.setItemNumble(cartin.getItemNumble()+cart.getItemNumble());
				   cartlist.set(index,cartin);
				   break;
			   }
		   }
		   if(!flag){
			   cartCount=precartCount+1;
			   cartCustom.setCartCount(cartCount);
			   cartlist.add(cart);
		   }
	   }else{
		   cartlist = new ArrayList<CartCustom>();
		   cartCount = 1;
		   cartlist.add(cart);
	   }
	   cartCustom.setCartCustomlist(cartlist);
	   cartCustom.setCartCount(cartCount);
	   session.setAttribute("cartCustom", cartCustom);
	   return cartCustom;
	   
   }
}
