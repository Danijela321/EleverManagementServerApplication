package com.yrgo.elevermanagement;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.yrgo.dataaccess.EleverDataAccess;
import com.yrgo.domain.Elever;

/**
 * @author Danijela
 */

@Stateless
public class EleverManagementImplementation implements EleverManagementService, EleverManagementServiceLocal {

	@Inject
	private EleverDataAccess dao;
	
	
	/**
	 * @author Danijela
	 */
	@Override
	public void registerElever(Elever elever) throws ServiceUnavailableException {
		dao.insert(elever);
	}

	/**
	 * @author Danijela
	 */
	@Override
	public List<Elever> getAllElever() {
		return dao.findAll();
		/*
		 * Elever el1 = new Elever("Jan","Jansson","Yrgo",1); 
		 * Elever el2 = new Elever("Sara","Blomqvist","ITH",2); 
		 * List<Elever> elever = new ArrayList<Elever>(); elever.add(el1); elever.add(el2); return elever;
		 */
	}
	/**
	 * @author Danijela
	 */
	@Override
	public List<Elever> searchBysurname(String surname) {
		return dao.findBySurname(surname);
	}
	
	/**
	 * @author Danijela
	 */
	//@Override
	public Elever getById(int id) {
		return dao.findById(id);
	}

}
