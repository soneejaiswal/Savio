package com.vatsa.savio.core.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vatsa.savio.core.bean.Party;
import com.vatsa.savio.core.repository.PartyRepository;
import com.vatsa.savio.core.service.PartyService;

@Service
@Transactional
public class PartyServiceImpl implements PartyService {

	@Autowired
	private PartyRepository partyRepository;
	
	@Override
	public Party saveParty(Party party) {
		System.out.println("inside party service");
		System.out.println(party.getDateOfBirth());
		/*return (Party) partyRepository.save(party);*/
		return null;
	}
}
//@Qualifier("SimpleJpaRepository")