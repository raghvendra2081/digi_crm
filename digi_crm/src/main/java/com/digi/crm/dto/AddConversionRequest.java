package com.digi.crm.dto;

import java.time.LocalDateTime;

public class AddConversionRequest {
	
	private String fromCurrency;	
	private String toCurrency;
	private LocalDateTime effectiveStdate;
	private LocalDateTime effectiveEnddate;
	private double rate;
	private String buId;
	private String userId;
	
	
	public LocalDateTime getEffectiveStdate() {
		return effectiveStdate;
	}
	public void setEffectiveStdate(LocalDateTime effectiveStdate) {
		this.effectiveStdate = effectiveStdate;
	}
	public LocalDateTime getEffectiveEnddate() {
		return effectiveEnddate;
	}
	public void setEffectiveEnddate(LocalDateTime effectiveEnddate) {
		this.effectiveEnddate = effectiveEnddate;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "AddConversionRequest [fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", effectiveStdate=" + effectiveStdate + ", effectiveEnddate=" + effectiveEnddate + ", rate=" + rate
				+ ", buId=" + buId + ", userId=" + userId + "]";
	}
}
