package org.ap.dms.web;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import org.ap.dms.models.entity.DmsRequestDo;
import org.ap.dms.models.entity.UserDo;
import org.ap.dms.services.UserService;

public class UserRestImpl implements UserRest {
	@EJB
	private UserService services;

	public Response getAllUser() {
		try {
			List<UserDo> list = services.getAllUser();
			return Response.ok(list).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}

	}

	@Override
	public Response delete(long id) {
		try {
			services.deleteUser(id);
			return Response.ok(" User request deleted wit id :" + id).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST)
					.entity(" User request deleted wit id :" + id + " " + e.getMessage()).build();
		}
	}

	// @Override
	public Response addUser(String name, String orgCode) {
		try {
			UserDo userDo = new UserDo();
			userDo.setUserName(name);
			userDo.setOrgCode(orgCode);
			services.addUser(userDo);
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Couldn't add " + e.getMessage())
					.build();
		}

		return null;
	}

	

	@Override
	public Response updateDms(DmsRequestDo dto) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
