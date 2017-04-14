package com.bridgeLabz.IPL.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.IPL.dao.UserDao;
import com.bridgeLabz.IPL.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public boolean register(User user) {
		
		return userDao.register(user);
	}


	@Override
	public User login(User user) {
		
		return userDao.login(user);
		
	}

}
