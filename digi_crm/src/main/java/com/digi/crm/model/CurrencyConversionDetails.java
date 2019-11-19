package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "currency_conversion_details")
public class CurrencyConversionDetails {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "ID")
	private Long id;

	@Column(name = "FROM_CURRENCY")
	private String fromCurrency;

	@Column(name = "TO_CURRENCY")
	private String toCurrency;

	@Column(name = "RATE")
	private double rate;

	@Column(name = "EFFECTIVE_ST_DATE")
	private LocalDateTime effectiveStdate;

	@Column(name = "EFFECTIVE_END_DATE")
	private LocalDateTime effectiveEnddate;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	private LocalDateTime modifiedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBuId() {
		return buId;
	}

	public void setBuId(String buId) {
		this.buId = buId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "CurrencyConversionDetails [Id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", rate=" + rate + ", effectiveStdate=" + effectiveStdate + ", effectiveEnddate=" + effectiveEnddate
				+ ", status=" + status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

	
}
