package com.yrgo.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.yrgo.domain.Elever;

/**
 * @author danijela
 */
@Stateless
@Default
public class EleverDataAccessProductionVersion implements EleverDataAccess {

	@PersistenceContext
	private EntityManager em;

	/**
	 * @author danijela
	 */
	@Override
	public void insert(Elever newElever) {
		em.persist(newElever);

	}

	/**
	 * @author danijela
	 */
	@Override
	public List<Elever> findAll() {
		Query q = em.createQuery("select elever from Elever elever");
		List<Elever> elever = q.getResultList();
		return elever;
	}

	/**
	 * @author danijela
	 */
	@Override
	public List<Elever> findBySurname(String surname) {
		Query q = em.createQuery("select elever from Elever elever where elever.surname = :surname");
		q.setParameter("surname", surname);
		return q.getResultList();
	}

	/**
	 * @author danijela
	 */
	@Override
	public Elever findById(int id) throws EleverNotFoundException {
		Query q = em.createQuery("select elever from Elever elever where elever.id = :id");
		q.setParameter("id", id);
		try {
			return (Elever) q.getSingleResult();
		} catch (NoResultException e) {
			throw new EleverNotFoundException();
		}
	}

}
