package com.it.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.UserMapper;
import com.it.pojo.User;

@Service
public class UserService{
	
	@Autowired
    UserMapper userMapper;

	public User queryById(long l) {
		List<User> selectByPrimaryKey = userMapper.selectAll();
		User selectByPrimaryKey2 = userMapper.selectByPrimaryKey(l);
		return selectByPrimaryKey2;
	}

}
