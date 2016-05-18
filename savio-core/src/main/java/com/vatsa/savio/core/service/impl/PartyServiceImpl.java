package com.vatsa.savio.core.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vatsa.savio.core.bean.Party;
import com.vatsa.savio.core.repository.PartyRepository;
import com.vatsa.savio.core.service.PartyService;

@Service()
@Transactional
public class PartyServiceImpl implements PartyService {

	@Autowired
//	@Qualifier("SimpleJpaRepository")
	private PartyRepository partyRepository;

	@Override
	public Party saveParty(Party party) {
		return (Party) partyRepository.save(party);
	}
}
