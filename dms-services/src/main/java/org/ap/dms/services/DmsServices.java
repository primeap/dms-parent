package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.DmsRequest;

public interface DmsServices {

	List<DmsRequest> getAllDms() throws Exception;

	void deleteDms(long id) throws Exception;

	void addDms(DmsRequest dms) throws Exception;

}
