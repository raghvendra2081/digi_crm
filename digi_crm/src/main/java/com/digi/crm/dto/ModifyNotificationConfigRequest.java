
package com.digi.crm.dto;

public class ModifyNotificationConfigRequest {
	
	private String buId;
	private String userId;
	private String source;
	private String templateName;
	private String templateType;
	private String templateLanguage;
	private String modeOfDelivery;
	private Long notificationTemplateId;
	//private String status;//
	private String notificationSubject;
	private String notificationBody;
	private String shortCode;
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getTemplateLanguage() {
		return templateLanguage;
	}
	public void setTemplateLanguage(String templateLanguage) {
		this.templateLanguage = templateLanguage;
	}
	public String getModeOfDelivery() {
		return modeOfDelivery;
	}
	public void setModeOfDelivery(String modeOfDelivery) {
		this.modeOfDelivery = modeOfDelivery;
	}
	public Long getNotificationTemplateId() {
		return notificationTemplateId;
	}
	public void setNotificationTemplateId(Long notificationTemplateId) {
		this.notificationTemplateId = notificationTemplateId;
	}
	/*public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
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
		return "ModifyNotificationConfigRequest [buId=" + buId + ", userId=" + userId + ", source=" + source
				+ ", templateName=" + templateName + ", templateType=" + templateType + ", templateLanguage="
				+ templateLanguage + ", modeOfDelivery=" + modeOfDelivery + ", notificationTemplateId="
				+ notificationTemplateId + ", notificationSubject=" + notificationSubject
				+ ", notificationBody=" + notificationBody + ", shortCode=" + shortCode + "]";
	}
	

}
