package org.ap.dms.commons.exceptons;

public class BeanCopyException extends Exception{
	private String message;
	
	public BeanCopyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
