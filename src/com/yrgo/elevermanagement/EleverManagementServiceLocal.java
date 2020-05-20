package com.yrgo.elevermanagement;

import java.util.List;
import javax.ejb.Local;

import com.yrgo.dataaccess.EleverNotFoundException;
import com.yrgo.domain.Elever;

/**
 * @author Danijela
 */

@Local
public interface EleverManagementServiceLocal {

	/**
	 * @author Danijela
	 * @param elever
	 * @throws ServiceUnavailableException
	 */
		public void registerElever(Elever elever) throws  ServiceUnavailableException;
		
		/**
		 * @author Danijela
		 * @return
		 */
		public List<Elever> getAllElever();
		
		/**
		 * @author Danijela
		 * @param surname
		 * @return
		 */
		public List<Elever> searchBysurname(String surname);
		
		/**
		 * @author Danijela
		 * @param id
		 * @return
		 * @throws EleverNotFoundException 
		 * @throws ClassNotFoundException 
		 */
		public Elever getById(int id) throws EleverNotFoundException;
	
}
