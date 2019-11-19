/**
 * 
 */
package com.digi.crm.dto;

import java.io.Serializable;

/**
 * @author Narendra Gangwar
 * AccountDetails.java
 * Sep 20, 2019
 */
public class AdjustAccountDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8867133495749563444L;
	private String msisdn;
	private Double amount;
	private String currency; // auto populate if payType contains . local -->BDT, IR--> TK2
	private String custCode;
	private String othmsisdn;
	
	
	public String getOthmsisdn() {
		return othmsisdn;
	}
	public void setOthmsisdn(String othmsisdn) {
		this.othmsisdn = othmsisdn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	@Override
	public String toString() {
		return "AccountDetails [msisdn=" + msisdn + ", amount=" + amount + ", currency=" + currency + ", custCode="
				+ custCode + ", othmsisdn=" + othmsisdn + "]";
	}
	
	
	
	
	
}
