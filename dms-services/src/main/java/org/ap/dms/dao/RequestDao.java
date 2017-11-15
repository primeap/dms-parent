package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.RequestDo;

@Stateless
public class RequestDao extends Dao{
	
	@EJB
    private Dao dao;
	
	
	public void addDms(RequestDo dms) throws Exception {
		dao.create(dms);
    }

    public void deleteDms(long  id) throws Exception {
        dao.delete(RequestDo.class, id);
    }

    public List<RequestDo> getAllDms() throws Exception {
        return dao.getAll( RequestDo.class );
    }
	
	
}
