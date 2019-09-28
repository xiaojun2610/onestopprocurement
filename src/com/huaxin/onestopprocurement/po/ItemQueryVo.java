package com.huaxin.onestopprocurement.po;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ItemQueryVo{
	 
	   private  ItemCustom itemCustom ;
	   private  Item item ;
	   private Pagination page;
	   
	   private List<ItemCustom> itemCustoms;
	    
	    
	   
    	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
    	
	   	public Pagination getPage() {
		return page;
		}
		public void setPage(Pagination page) {
			this.page = page;
		}
		public ItemCustom getItemCustom() {
		return itemCustom;
		}
		public void setItemCustom(ItemCustom itemCustom) {
			this.itemCustom = itemCustom;
		}
		public List<ItemCustom> getItemCustoms() {
			return itemCustoms;
		}
		public void setItemCustoms(List<ItemCustom> itemCustoms) {
			this.itemCustoms = itemCustoms;
		}
		
	  
}
