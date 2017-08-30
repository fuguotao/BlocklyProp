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
public class FriendRequestEmail implements Serializable {

	private static final long serialVersionUID = 1854648987;

	private Long      id;
	private Long      idrequestuser;
	private Long      email;
	private String    acceptKey;
	private Timestamp requested;
	private Integer   requestSentCount;
	private Timestamp requestLastSent;
	private Boolean   refused;

	public FriendRequestEmail() {}

	public FriendRequestEmail(FriendRequestEmail value) {
		this.id = value.id;
		this.idrequestuser = value.idrequestuser;
		this.email = value.email;
		this.acceptKey = value.acceptKey;
		this.requested = value.requested;
		this.requestSentCount = value.requestSentCount;
		this.requestLastSent = value.requestLastSent;
		this.refused = value.refused;
	}

	public FriendRequestEmail(
		Long      id,
		Long      idrequestuser,
		Long      email,
		String    acceptKey,
		Timestamp requested,
		Integer   requestSentCount,
		Timestamp requestLastSent,
		Boolean   refused
	) {
		this.id = id;
		this.idrequestuser = idrequestuser;
		this.email = email;
		this.acceptKey = acceptKey;
		this.requested = requested;
		this.requestSentCount = requestSentCount;
		this.requestLastSent = requestLastSent;
		this.refused = refused;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdrequestuser() {
		return this.idrequestuser;
	}

	public void setIdrequestuser(Long idrequestuser) {
		this.idrequestuser = idrequestuser;
	}

	public Long getEmail() {
		return this.email;
	}

	public void setEmail(Long email) {
		this.email = email;
	}

	public String getAcceptKey() {
		return this.acceptKey;
	}

	public void setAcceptKey(String acceptKey) {
		this.acceptKey = acceptKey;
	}

	public Timestamp getRequested() {
		return this.requested;
	}

	public void setRequested(Timestamp requested) {
		this.requested = requested;
	}

	public Integer getRequestSentCount() {
		return this.requestSentCount;
	}

	public void setRequestSentCount(Integer requestSentCount) {
		this.requestSentCount = requestSentCount;
	}

	public Timestamp getRequestLastSent() {
		return this.requestLastSent;
	}

	public void setRequestLastSent(Timestamp requestLastSent) {
		this.requestLastSent = requestLastSent;
	}

	public Boolean getRefused() {
		return this.refused;
	}

	public void setRefused(Boolean refused) {
		this.refused = refused;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("FriendRequestEmail (");

		sb.append(id);
		sb.append(", ").append(idrequestuser);
		sb.append(", ").append(email);
		sb.append(", ").append(acceptKey);
		sb.append(", ").append(requested);
		sb.append(", ").append(requestSentCount);
		sb.append(", ").append(requestLastSent);
		sb.append(", ").append(refused);

		sb.append(")");
		return sb.toString();
	}
}
