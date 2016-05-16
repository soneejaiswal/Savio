package com.vatsa.savio.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vatsa.savio.domain.User;
import com.vatsa.savio.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public User getUser(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}

}
