package com.huaxin.onestopprocurement.mapper;

import com.huaxin.onestopprocurement.po.CartCustom;
import com.huaxin.onestopprocurement.po.UserCustom;

public interface CartCustomMapper {
	
	 public CartCustom queryCartByUserId(UserCustom userCustom) throws Exception;
	 
}
