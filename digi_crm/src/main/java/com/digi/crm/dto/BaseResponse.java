
package com.digi.crm.dto;


public class BaseResponse {
	
	private String status;
	private String Id;
	private String errorCode;
	private String errorDesc;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	@Override
	public String toString() {
		return "BaseResponse [status=" + status + ", Id=" + Id + ", errorCode=" + errorCode + ", errorDesc=" + errorDesc
				+ "]";
	}
	

}
