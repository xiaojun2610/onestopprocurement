package com.huaxin.onestopprocurement.mapper;

import java.util.List;

import com.huaxin.onestopprocurement.po.User;
import com.huaxin.onestopprocurement.po.UserCustom;

public interface UserCustomMapper {
	
	//添加用户
   public int insertSelective(User user) throws Exception;
   
   //查询所有的用户名
   public List<String> queryAllUsernames() throws Exception;
   
   //根据用户名查询用户信息
   public UserCustom  queryUserByusername(User user) throws Exception;
   
   ////根据用户ID查询用户关联的购物车商品数量
   public int queryCartCountByuserId(User user) throws Exception;
   
   
}
