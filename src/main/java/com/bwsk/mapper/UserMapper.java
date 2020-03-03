package com.bwsk.mapper;

import org.springframework.stereotype.Repository;

import com.bwsk.entity.User;


@Repository
public interface UserMapper {

	//添加用户信息
	public int insert(User user);
	
	//修改用户信息
	public int update(User user);
	
}
