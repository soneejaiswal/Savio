package com.vatsa.savio.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vatsa.savio.core.constants.PartyUriConstants;

@RestController
public class PartyController {

	private final Logger log = LoggerFactory.getLogger(PartyController.class);

	/*@Autowired
	private CustomerService customerService;*/

	/*@RequestMapping(value = CustomerUriConstants.REGISTER_CUSTOMER, method = RequestMethod.POST, headers = "content-type=application/json")*/

	@RequestMapping(value = PartyUriConstants.REGISTER_PARTY, method = RequestMethod.GET)
	public String saveParty(HttpServletRequest req, HttpServletResponse resp) {
		
		log.trace("test log");
		System.out.println("sysout test log");
		
		req.setAttribute("responseMsg", "Query string parameter 'app-id' not specified");
		
		
		return "response" ;
	}
}
