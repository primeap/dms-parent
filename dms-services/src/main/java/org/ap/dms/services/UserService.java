package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.UserDo;

public interface UserService {

	public void addUser(UserDo user) throws Exception ;

	public void deleteUser(long id) throws Exception ;

	public List<UserDo> getAllUser() throws Exception ;

}
