package com.vatsa.savio.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vatsa.savio.core.bean.Party;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {

}
