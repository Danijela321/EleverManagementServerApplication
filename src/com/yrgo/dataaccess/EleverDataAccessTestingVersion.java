package com.yrgo.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.yrgo.domain.Elever;

/**
 * @author danijela
 */
@Stateless
@Alternative
public class EleverDataAccessTestingVersion implements EleverDataAccess {

	/**
	 * @author danijela
	 */
	@Override
	public void insert(Elever newElever) {
	}

//
	/**
	 * @author danijela
	 */
	@Override
	public List<Elever> findAll() {

		Elever el1 = new Elever("Jan", "Jansson", "Yrgo", 1);
		Elever el2 = new Elever("Sara", "Blomqvist", "ITH", 2);
		Elever el3 = new Elever("Adam", "Andersson", "Teknikhogskolan", 1);
		Elever el4 = new Elever("Maria", "Marisson", "Yrgo", 2);
		List<Elever> elever = new ArrayList<Elever>();
		elever.add(el1);
		elever.add(el2);
		elever.add(el3);
		elever.add(el4);
		return elever;
	}

	/**
	 * @author danijela
	 */
	@Override
	public List<Elever> findBySurname(String surname) {

		return null;
	}

	/**
	 * @author danijela
	 */
	@Override
	public Elever findById(int id) throws EleverNotFoundException {
		return null;

	}
}
