package com.vatsa.savio.service;

import com.vatsa.savio.domain.User;

public interface UserService {
	public User saveUser(User user);

	public User getUser(long id);

	public void deleteUser(User user);
}
