package com.vatsa.savio.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vatsa.savio.core.constants.PartyUriConstants;

@RestController
public class PartyController {

	private final Logger log = LoggerFactory.getLogger(PartyController.class);

	/*@Autowired
	private CustomerService customerService;*/


	@RequestMapping(value = PartyUriConstants.REGISTER_PARTY, method = RequestMethod.GET)
	public @ResponseBody String saveParty(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		log.trace("test log");
		System.out.println("sysout test log");
		
		return "response body test string" ;
	}
}
