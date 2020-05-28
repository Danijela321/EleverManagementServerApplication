package com.yrgo.rest;

import java.net.URI;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.yrgo.dataaccess.EleverNotFoundException;
import com.yrgo.domain.Elever;
import com.yrgo.elevermanagement.EleverManagementServiceLocal;
import com.yrgo.elevermanagement.ServiceUnavailableException;


/**
 * 
 * @author danijela
 *
 */

@Stateless
@Path("/elever")
public class EleverResource {
	@Inject
	private EleverManagementServiceLocal service;

	/**
	 * @author danijela
	 * @return alla elever
	 */

	@GET
	// @Produces("application/XML")
	// @Produces("application/JSON")
	@Produces({ "application/JSON", "application/XML" })
	public List<Elever> getAllElever() {
		return service.getAllElever();
	}

	/**
	 * @author danijela
	 * @param surname hitta elever pga efternamn
	 * @return elever med samma efternamn
	 */

	@GET
	// @Produces("application/XML")
	// @Produces("application/JSON")
	@Produces({ "application/JSON", "application/XML" })
	@Path("{eleverSurname}")
	public List<Elever> findEleverBysurname(@PathParam("eleverSurname") String surname) {
		return service.searchBysurname(surname);
	}

	/**
	 * @author danijela
	 * @param id hitta elever med unik id
	 * @return elever med exakt id
	 * nar man hittar pga id, vilken efternamn anvander man inte är viktig
	 *t.ex.  get ....... elever/xxx/507 ,får man elev som har id=507
	 *eftersom i koden result=.....getById(id)
	 */

	@GET
	// @Produces("application/XML")
	// @Produces("application/JSON")
	@Produces({ "application/JSON", "application/XML" })
	@Path("{eleverSurname}/{eleverNo}")
	//nar man hittar pga id, vilken efternamn anvander man inte är viktig
	//t.ex.  get ....... elever/xxx/507 ,får man elev som har id=507
	//eftersom i koden result=.....getById(id)
	public Response findEleverById(@PathParam("eleverNo") int id) {
		try {
			Elever result = service.getById(id);
			return Response.ok(result).build();
		} catch (EleverNotFoundException e) {
			return Response.status(404).build();
		}
	}

	/**
	 * @author danijela
	 * @param elever ny elever
	 * @return ny elev i databas
	 */
	@POST
	// @Produces("application/XML")
	// @Produces("application/JSON")
	@Produces({ "application/JSON", "application/XML" })
	@Consumes("application/JSON")
	// @Consumes({"application/JSON", "application/XML"})

	public Response createNyElever(Elever elever) {
		try {
			service.registerElever(elever);
			URI uri = null;
			try {
				uri = new URI("/elever/308");
			} catch (Exception e) {
			}
			return Response.created(uri).build();

		} catch (ServiceUnavailableException e) {
			return Response.status(504).build();
		}
	}
	
	/**
	 * @author danijela
	 * @param id elevs id
	 * @return respons code
	 */
	
	@DELETE
	@Path("{eleverNo}")
	public Response deleteEmployee(@PathParam("eleverNo") int id) {
		try {
			service.deleteElever(id);
			//om det är ok eller finns inte
			return Response.status(204).build();
		} catch (EleverNotFoundException e) {
			return Response.status(404).build();
		}
	}
	
	@PUT
	@Path("{eleverNo}")
	@Produces({"application/JSON", "application/XML"})
	@Consumes({"application/JSON"})
	public Response updateEmployee(@PathParam("eleverNo") int id,Elever e){
		try {
			service.updateElever(id, e.getSurname(), e.getKlass());
			return Response.ok(service.getById(id)).build();
		} catch (EleverNotFoundException e1) {
			return Response.status(404).build();
		}
	}
}
