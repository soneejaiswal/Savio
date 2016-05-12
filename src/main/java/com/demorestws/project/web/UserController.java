package com.demorestws.project.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demorestws.project.constant.UserUriConstants;
import com.demorestws.project.domain.User;
import com.demorestws.project.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = UserUriConstants.REGISTER_USER, method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		System.out.println(user.getFirstname());
		return userService.saveUser(user);
	}

	@RequestMapping(value = UserUriConstants.GET_USER, method = RequestMethod.GET)
	public User getUser(@PathVariable("id") long id) {
		User user = userService.getUser(id);
		System.out.println("in get user :" + user.getFirstname());
		System.out.println("date"+user.getDob());
		return user;
	}

}
