package com.vatsa.savio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vatsa.savio.core.bean.Customer;
import com.vatsa.savio.core.constants.CustomerUriConstants;
import com.vatsa.savio.core.service.CustomerService;

@RestController
public class CustomerController {

	private final Logger log = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = CustomerUriConstants.REGISTER_CUSTOMER, method = RequestMethod.POST)
	public Customer saveUser(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
}
