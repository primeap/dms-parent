package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.DmsRequestDo;

@Stateless
public class DmsDao extends Dao{
	
	@EJB
    private Dao dao;
	
	
	public void addDms(DmsRequestDo dms) throws Exception {
		dao.create(dms);
    }

    public void deleteDms(long  id) throws Exception {
        dao.delete(DmsRequestDo.class, id);
    }

    public List<DmsRequestDo> getAllDms() throws Exception {
        return dao.getAll( DmsRequestDo.class );
    }
	
	
}
