package com.yrgo.elevermanagement;

import java.util.List;


import javax.ejb.Remote;

import com.yrgo.domain.Elever;

/**
 * 
 * @author Danijela
 *
 */
@Remote
public interface EleverManagementService {
	
	public void registerElever(Elever elever);
	public List<Elever>getAllElever ();
	public List<Elever>searchBysurname(String surname);

}
