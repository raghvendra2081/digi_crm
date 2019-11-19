
package com.digi.crm.dto;

public class CustomProfileResponse extends BaseResponse {

	private String msisdn;
	private String custCode;
	
	@Override
	public String toString() {
		return "CustomProfileResponse [msisdn=" + msisdn + ", custCode=" + custCode + "]";
	}	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	

}
