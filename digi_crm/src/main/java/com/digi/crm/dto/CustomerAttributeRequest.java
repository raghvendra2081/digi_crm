
package com.digi.crm.dto;

public class CustomerAttributeRequest {
	
	private String buId;
	private String userId;
	private String custCode;	
	private String msiSdn;
	private String attrName;
	private String attrValue;
	
	
	@Override
	public String toString() {
		return "CustomerAttributeRequest [buId=" + buId + ", userId=" + userId + ", custCode=" + custCode + ", msiSdn="
				+ msiSdn + ", attrName=" + attrName + ", attrValue=" + attrValue + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getMsiSdn() {
		return msiSdn;
	}
	public void setMsiSdn(String msiSdn) {
		this.msiSdn = msiSdn;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	
}
