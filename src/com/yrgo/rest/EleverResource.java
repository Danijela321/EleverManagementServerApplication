package com.yrgo.rest;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.yrgo.domain.Elever;
import com.yrgo.elevermanagement.EleverManagementServiceLocal;

@Stateless
@Path("/elever")
public class EleverResource {
	@Inject
	private EleverManagementServiceLocal service;
	
	@GET
	@Produces("application/XML")
	public List<Elever> getAllElever() {
		return service.getAllElever();
	}
	
	@GET
	@Produces("application/XML")
	@Path("{eleverNo}")
	public Elever findEleverById(@PathParam("eleverNo")int id) {
		return service.getById(id);
	}

	/*@GET
	@Produces("application/XML")
	@Path("{eleverSurname}")
	public List<Elever> findEleverBysurname(@PathParam("eleverSurname") String surname) {
		return service.searchBysurname(surname);
	}
	*/
	
}
