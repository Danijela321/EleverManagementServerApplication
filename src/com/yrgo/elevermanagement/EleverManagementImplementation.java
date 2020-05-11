package com.yrgo.elevermanagement;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;

import com.yrgo.domain.Elever;

/**
 * @author Danijela
 */

@Stateless
public class EleverManagementImplementation implements EleverManagementService {

	@Override
	public void registerElever(Elever elever) {
		

	}

	/**
	 * @author Danijela
	 */
	@Override
	public List<Elever> getAllElever() {
		
		Elever el1 = new Elever("Jan","Jansson","Yrgo",1);
		Elever el2 = new Elever("Sara","Blomqvist","ITH",2);
		List<Elever> elever = new ArrayList<Elever>();
		elever.add(el1);
		elever.add(el2);
		return elever;
		
	}
	
	/**
	 * @author Danijela
	 */
	@Override
	public List<Elever> searchBysurname(String surname) {
		
		return null;
	}

}
