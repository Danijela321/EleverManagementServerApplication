package com.yrgo.elevermanagement;

import javax.ejb.Stateless;

import com.yrgo.domain.Elever;

@Stateless
public class ExternalPayrollSystem {
	
	/**
	 * 
	 * @param newElever nya elev
	 * @throws ServiceUnavailableException kastar Exception
	 */

	public void enrollElever(Elever newElever) throws ServiceUnavailableException {
		double test = Math.random();
		if (test < 0.5) {
			throw new ServiceUnavailableException();
		} else {

		}
	}

}
