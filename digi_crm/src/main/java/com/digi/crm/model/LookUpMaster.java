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

@Entity
@Table(name = "LOOKUP_MASTER")
public class LookUpMaster {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long LOOKUP_ID;

	@NotNull
	@Column(name = "PARENT_LOOKUP_VALUE")
	private String parentLookupValue;

	@NotNull
	@Column(name = "LOOKUP_GROUP")
	private String lookupGroup;

	@Column(name = "LOOKUP_NAME")
	private String lookupName;

	@Column(name = "LOOKUP_DESCRIPTION")
	private String looDescription;

	@Column(name = "LOOKUP_VALUE")
	private String lookupValue;

	@Column(name = "LOOKUP_DISPLAY_VALUE")
	private String lookupdisplayValue;

	@Column(name = "LOOKUP_SORT_ORDER")
	private String lookupsortOrder;

	@Column(name = "STATUS")
	private String status;

	@NotNull
	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public Long getLOOKUP_ID() {
		return LOOKUP_ID;
	}

	public void setLOOKUP_ID(Long lOOKUP_ID) {
		LOOKUP_ID = lOOKUP_ID;
	}

	public String getParentLookupValue() {
		return parentLookupValue;
	}

	public void setParentLookupValue(String parentLookupValue) {
		this.parentLookupValue = parentLookupValue;
	}

	public String getLookupGroup() {
		return lookupGroup;
	}

	public void setLookupGroup(String lookupGroup) {
		this.lookupGroup = lookupGroup;
	}

	public String getLookupName() {
		return lookupName;
	}

	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}

	public String getLooDescription() {
		return looDescription;
	}

	public void setLooDescription(String looDescription) {
		this.looDescription = looDescription;
	}

	public String getLookupValue() {
		return lookupValue;
	}

	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}

	public String getLookupdisplayValue() {
		return lookupdisplayValue;
	}

	public void setLookupdisplayValue(String lookupdisplayValue) {
		this.lookupdisplayValue = lookupdisplayValue;
	}

	public String getLookupsortOrder() {
		return lookupsortOrder;
	}

	public void setLookupsortOrder(String lookupsortOrder) {
		this.lookupsortOrder = lookupsortOrder;
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
		return "LookUpMaster [LOOKUP_ID=" + LOOKUP_ID + ", parentLookupValue=" + parentLookupValue + ", lookupGroup="
				+ lookupGroup + ", lookupName=" + lookupName + ", looDescription=" + looDescription + ", lookupValue="
				+ lookupValue + ", lookupdisplayValue=" + lookupdisplayValue + ", lookupsortOrder=" + lookupsortOrder
				+ ", status=" + status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

}
