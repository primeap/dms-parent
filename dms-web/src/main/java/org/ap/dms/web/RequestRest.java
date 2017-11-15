package org.ap.dms.web;

import java.util.List;

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

import org.ap.dms.models.entity.RequestDo;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;

@Path("/request")
public interface RequestRest {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	Response getAllRequest();

	@Path("/{title}/{description}")
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addRequest(@PathParam("title") String title, @PathParam("title") String description);

	@Path("/register")
	@POST
	@Consumes({ MediaType.MULTIPART_FORM_DATA })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response register(MultipartBody mp);
	
	@Path("/data-attachment")
	@POST
	@Consumes({ MediaType.MULTIPART_FORM_DATA })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response registerWithData(@Multipart( type="application/json")RegistertionDto dto, List<Attachment> list);
	
	
	
	
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateRequest(RequestDo dto);

	@Path("/{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	public Response delete(@PathParam("id") long id);
}
