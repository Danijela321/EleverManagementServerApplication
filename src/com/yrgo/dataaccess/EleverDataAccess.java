package com.yrgo.dataaccess;

import java.util.List;

import javax.ejb.Local;

import com.yrgo.domain.Elever;

@Local
public interface EleverDataAccess {
	public  void insert(Elever newElever);

	public  List<Elever> findAll();

	public  List<Elever> findBySurname(String surname);

}
