package com.vatsa.savio.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vatsa.savio.core.bean.Party;
import com.vatsa.savio.core.constants.PartyUriConstants;
import com.vatsa.savio.core.service.PartyService;

@RestController
public class PartyController {

	private final Logger log = LoggerFactory.getLogger(PartyController.class);

	@Autowired
	private PartyService partyService ;


	@RequestMapping(value = PartyUriConstants.REGISTER_PARTY, method = RequestMethod.POST)
	public @ResponseBody Party saveParty(@RequestBody Party party) throws IOException {

		log.trace("test log");
		System.out.println("sysout test log");

		//		return "response body test string" ;

		return partyService.saveParty(party);
	}
}
