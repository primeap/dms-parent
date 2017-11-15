package org.ap.dms.web;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import org.ap.dms.models.entity.AttachmentDo;
import org.ap.dms.models.entity.RequestDo;
import org.ap.dms.services.RequestServices;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;

public class RequestRestImpl implements RequestRest {
	@EJB
	private RequestServices services;

	public Response getAllRequest() {
		try {
			List<RequestDo> list = services.getAllRequest();
			return Response.ok(list).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
		}

	}

	@Override
	public Response delete(long id) {
		try {
			services.deleteRequest(id);
			return Response.ok(" Dms request deleted wit id :" + id).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST)
					.entity(" Dms request deleted wit id :" + id + " " + e.getMessage()).build();
		}
	}

	@Override
	public Response addRequest(String title, String description) {
		try {
			RequestDo request = new RequestDo();
			request.setTitle(title);
			request.setShortDescription(description);
			request.setDateCreated(new Date());
			request.setUserCreated(title);
			request.setUserUpdated(title);
			request.setDateUpdated(new Date());

			AttachmentDo attach = new AttachmentDo();
			attach.setAttachment("String".getBytes());

			Set<AttachmentDo> list = new HashSet<AttachmentDo>();
			list.add(attach);
			request.setAttachmetList(list);

			services.addRequest(request);
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Couldn't add " + e.getMessage())
					.build();
		}

		return null;
	}

	public Response register(MultipartBody mp ) {
		
		Attachment root = mp.getRootAttachment();
		
		System.out.println(root.getContentType()+"  "+root.getContentId());
		
		List<Attachment> attachments = mp.getAllAttachments();
		for( Attachment a : attachments){
			System.out.println(a.getContentType()+"  "+a.getContentId()+ a.getDataHandler().getName());
			
		}
		

		System.out.println(attachments.get(0).getDataHandler().getName());
		
		
		
		
		
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("You are registerd :D").build();

	}


	@Override
	public Response registerWithData(RegistertionDto dto, List<Attachment> list){

		
		System.out.println(dto);
		System.out.println(list);
		
		
		return null;
	}

	@Override
	public Response updateRequest(RequestDo dto) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Not implemented......... ").build();
	}
}
