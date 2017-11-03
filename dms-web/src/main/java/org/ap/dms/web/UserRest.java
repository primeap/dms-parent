package org.ap.dms.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.ap.dms.models.entity.DmsRequestDo;

@Path("/user")
public interface UserRest {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	Response getAllUser();
	
	@Path("/{title}/{description}")
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public Response addUser(@PathParam("title") String title, @PathParam("title") String description) ;
	
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public Response updateDms(DmsRequestDo dto);
	
	
	@Path("/{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
    public Response delete(@PathParam("id") long id) ;
}
