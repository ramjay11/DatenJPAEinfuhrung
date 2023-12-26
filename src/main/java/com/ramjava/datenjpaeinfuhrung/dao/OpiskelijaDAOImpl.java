package com.ramjava.datenjpaeinfuhrung.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramjava.datenjpaeinfuhrung.entity.Opiskelija;

import jakarta.persistence.EntityManager;

public class OpiskelijaDAOImpl implements OpiskelijaDAO {

	@Autowired
	EntityManager em;
	
	@Override
	public void pelastaaOpiskelija(Opiskelija opiskelija) {
		em.persist(opiskelija);
		System.out.println("tietue lisätty...");
	}


}
