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
public class EleverManagementImplementation implements EleverManagementService {

	@Inject
	private EleverDataAccess dao;

	@Override
	public void registerElever(Elever elever) {
		dao.insert(elever);

	}

	@Override
	public List<Elever> getAllElever() {
		return dao.findAll();

		/*
		 * Elever el1 = new Elever("Jan","Jansson","Yrgo",1); 
		 * Elever el2 = new Elever("Sara","Blomqvist","ITH",2); 
		 * List<Elever> elever = new ArrayList<Elever>(); elever.add(el1); elever.add(el2); return elever;
		 */

	}

	@Override
	public List<Elever> searchBysurname(String surname) {

		return dao.findBySurname(surname);
	}

}
