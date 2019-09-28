package com.huaxin.onestopprocurement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.huaxin.onestopprocurement.mapper.CartCustomMapper;
import com.huaxin.onestopprocurement.mapper.UserCustomMapper;
import com.huaxin.onestopprocurement.po.CartCustom;
import com.huaxin.onestopprocurement.po.User;
import com.huaxin.onestopprocurement.po.UserCustom;
import com.huaxin.onestopprocurement.service.UserService;

public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserCustomMapper userCustomMapper;
	
	
	@Override
	public UserCustom login(User user) throws Exception {
		boolean flag = false;
		UserCustom userCustom = null;
		String[] usernames=userCustomMapper.queryAllUsernames().toArray(new String[]{});
		for(int i=0;i<usernames.length;i++){
			if(usernames[i].equals(user.getUserName())){
				flag=true;
			}
		}
		if(flag){
			userCustom = userCustomMapper.queryUserByusername(user);
			if(userCustom.getUserPassword().equals(user.getUserPassword())){
				System.out.println("登录成功！");
				int cartCount = userCustomMapper.queryCartCountByuserId(userCustom);
				userCustom.setCartCount(cartCount);
				return userCustom;
			}
			System.out.println("密码不正确");
			return null;
		}
		else{
			System.out.println("用户名不存在");
			return null;
		}
	}

	@Override
	public boolean register(UserCustom userCustom) throws Exception {
		boolean flag = false;
		String[] usernames=userCustomMapper.queryAllUsernames().toArray(new String[]{});
		for(int i=0;i<usernames.length;i++){
			if(usernames[i].equals(userCustom.getUserName())){
				return false;
			}
		}
		int f = userCustomMapper.insertSelective(userCustom);
		if(f>0){
			flag=true;
		}
		
		return flag;
	}

	@Override
	public boolean userUpdate(UserCustom userCustom) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean usernameCheck(String username) throws Exception {
		boolean flag = false;
		String[] usernames=userCustomMapper.queryAllUsernames().toArray(new String[]{});
		for(int i=0;i<usernames.length;i++){
			if(usernames[i].equals(username)){
				flag=true;
			}
		}
		return flag;
	}

}
