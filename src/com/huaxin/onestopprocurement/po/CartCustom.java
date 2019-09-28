package com.huaxin.onestopprocurement.po;

import java.util.List;

public class CartCustom extends Cart {
 private Integer cartCount;
 private List<CartCustom> cartCustomlist;
 
private String itemImg;
private String itemName;
private Double itemPrice;



public String getItemImg() {
	return itemImg;
}

public void setItemImg(String itemImg) {
	this.itemImg = itemImg;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public Double getItemPrice() {
	return itemPrice;
}

public void setItemPrice(Double itemPrice) {
	this.itemPrice = itemPrice;
}



public List<CartCustom> getCartCustomlist() {
	return cartCustomlist;
}

public void setCartCustomlist(List<CartCustom> cartCustomlist) {
	this.cartCustomlist = cartCustomlist;
}

public Integer getCartCount() {
	return cartCount;
}

public void setCartCount(Integer cartCount) {
	this.cartCount = cartCount;
}


  
}
