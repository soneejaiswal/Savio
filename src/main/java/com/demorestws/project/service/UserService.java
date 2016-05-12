package com.demorestws.project.service;

import com.demorestws.project.domain.User;

public interface UserService {
	public User saveUser(User user);
	public User getUser(long id);
}
