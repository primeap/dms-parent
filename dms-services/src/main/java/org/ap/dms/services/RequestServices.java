package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.RequestDo;

public interface RequestServices {

	List<RequestDo> getAllRequest() throws Exception;

	void deleteRequest(long id) throws Exception;

	void addRequest(RequestDo dms) throws Exception;

}
