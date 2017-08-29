/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectSharing implements Serializable {

	private static final long serialVersionUID = 936868624;

	private Long      id;
	private Long      idProject;
	private String    sharekey;
	private Boolean   expires;
	private Timestamp exprireDate;

	public ProjectSharing() {}

	public ProjectSharing(ProjectSharing value) {
		this.id = value.id;
		this.idProject = value.idProject;
		this.sharekey = value.sharekey;
		this.expires = value.expires;
		this.exprireDate = value.exprireDate;
	}

	public ProjectSharing(
		Long      id,
		Long      idProject,
		String    sharekey,
		Boolean   expires,
		Timestamp exprireDate
	) {
		this.id = id;
		this.idProject = idProject;
		this.sharekey = sharekey;
		this.expires = expires;
		this.exprireDate = exprireDate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProject() {
		return this.idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}

	public String getSharekey() {
		return this.sharekey;
	}

	public void setSharekey(String sharekey) {
		this.sharekey = sharekey;
	}

	public Boolean getExpires() {
		return this.expires;
	}

	public void setExpires(Boolean expires) {
		this.expires = expires;
	}

	public Timestamp getExprireDate() {
		return this.exprireDate;
	}

	public void setExprireDate(Timestamp exprireDate) {
		this.exprireDate = exprireDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ProjectSharing (");

		sb.append(id);
		sb.append(", ").append(idProject);
		sb.append(", ").append(sharekey);
		sb.append(", ").append(expires);
		sb.append(", ").append(exprireDate);

		sb.append(")");
		return sb.toString();
	}
}
