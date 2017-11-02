package org.ap.dms.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TBL_DMS_REQUEST")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "DmsRequestDo.getAll", query = "Select e from DmsRequestDo e ") })
public class DmsRequestDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "movieIdSequence", sequenceName = "dms-req-id", allocationSize = 1, initialValue = 100000)
	@Column(name = "ID")
	private long id;

	@Column(name = "DESCRIPTION")
	private String shortDescription;

	@Column(name = "TITLE")
	private String title;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	@Override
	public String toString() {
		return "DmsRequest [id=" + id + ", shortDescription=" + shortDescription + ", title=" + title + "]";
	}

}