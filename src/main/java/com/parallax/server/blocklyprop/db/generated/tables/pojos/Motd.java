/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Customer-facing alerts
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Motd implements Serializable {

	private static final long serialVersionUID = -1332986573;

	private Long      id;
	private String    messageText;
	private String    messageHtml;
	private String    notes;
	private Byte      enabled;
	private Byte      isDeleted;
	private Timestamp createDate;
	private Timestamp lastChangeDate;
	private Timestamp messageEnableTime;
	private Timestamp messageDisableTime;

	public Motd() {}

	public Motd(Motd value) {
		this.id = value.id;
		this.messageText = value.messageText;
		this.messageHtml = value.messageHtml;
		this.notes = value.notes;
		this.enabled = value.enabled;
		this.isDeleted = value.isDeleted;
		this.createDate = value.createDate;
		this.lastChangeDate = value.lastChangeDate;
		this.messageEnableTime = value.messageEnableTime;
		this.messageDisableTime = value.messageDisableTime;
	}

	public Motd(
		Long      id,
		String    messageText,
		String    messageHtml,
		String    notes,
		Byte      enabled,
		Byte      isDeleted,
		Timestamp createDate,
		Timestamp lastChangeDate,
		Timestamp messageEnableTime,
		Timestamp messageDisableTime
	) {
		this.id = id;
		this.messageText = messageText;
		this.messageHtml = messageHtml;
		this.notes = notes;
		this.enabled = enabled;
		this.isDeleted = isDeleted;
		this.createDate = createDate;
		this.lastChangeDate = lastChangeDate;
		this.messageEnableTime = messageEnableTime;
		this.messageDisableTime = messageDisableTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageText() {
		return this.messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageHtml() {
		return this.messageHtml;
	}

	public void setMessageHtml(String messageHtml) {
		this.messageHtml = messageHtml;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}

	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getLastChangeDate() {
		return this.lastChangeDate;
	}

	public void setLastChangeDate(Timestamp lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}

	public Timestamp getMessageEnableTime() {
		return this.messageEnableTime;
	}

	public void setMessageEnableTime(Timestamp messageEnableTime) {
		this.messageEnableTime = messageEnableTime;
	}

	public Timestamp getMessageDisableTime() {
		return this.messageDisableTime;
	}

	public void setMessageDisableTime(Timestamp messageDisableTime) {
		this.messageDisableTime = messageDisableTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Motd (");

		sb.append(id);
		sb.append(", ").append(messageText);
		sb.append(", ").append(messageHtml);
		sb.append(", ").append(notes);
		sb.append(", ").append(enabled);
		sb.append(", ").append(isDeleted);
		sb.append(", ").append(createDate);
		sb.append(", ").append(lastChangeDate);
		sb.append(", ").append(messageEnableTime);
		sb.append(", ").append(messageDisableTime);

		sb.append(")");
		return sb.toString();
	}
}