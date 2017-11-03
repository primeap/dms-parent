package org.ap.dms.commons.util;

import java.lang.reflect.InvocationTargetException;

import org.ap.dms.commons.exceptons.BeanCopyException;
import org.ap.dms.models.dto.DmsRequestDto;
import org.ap.dms.models.entity.DmsRequestDo;
import org.apache.commons.beanutils.PropertyUtilsBean;
public class DtoEntityMapperUtil {
	private static final PropertyUtilsBean converter = new PropertyUtilsBean();
	public DmsRequestDto toDto(DmsRequestDo dmsDo) throws BeanCopyException {
		DmsRequestDto dto = new DmsRequestDto(); 
		try {
			converter.copyProperties(dto, dmsDo);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			throw new BeanCopyException(e.getMessage());
		}
		return dto;
	}

}
