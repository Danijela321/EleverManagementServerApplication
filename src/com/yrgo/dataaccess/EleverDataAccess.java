package com.yrgo.dataaccess;

import java.util.List;
import javax.ejb.Local;
import com.yrgo.domain.Elever;

/**
 * @author danijela
 */

@Local
public interface EleverDataAccess {
	/**
	 * @author danijela
	 * @param newElever ny elev
	 */
	public void insert(Elever newElever);

	/**
	 * @author danijela
	 * @return alla elever
	 */
	public List<Elever> findAll();

	/**
	 * @author danijela
	 * @param surname hitta efternamn
	 * @return  elever med samma efternamn
	 */
	public List<Elever> findBySurname(String surname);

	/**
	 * @author danijela
	 * @param id elevs id
	 * @return elever med exact id
	 * @throws EleverNotFoundException kastar exception om elev inte finns
	 */
	public Elever findById(int id) throws EleverNotFoundException;

}
