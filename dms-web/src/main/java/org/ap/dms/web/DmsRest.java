package org.ap.dms.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/dms")
public interface DmsRest {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	Response getAllDms();
	
	
	@Path("/{id}")
	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public Response delete(@PathParam("id") long id) ;
}
