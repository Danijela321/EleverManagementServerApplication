package com.yrgo.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import com.yrgo.domain.Elever;


/**
 * 
 * @author Danijela
 *
 */
@Stateless
@Alternative
public class EleverDataAccessTestingVersion implements EleverDataAccess {

	@Override
	public void insert(Elever newElever) {
		
	}

	/**
	 * 
	 * @author Danijela
	 *
	 */
	@Override
	public List<Elever> findAll() {
		
		Elever el1 = new Elever("Jan","Jansson","Yrgo",1);
		Elever el2 = new Elever("Sara","Blomqvist","ITH",2);
		Elever el3= new Elever("Adam","Andersson","Teknikhogskolan",1);
		Elever el4=new Elever("Maria", "Marisson","Yrgo",2);
		List<Elever> elever = new ArrayList<Elever>();
		elever.add(el1);
		elever.add(el2);
		elever.add(el3);
		elever.add(el4);
		return elever;
	}

	@Override
	public List<Elever> findBySurname(String surname) {
		
		return null;
	}

}
