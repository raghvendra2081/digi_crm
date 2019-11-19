
package com.digi.crm.dto;

public class SearchNotificationResponse {
	
	private long RowId;
	private String status;
	private String notificationSubject;
	private String notificationBody;
	private String shortCode;
	public long getRowId() {
		return RowId;
	}
	public void setRowId(long rowId) {
		RowId = rowId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotificationSubject() {
		return notificationSubject;
	}
	public void setNotificationSubject(String notificationSubject) {
		this.notificationSubject = notificationSubject;
	}
	public String getNotificationBody() {
		return notificationBody;
	}
	public void setNotificationBody(String notificationBody) {
		this.notificationBody = notificationBody;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	@Override
	public String toString() {
		return "SearchNotificationResponse [RowId=" + RowId + ", status=" + status + ", notificationSubject="
				+ notificationSubject + ", notificationBody=" + notificationBody + ", shortCode=" + shortCode + "]";
	}
	
}
