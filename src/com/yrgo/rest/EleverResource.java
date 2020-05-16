package com.yrgo.rest;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.yrgo.domain.Elever;
import com.yrgo.elevermanagement.EleverManagementServiceLocal;
import com.yrgo.elevermanagement.ServiceUnavailableException;

/**
 * 
 * @author Danijela
 *
 */

@Stateless
@Path("/elever")
public class EleverResource {
	@Inject
	private EleverManagementServiceLocal service;
	
	/**
	 * @author Danijela
	 * @return
	 */
	
	@GET
	//@Produces("application/XML")
	//@Produces("application/JSON")
	@Produces({"application/JSON", "application/XML"})
	public List<Elever> getAllElever() {
		return service.getAllElever();
	}
	
	/**
	 * @author danijela
	 * @param surname
	 * @return
	 */
	
	@GET
	//@Produces("application/XML")
	//@Produces("application/JSON")
	@Produces({"application/JSON", "application/XML"})
	@Path("{eleverSurname}")
	public List<Elever> findEleverBysurname(@PathParam("eleverSurname") String surname) {
		return service.searchBysurname(surname);
	}
	
	/**
	 * @author danijela
	 * @param id
	 * @return
	 */
	
	@GET
	//@Produces("application/XML")
	//@Produces("application/JSON")
	@Produces({"application/JSON", "application/XML"})
	@Path("{eleverSurname}/{eleverNo}")
	public Elever findEleverById(@PathParam("eleverNo")int id) {
		return service.getById(id);
	}

	/**
	 * @author danijela
	 * @param elever
	 * @return
	 */
	@POST
	//@Produces("application/XML")
	//@Produces("application/JSON")
	@Produces({"application/JSON", "application/XML"})
	@Consumes("application/XML")
	//@Consumes({"application/JSON", "application/XML"})
	public Elever createNyElever(Elever elever) {
		try {
			service.registerElever(elever);
		} catch (ServiceUnavailableException e) {
			// skriva mer kod för att fixa
			e.printStackTrace();
		}
		return elever;
	}
	
}
