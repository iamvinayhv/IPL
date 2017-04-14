package com.bridgeLabz.IPL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeLabz.IPL.model.User;
import com.bridgeLabz.IPL.service.UserService;

@Controller
public class UserCountroller {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="register")
	public ModelAndView register(User user){
		
		boolean result = userService.register(user);
		if(result) {
			return new ModelAndView("regCompleted");
		}
		else {
			return new ModelAndView("regFailed");
		}
		
	}
	
	
	@RequestMapping(value="login")
	public ModelAndView login(User user) {
		
		User user2 = userService.login(user);
		
		if(user2 != null) {
			ModelAndView modelAndView = new ModelAndView("loginCompleted");
			modelAndView.addObject("user", user2);
			return modelAndView;
		}
		else {
			return  new ModelAndView("invalid");
		}
	}
	
}
