
package com.digi.crm.dto;

import java.time.LocalDateTime;

public class SearchCustomerAttributeResponse extends BaseResponse {
	
	 private String attrValue;
	 private LocalDateTime createdDate;
	 private String msiSdn;


	public String getMsiSdn() {
		return msiSdn;
	}

	public void setMsiSdn(String msiSdn) {
		this.msiSdn = msiSdn;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	@Override
	public String toString() {
		return "SearchCustomerAttributeResponse [attrValue=" + attrValue + ", createdDate=" + createdDate + ", msiSdn="
				+ msiSdn + "]";
	}
}
