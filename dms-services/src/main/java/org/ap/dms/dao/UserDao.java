package org.ap.dms.dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ap.dms.models.entity.DmsRequestDo;
import org.ap.dms.models.entity.UserDo;

@Stateless
public class UserDao extends Dao{
	@EJB
    private Dao dao;
	
	
	public void addUser(UserDo user) throws Exception {
		dao.create(user);
    }

    public void deleteUser(long  id) throws Exception {
        dao.delete(DmsRequestDo.class, id);
    }

    public List<UserDo> getAllUser() throws Exception {
        return dao.getAll( UserDo.class );
    }
}
