package com.vatsa.savio.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vatsa.savio.DemoRestWsApplication;
import com.vatsa.savio.domain.User;
import com.vatsa.savio.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoRestWsApplication.class)
public class UserServiceImplTest {
	@Autowired
	private UserService userServiceImpl;

	private User user;

	@Before
	public void setUser() {
		user = new User();
		user.setFirstname("firstname");
		user.setLastname("lastname");
		user.setDob(new Date());
		user.setEmail("firstname@xyz.com");
		user.setHousenumber("123");
		user.setPassword("password");
		user.setPostcode("123456");
	}

	@Test
	public void testSaveUserNotNull() {
		assertNotNull(userServiceImpl.saveUser(user));
	}

	@Test
	public void testSaveUser() {
		assertTrue(user.equals(userServiceImpl.saveUser(user)));
	}

	@After
	public void deleteUser() {
		userServiceImpl.deleteUser(user);

	}
}
