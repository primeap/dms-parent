package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.DmsRequest;

@Stateless
public class DmsDao extends Dao{
	
	@EJB
    private Dao dao;
	
	
	public void addDms(DmsRequest dms) throws Exception {
		dao.create(dms);
    }

    public void deleteDms(long  id) throws Exception {
        dao.delete(DmsRequest.class, id);
    }

    public List<DmsRequest> getAllDms() throws Exception {
        return dao.getAll( DmsRequest.class );
    }
	
	
}
