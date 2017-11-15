package org.ap.dms.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import org.ap.dms.dao.RequestDao;
import org.ap.dms.models.entity.RequestDo;

@Stateful
public class DmsServicesImpl implements RequestServices{

	@EJB
	private RequestDao dao;
	
	
	public void addRequest(RequestDo dms) throws Exception {
		dao.addDms(dms);
	}

	public void deleteRequest(long id) throws Exception {
		dao.deleteDms(id);
	}

	public List<RequestDo> getAllRequest() throws Exception {
		return dao.getAllDms();
	}

}
