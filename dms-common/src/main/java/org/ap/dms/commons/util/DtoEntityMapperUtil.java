package org.ap.dms.commons.util;

import java.lang.reflect.InvocationTargetException;

import org.ap.dms.commons.exceptons.BeanCopyException;
import org.ap.dms.models.dto.RequestDto;
import org.ap.dms.models.entity.RequestDo;
import org.apache.commons.beanutils.PropertyUtilsBean;

public class DtoEntityMapperUtil {
	private static final PropertyUtilsBean converter = new PropertyUtilsBean();

	public RequestDto toDto(RequestDo dmsDo) throws BeanCopyException {
		RequestDto dto = new RequestDto();
		try {
			converter.copyProperties(dto, dmsDo);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			throw new BeanCopyException(e.getMessage());
		}
		return dto;
	}

}
