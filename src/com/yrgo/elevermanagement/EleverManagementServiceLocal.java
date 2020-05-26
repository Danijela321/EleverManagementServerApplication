package com.yrgo.elevermanagement;

import java.util.List;
import javax.ejb.Local;

import com.yrgo.dataaccess.EleverNotFoundException;
import com.yrgo.domain.Elever;

/**
 * @author danijela
 */

@Local
public interface EleverManagementServiceLocal {

	/**
	 * @author danijela
	 * @param elever registrerar elev
	 * @throws ServiceUnavailableException rollback ar true
	 */
		public void registerElever(Elever elever) throws  ServiceUnavailableException;
		
		/**
		 * @author danijela
		 * @return alla elever
		 */
		public List<Elever> getAllElever();
		
		/**
		 * @author danijela
		 * @param surname efternamn
		 * @return elever med samma efternamn
		 */
		public List<Elever> searchBysurname(String surname);
		
		/**
		 * @author danijela
		 * @param id elevs id
		 * @return elev med id
		 * @throws EleverNotFoundException kastar exception om elev inte finns
		 */
		public Elever getById(int id) throws EleverNotFoundException;
	
}
