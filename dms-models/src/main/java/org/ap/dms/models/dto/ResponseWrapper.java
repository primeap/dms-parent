package org.ap.dms.models.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseWrapper {
	private Integer statusCode;
	private String message;
	private Object data;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
