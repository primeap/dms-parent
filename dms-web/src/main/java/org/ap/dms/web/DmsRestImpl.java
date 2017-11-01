package org.ap.dms.web;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import org.ap.dms.models.entity.DmsRequest;
import org.ap.dms.services.DmsServices;

public class DmsRestImpl implements DmsRest {
	@EJB
	private DmsServices services;

	public Response getAllDms() {
		try {
			List<DmsRequest> list = services.getAllDms();
			return Response.ok(list).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}

	}

	@Override
	public Response delete(long id) {
		try {
			services.deleteDms(id);
			return Response.ok(" Dms request deleted wit id :" + id).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST)
					.entity(" Dms request deleted wit id :" + id + " " + e.getMessage()).build();
		}
	}
}
