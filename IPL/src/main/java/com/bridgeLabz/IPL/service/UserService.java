package com.bridgeLabz.IPL.service;

import com.bridgeLabz.IPL.model.User;

public interface UserService {

	public boolean register(User user);

	public User login(User user);

}
