package com.yrgo.employeemanagemen;

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
		
		Elever el1 = new Elever("James","Green","Writer",3700);
		Elever el2 = new Elever("Sara","Bild","Editor",2200);
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
