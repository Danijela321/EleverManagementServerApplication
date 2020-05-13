package com.yrgo.elevermanagement;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import com.yrgo.domain.Elever;

@Stateless
@WebService(name="EleverManagementWebService")
public class EleverManagementWebserviceImplementation {
	/**
	 * @author Danijela
	 * @param id
	 * @return
	 */
	
	//@Inject
	//private EleverManagementService service;
	
	@Inject
	private EleverManagementServiceLocal service;
	
	public Elever getEleverById(int id) {
		return null;
	}
	
	public List<Elever> getAllElever() {
		return service.getAllElever();
	}
	
}