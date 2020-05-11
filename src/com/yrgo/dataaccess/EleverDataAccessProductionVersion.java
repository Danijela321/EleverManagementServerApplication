package com.yrgo.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import com.yrgo.domain.Elever;

@Stateless
@Default

public class EleverDataAccessProductionVersion implements EleverDataAccess {

	@Override
	public void insert(Elever newElever) {
		

	}

	@Override
	public List<Elever> findAll() {
		Elever el1 = new Elever ("Anna","Borg","ITH",2);
		Elever  el2 = new Elever ("Adam","Borg","ITH",1);
		List<Elever> elever = new ArrayList<Elever>();
		elever.add(el1);
		elever.add(el2);
		return elever;
	}

	@Override
	public List<Elever> findBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

}
