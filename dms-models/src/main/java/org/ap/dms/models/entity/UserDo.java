package org.ap.dms.models.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@NamedQueries({ @NamedQuery(name = "UserDo.getAll", query = "Select e from UserDo e ") })
public class UserDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userLNo;
	private int userId;
	private String userName;
	private int userTelNo;
	private String userEmail;
	private String userGroup;
	private String role;
	private Date validFrom;
	private Date validTo;
	private String orgCode;
	private String status;
	public int getUserLNo() {
		return userLNo;
	}
	public void setUserLNo(int userLNo) {
		this.userLNo = userLNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserTelNo() {
		return userTelNo;
	}
	public void setUserTelNo(int userTelNo) {
		this.userTelNo = userTelNo;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
