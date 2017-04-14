package com.bridgeLabz.IPL.dao;

import com.bridgeLabz.IPL.model.User;

public interface UserDao {

	public boolean register(User user);

	public User login(User user);

}
