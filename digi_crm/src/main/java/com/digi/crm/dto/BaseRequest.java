/**
 * 
 */
package com.digi.crm.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Narendra Gangwar
 * BaseRequest.java
 * Sep 16, 2019
 */
public class BaseRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String requestType;
	private String requestSubType;
	private String sourceSystem;
	private String sourceTxnId;
	private ArrayList<CustomRef> customRef;
	
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestSubType() {
		return requestSubType;
	}
	public void setRequestSubType(String requestSubType) {
		this.requestSubType = requestSubType;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getSourceTxnId() {
		return sourceTxnId;
	}
	public void setSourceTxnId(String sourceTxnId) {
		this.sourceTxnId = sourceTxnId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public ArrayList<CustomRef> getCustomRef() {
		return customRef;
	}
	public void setCustomRef(ArrayList<CustomRef> customRef) {
		this.customRef = customRef;
	}
	
	@Override
	public String toString() {
		return "BaseRequest [requestType=" + requestType + ", requestSubType=" + requestSubType + ", sourceSystem="
				+ sourceSystem + ", sourceTxnId=" + sourceTxnId + "]";
	}
	
	

	
}
