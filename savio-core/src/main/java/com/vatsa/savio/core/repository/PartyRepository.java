package com.vatsa.savio.core.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.vatsa.savio.core.bean.Party;

//@Repository()
//public interface PartyRepository extends JpaRepository<Party,Long> {

public class PartyRepository extends SimpleJpaRepository<Party, Long> {
	
	private static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("org.eclipse.persistence.jpa.PersistenceProvider");

	private static EntityManager entitymanager = emfactory.createEntityManager();
	
	private static Party party = new Party() ;
	private static Class clazz = party.getClass() ;

	public PartyRepository() {
		super(clazz, entitymanager);
	}
}
