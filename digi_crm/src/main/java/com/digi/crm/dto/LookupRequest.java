package com.digi.crm.dto;

import java.io.Serializable;

public class LookupRequest implements Serializable {
	
	private String parentLookupValue;
	private String lookupGroup;	
	private String lookupName;
	private String buId;
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
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	@Override
	public String toString() {
		return "LookupRequest [parentLookupValue=" + parentLookupValue + ", lookupGroup=" + lookupGroup
				+ ", lookupName=" + lookupName + ", buId=" + buId + "]";
	}
	
	
	
	
	}
