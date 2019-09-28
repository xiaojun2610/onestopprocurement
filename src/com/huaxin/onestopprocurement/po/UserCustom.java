package com.huaxin.onestopprocurement.po;

public class UserCustom extends User {
 private CartCustom cartCustom;

public CartCustom getCartCustom() {
	return cartCustom;
}

public void setCartCustom(CartCustom cartCustom) {
	this.cartCustom = cartCustom;
}
private int cartCount;

public int getCartCount() {
	return cartCount;
}

public void setCartCount(int cartCount) {
	this.cartCount = cartCount;
}

   
}
