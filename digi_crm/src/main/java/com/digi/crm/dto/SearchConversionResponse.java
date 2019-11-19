
package com.digi.crm.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SearchConversionResponse implements Serializable {

	private Long Id;
	private String From_Currency;
	private String To_Currency;
	private LocalDateTime effectiveStdate;
	private LocalDateTime effectiveEnddate;
	private double rate;
	private String status;
	
	@Override
	public String toString() {
		return "SearchConversionResponse [Id=" + Id + ", From_Currency=" + From_Currency + ", To_Currency="
				+ To_Currency + ", effectiveStdate=" + effectiveStdate + ", effectiveEnddate=" + effectiveEnddate
				+ ", rate=" + rate + ", status=" + status + "]";
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFrom_Currency() {
		return From_Currency;
	}
	public void setFrom_Currency(String from_Currency) {
		From_Currency = from_Currency;
	}
	public String getTo_Currency() {
		return To_Currency;
	}
	public void setTo_Currency(String to_Currency) {
		To_Currency = to_Currency;
	}
	
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
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	

}
