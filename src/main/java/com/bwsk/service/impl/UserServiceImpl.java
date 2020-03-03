package com.bwsk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwsk.entity.User;
import com.bwsk.mapper.UserMapper;
import com.bwsk.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public int insertOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		int row=0;
		if(user.getUid()>0) {//存在  修改
			row=userMapper.update(user);
		}else {//不存在 添加
			row=userMapper.insert(user);
		}
		return row;
	}
	

}
