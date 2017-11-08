package org.ap.dms.web;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import org.ap.dms.commons.util.RestUtil;
import org.ap.dms.models.entity.DmsRequestDo;
import org.ap.dms.services.DmsServices;

public class DmsRestImpl implements DmsRest {
	@EJB
	private DmsServices services;

	public Response getAllDms() {
		try {
			List<DmsRequestDo> list = services.getAllDms();
			return RestUtil.success("Success ", list);
		} catch (Exception e) {
			return RestUtil.error("Error ", e.getMessage());
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

	// @Override
	public Response addDms(String title, String description) {
		try {
			DmsRequestDo dms = new DmsRequestDo();
			dms.setTitle(title);
			dms.setShortDescription(description);
			services.addDms(dms);
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Couldn't add " + e.getMessage())
					.build();
		}

		return null;
	}

	// @Override
	public Response updateDms(DmsRequestDo dto) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Not implemented......... ").build();
	}

}
