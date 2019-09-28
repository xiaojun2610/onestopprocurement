package com.huaxin.onestopprocurement.po;

import java.util.List;


public class ItemCustom extends Item {
	
   private Itemclasses itemClasses;
    
   private  Pagination pagination;
   private Double minPrice;
   private Double maxPrice;
   private	List<ItemCustom> itemCustomlist;
   private String className;
   private int pageNo;
   
   
	public int getPageNo() {
	return pageNo;
}

public void setPageNo(int pageNo) {
	this.pageNo = pageNo;
}

	public String getClassName() {
	return className;
}
 
public void setClassName(int classId) {
	switch(classId){
	case 1:
		this.className = "调理制品";
		break;
	case 2:
		this.className = "原味菜品";
		break;
	case 3:
		this.className = "冷冻禽肉类";
		break;
	case 4:
		this.className = "冷冻肉类";
		break;
	case 5:
		this.className = "冷冻蔬果";
		break;
	case 6:
		this.className = "冷冻河海鲜";
		break;
	case 7:
		this.className = "荞嫂子杂粮系列";
		break;
	case 8:
		this.className = "特色腊味";
		break;
	case 9:
		this.className = "开袋即食凉菜";
		break;
	case 10:
		this.className = "调料干货";
		break;
	case 11:
		this.className = "如意三煲";
		break;
	case 12:
		this.className = "半汤菜";
		break;
	case 13:
		this.className = "主食点心";
		break;
	}
	
}

	public Pagination getPagination() {
	return pagination;
}

public void setPagination(Pagination pagination) {
	this.pagination = pagination;
}



	public List<ItemCustom> getItemCustomlist() {
	return itemCustomlist;
}

public void setItemCustomlist(List<ItemCustom> itemCustomlist) {
	this.itemCustomlist = itemCustomlist;
}

	public Double getMinPrice() {
	return minPrice;
	}
	
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	
	public Double getMaxPrice() {
		return maxPrice;
	}
	
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Itemclasses getItemClasses() {
		return itemClasses;
	}
	
	public void setItemClasses(Itemclasses itemClasses) {
		this.itemClasses = itemClasses;
	}
	   
}
