
package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Narendra Gangwar
 * FileTypeRuleAttribute.java
 * Sep 10, 2019
 */
@Entity

@Table(name = "FILE_TYPE_RULE_ATTRIBUTE")
public class FileTypeRuleAttribute {

	@Id
	@NotNull
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(name = "FILE_TYPE")
	private String fileType;

	@NotNull
	@Column(name = "RULE_TYPE")
	private String ruleType;

	@NotNull
	@Column(name = "RULE_VALUE")
	private String rulevalue;

	@NotNull
	@Column(name = "STATUS")
	private String status;

	@NotNull
	@Column(name = "BU_ID")
	private String buId;

	@NotNull
	@Column(name = "CREATED_BY")
	private String createdBy;

	@NotNull
	@CreationTimestamp
	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@UpdateTimestamp
	@Column(name = "MODIFIED_DATE")
	private LocalDateTime modifiedDate;

	public FileTypeRuleAttribute() {

	}

	public FileTypeRuleAttribute(Long id, String fileType, String ruleType, String rulevalue, String status,
			String buId, String createdBy, LocalDateTime createdDate, String modifiedBy, LocalDateTime modifiedDate) {

		this.id = id;
		this.fileType = fileType;
		this.ruleType = ruleType;
		this.rulevalue = rulevalue;
		this.status = status;
		this.buId = buId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getRulevalue() {
		return rulevalue;
	}

	public void setRulevalue(String rulevalue) {
		this.rulevalue = rulevalue;
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
		return "FileTypeRuleAttribute [id=" + id + ", fileType=" + fileType + ", ruleType=" + ruleType + ", rulevalue="
				+ rulevalue + ", status=" + status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}
