/**
 * 
 */
package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "NOTIFICATION_TEMPLATE")
@Component
public class NotificationTemplate {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="NOTIFICATION_TEMPLATE_ID")
	Long notificationTemplateId;
	
	@Column(name = "TEMPLATE_NAME")
	private String templateName;

	@Column(name = "TEMPLATE_TYPE")
	private String templateType;
	
	@Column(name = "TEMPLATE_LANGUAGE")
	private String templateLanguage;

	@Column(name = "NOTIFICATION_SUBJECT")
	private String notificationSubject;

	@Column(name = "NOTIFICATION_BODY")
	private String notificationBody;

	@Column(name = "SOURCE_SYSTEM")
	private String source;

	@Column(name = "MODE_OF_DELIVERY")
	private String modeOfDelivery;

	@Column(name = "SHORT_CODE")
	private String shortCode;

	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DATE")
	private LocalDateTime createdDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private LocalDateTime modifiedDate;
	
	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}


	public Long getNotificationTemplateId() {
		return notificationTemplateId;
	}

	public void setNotificationTemplateId(Long notificationTemplateId) {
		this.notificationTemplateId = notificationTemplateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateLanguage() {
		return templateLanguage;
	}

	public void setTemplateLanguage(String templateLanguage) {
		this.templateLanguage = templateLanguage;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getModeOfDelivery() {
		return modeOfDelivery;
	}

	public void setModeOfDelivery(String modeOfDelivery) {
		this.modeOfDelivery = modeOfDelivery;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBuId() {
		return buId;
	}

	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "NotificationTemplate [notificationTemplateId=" + notificationTemplateId + ", templateName="
				+ templateName + ", templateType=" + templateType + ", templateLanguage=" + templateLanguage
				+ ", notificationSubject=" + notificationSubject + ", notificationBody=" + notificationBody
				+ ", source=" + source + ", modeOfDelivery=" + modeOfDelivery + ", shortCode=" + shortCode + ", status="
				+ status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	


}
