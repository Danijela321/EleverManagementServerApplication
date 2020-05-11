package com.yrgo.employeemanagemen;

import java.util.List;
/**
 * @author Danijela
 */

import javax.ejb.Remote;

import com.yrgo.domain.Elever;

@Remote
public interface EleverManagementService {
	
	public void registerElever(Elever elever);
	public List<Elever>getAllElever ();
	public List<Elever>searchBysurname(String surname);

}
