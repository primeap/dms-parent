package org.ap.dms.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class CommonDo {

	@Column(name = "USER_UPDATED", nullable = false)
	private String userUpdated;
	
	@Column(name = "USER_CREATED", nullable = false)
	private String userCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_UPDATED", nullable = false)
	private Date dateUpdated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CREATED", nullable = false)
	private Date dateCreated;

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(String userCreated) {
		this.userCreated = userCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}
