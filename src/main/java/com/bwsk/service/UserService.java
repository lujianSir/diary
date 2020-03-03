package com.bwsk.service;

import com.bwsk.entity.User;

public interface UserService {
	
	//添加用户信息
	public int insertOrUpdateUser(User user);
}
