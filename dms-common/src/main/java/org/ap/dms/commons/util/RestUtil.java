package org.ap.dms.commons.util;

import javax.ws.rs.core.Response;

import org.ap.dms.models.dto.ResponseWrapper;

public class RestUtil {

	public static Response success(String message, Object data) {
		ResponseWrapper response = new ResponseWrapper();
		response.setData(data);
		response.setMessage(message);
		response.setStatusCode(Response.Status.CREATED.ordinal());
		return Response.status(Response.Status.CREATED).entity(response).build();

	}

	public static Response error(String message, Object data) {
		ResponseWrapper response = new ResponseWrapper();
		if (data != null)
			response.setData(data);
		response.setMessage(message);
		response.setStatusCode(Response.Status.INTERNAL_SERVER_ERROR.ordinal());
		return Response.ok().entity(response).build();

	}

	public static Response notfound(String message, Object data) {
		ResponseWrapper response = new ResponseWrapper();
		if (data != null)
			response.setData(data);
		response.setMessage(message);
		response.setStatusCode(Response.Status.NOT_FOUND.ordinal());
		return Response.status(Response.Status.NOT_FOUND.ordinal()).entity(response).build();

	}

}
