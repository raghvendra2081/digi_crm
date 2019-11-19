package com.digi.crm.dto;

import java.io.Serializable;

public class LookupResponse implements Serializable {

	private String lookupValue;
	private String lookupdisplayValue;

	public LookupResponse() {}
	
	public LookupResponse(String lookupValue, String lookupdisplayValue) {
	
		this.lookupValue = lookupValue;
		this.lookupdisplayValue = lookupdisplayValue;
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

	@Override
	public String toString() {
		return "LookupResponse [lookupValue=" + lookupValue + ", lookupdisplayValue=" + lookupdisplayValue + "]";
	}

}
