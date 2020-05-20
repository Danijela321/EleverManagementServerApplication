package com.yrgo.dataaccess;

import java.util.List;
import javax.ejb.Local;
import com.yrgo.domain.Elever;

/**
 * @author Danijela
 */

@Local
public interface EleverDataAccess {
	/**
	 * @author Danijela
	 * @param newElever
	 */
	public void insert(Elever newElever);

	/**
	 * @author Danijela
	 * @return
	 */
	public List<Elever> findAll();

	/**
	 * @author Danijela
	 * @param surname
	 * @return
	 */
	public List<Elever> findBySurname(String surname);

	/**
	 * @author Danijela
	 * @param id
	 * @return
	 * @throws EleverNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public Elever findById(int id) throws EleverNotFoundException;

}
