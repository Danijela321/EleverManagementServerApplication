package com.yrgo.elevermanagement;

import java.util.List;
import javax.ejb.Local;
import com.yrgo.domain.Elever;

/**
 * @author Danijela
 */

@Local
public interface EleverManagementServiceLocal {

		public void registerElever(Elever elever) throws  ServiceUnavailableException;
		public List<Elever> getAllElever();
		public List<Elever> searchBysurname(String surname);
		public Elever getById(int id);
	
}
