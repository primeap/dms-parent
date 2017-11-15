package org.ap.dms.models.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TBL_REQUEST")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "RequestDo.getAll", query = "Select e from RequestDo e ") })
public class RequestDo extends CommonDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIPTION")
	private String shortDescription;

	@Column(name = "TITLE")
	private String title;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch= FetchType.EAGER)
	@JoinColumn(name = "REQUEST_ID")
	private Set<AttachmentDo> attachmetList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<AttachmentDo> getAttachmetList() {
		return attachmetList;
	}

	public void setAttachmetList(Set<AttachmentDo> attachmetList) {
		this.attachmetList = attachmetList;
	}

	@Override
	public String toString() {
		return "RequestDo [id=" + id + ", shortDescription=" + shortDescription + ", title=" + title
				+ ", attachmetList=" + attachmetList + "]";
	}

}