package org.ap.dms.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import org.ap.dms.dao.UserDao;
import org.ap.dms.models.entity.DmsRequestDo;
import org.ap.dms.models.entity.UserDo;

@Stateful
public class UserServiceImpl implements UserService{

	@EJB
	private UserDao dao;

	public void addUser(UserDo user) throws Exception {
		dao.addUser(user);
	}

	public void deleteUser(long id) throws Exception {
		dao.deleteUser(id);
	}

	public List<UserDo> getAllUser() throws Exception {
		return dao.getAllUser();
	}

}
