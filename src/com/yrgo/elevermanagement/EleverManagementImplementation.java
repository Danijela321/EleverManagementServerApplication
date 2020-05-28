package com.yrgo.elevermanagement;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.yrgo.dataaccess.EleverDataAccess;
import com.yrgo.dataaccess.EleverNotFoundException;
import com.yrgo.domain.Elever;



/**
 * @author danijela
 */

@Stateless
public class EleverManagementImplementation implements EleverManagementService, EleverManagementServiceLocal {

	@Inject
	private EleverDataAccess dao;
	
	/**
	 * @author danijela
	 */
	
	@Override
	public void registerElever(Elever elever) throws ServiceUnavailableException {
		dao.insert(elever);
	}

	/**
	 * @author danijela
	 */
	@Override
	public List<Elever> getAllElever() {
		return dao.findAll();
	
	}
	
	/**
	 * @author danijela
	 */
	@Override
	public List<Elever> searchBysurname(String surname) {
		return dao.findBySurname(surname);
	}
	
	/**
	 * @author danijela
	 * @throws EleverNotFoundException kastar exception om elev inte finns
	 */
	@Override
	public Elever getById(int id) throws EleverNotFoundException {
		return dao.findById(id);
	}

	/**
	 * @author danijela
	 */

	
	
	/**
	 * @author danijela
	 */
	@Override
	public void deleteElever(int id) throws EleverNotFoundException {
		dao.deleteElever(id);
			
	}



	@Override
	public void updateElever(int id, String surname, int klass) throws EleverNotFoundException {
		dao.updateElever(id, surname, klass);
		
	}
}
