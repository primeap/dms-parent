package org.ap.dms.services;

import java.util.List;

import org.ap.dms.models.entity.DmsRequestDo;

public interface DmsServices {

	List<DmsRequestDo> getAllDms() throws Exception;

	void deleteDms(long id) throws Exception;

	void addDms(DmsRequestDo dms) throws Exception;

}
