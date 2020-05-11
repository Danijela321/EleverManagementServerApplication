package com.yrgo.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.yrgo.domain.Elever;


@Stateless
public class EleverDataAccessImplementatio implements EleverDataAccess {

	@Override
	public void insert(Elever newElever) {
		
	}

	@Override
	public List<Elever> findAll() {
		
		Elever el1 = new Elever("Jan","Jansson","Yrgo",1);
		Elever el2 = new Elever("Sara","Blomqvist","ITH",2);
		List<Elever> elever = new ArrayList<Elever>();
		elever.add(el1);
		elever.add(el2);
		return elever;
	}

	@Override
	public List<Elever> findBySurname(String surname) {
		
		return null;
	}

}
