package com.yrgo.rest;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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

}
