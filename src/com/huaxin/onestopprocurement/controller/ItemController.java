
package com.huaxin.onestopprocurement.controller;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.huaxin.onestopprocurement.po.CartCustom;
import com.huaxin.onestopprocurement.po.Item;
import com.huaxin.onestopprocurement.po.ItemCustom;
import com.huaxin.onestopprocurement.po.ItemQueryVo;
import com.huaxin.onestopprocurement.po.Itemclasses;
import com.huaxin.onestopprocurement.po.Pagination;
import com.huaxin.onestopprocurement.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/home.action")
	public ModelAndView gotohome(HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		if(session.getAttribute("cartCustom")==null){
			CartCustom cartCustom  = new CartCustom();
			cartCustom.setCartCount(0);
			session.setAttribute("cartCustom", cartCustom);
		}
		ItemQueryVo itemQueryVo = new ItemQueryVo();
		 ItemCustom itemCustom = new ItemCustom();
		if (itemQueryVo.getItemCustom() == null) {  
			itemQueryVo.setItemCustom(itemCustom);  
        }
		List<Itemclasses> itemclasses = itemService.queryItemclasses();
	    int itemsCount  = itemService.queryItemCount(itemQueryVo);
	    Pagination page= new Pagination(itemsCount,1);
	    if (itemQueryVo.getPage() == null) {  
	    	itemQueryVo.setPage(page);  
	    }
	    List<ItemCustom> itemList = itemService.queryAllItems(itemQueryVo);
	    itemCustom.setItemCustomlist(itemList);
	    itemCustom.setPagination(page);
		modelAndView.addObject("itemclasses", itemclasses);
		modelAndView.addObject("itemCustom", itemCustom);
		modelAndView.setViewName("item/index");
		return modelAndView;
		
	}
	 @RequestMapping("/itemquerybycriteria.action")
	 public ModelAndView queryItemsByCrteria(ItemCustom itemCustom) throws Exception{
		 ModelAndView modelAndView = new ModelAndView();
		 ItemQueryVo itemQueryVo = new ItemQueryVo();
		 itemQueryVo.setItemCustom(itemCustom);
			if(itemCustom.getItemClass()!=null){
				itemCustom.setClassName(itemCustom.getItemClass());
			}
			int itemsCount  = itemService.queryItemCount(itemQueryVo);
			 Pagination page= new Pagination(itemsCount,1);
			    if (itemQueryVo.getPage() == null) {  
			    	itemQueryVo.setPage(page);  
			    }
			if (itemQueryVo.getItemCustom() == null) {  
				itemQueryVo.setItemCustom(itemCustom);  
	        }
			List<ItemCustom> itemList = itemService.queryItemsByCriteria(itemQueryVo);
			List<Itemclasses> itemclasses = itemService.queryItemclasses();
			itemCustom.setItemCustomlist(itemList);
			itemCustom.setPagination(page);
			modelAndView.addObject("itemclasses", itemclasses);
			modelAndView.addObject("itemCustom", itemCustom);
			modelAndView.setViewName("item/itemquery");
		return modelAndView;
	 }
	
	@RequestMapping("/scopeItem.action")
	public ModelAndView scopeItem(int itemId) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		ItemQueryVo itemQueryVo = new ItemQueryVo();
		ItemCustom qitemCustom = new ItemCustom();
		 itemQueryVo.setItemCustom(qitemCustom);
		 qitemCustom.setItemStatus(2);
			if(qitemCustom.getItemClass()!=null){
				qitemCustom.setClassName(qitemCustom.getItemClass());
			}
			if (itemQueryVo.getItemCustom() == null) {  
				itemQueryVo.setItemCustom(qitemCustom);  
			}
			int itemsCount  = itemService.queryItemCount(itemQueryVo);
			 Pagination page= new Pagination(itemsCount,1);
			    if (itemQueryVo.getPage() == null) {  
			    	itemQueryVo.setPage(page);  
			    }
			ItemCustom itemCustom = itemService.queryItemById(itemId);
			List<ItemCustom> itemList = itemService.queryItemsByCriteria(itemQueryVo);
			itemCustom.setItemCustomlist(itemList);
			List<Itemclasses> itemclasses = itemService.queryItemclasses();
			modelAndView.addObject("itemclasses", itemclasses);
			modelAndView.addObject("itemCustom", itemCustom);
			modelAndView.setViewName("item/itemsale");
			return modelAndView;
	}	

	@RequestMapping("/itemsearch.action")
	public ModelAndView itemsearch(ItemCustom itemCustom) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		ItemQueryVo itemQueryVo = new ItemQueryVo();
		 itemQueryVo.setItemCustom(itemCustom);
			if(itemCustom.getItemClass()!=null){
				itemCustom.setClassName(itemCustom.getItemClass());
			}
			int itemsCount  = itemService.queryItemCount(itemQueryVo);
			 Pagination page= new Pagination(itemsCount,1);
			    if (itemQueryVo.getPage() == null) {  
			    	itemQueryVo.setPage(page);  
			    }
			if (itemQueryVo.getItemCustom() == null) {  
				itemQueryVo.setItemCustom(itemCustom);  
	        }
			List<ItemCustom> itemList = itemService.queryItemsByCriteria(itemQueryVo);
			List<Itemclasses> itemclasses = itemService.queryItemclasses();
			itemCustom.setItemCustomlist(itemList);
			itemCustom.setPagination(page);
			modelAndView.addObject("itemclasses", itemclasses);
			modelAndView.addObject("itemCustom", itemCustom);
			modelAndView.setViewName("item/itemsearch");
		return modelAndView;
		
	}
	
		
}
