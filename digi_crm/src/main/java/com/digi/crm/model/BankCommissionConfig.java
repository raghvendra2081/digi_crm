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
@Table(name = "BANK_COMMISSION_CONFIG")
public class BankCommissionConfig {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "BANK_COMM_ID")
	private Long bankCommId;

	@Column(name = "BANK_NAME")
	private String bankName;

	@Column(name = "PAYMENT_TYPE")
	private String paymentType;

	@Column(name = "COMM_TYPE")
	private String commType;

	@Column(name = "AMOUNT")
	private Double amount;

	@Column(name = "PERCENTAGE")
	private Double percentage;

	@Column(name = "EXT_ATR_1")
	private String extAtr1;

	@Column(name = "EXT_ATR_2")
	private String extAtr2;

	@Column(name = "EXT_ATR_3")
	private String extAtr3;

	@Column(name = "EXT_ATR_4")
	private String extAtr4;

	@Column(name = "EXT_ATR_5")
	private String extAtr5;
	
	@Column(name = "STATUS")
	private String status;

	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	//@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	//@UpdateTimestamp
	private LocalDateTime modifiedDate;

	@Override
	public String toString() {
		return "BankCommissionConfig [bankCommId=" + bankCommId + ", bankName=" + bankName + ", paymentType="
				+ paymentType + ", commType=" + commType + ", amount=" + amount + ", percentage=" + percentage
				+ ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3 + ", extAtr4=" + extAtr4
				+ ", extAtr5=" + extAtr5 + ", status=" + status + ", buId=" + buId + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ "]";
	}
	
	public Long getBankCommId() {
		return bankCommId;
	}

	public void setBankCommId(Long bankCommId) {
		this.bankCommId = bankCommId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCommType() {
		return commType;
	}

	public void setCommType(String commType) {
		this.commType = commType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getExtAtr1() {
		return extAtr1;
	}

	public void setExtAtr1(String extAtr1) {
		this.extAtr1 = extAtr1;
	}

	public String getExtAtr2() {
		return extAtr2;
	}

	public void setExtAtr2(String extAtr2) {
		this.extAtr2 = extAtr2;
	}

	public String getExtAtr3() {
		return extAtr3;
	}

	public void setExtAtr3(String extAtr3) {
		this.extAtr3 = extAtr3;
	}

	public String getExtAtr4() {
		return extAtr4;
	}

	public void setExtAtr4(String extAtr4) {
		this.extAtr4 = extAtr4;
	}

	public String getExtAtr5() {
		return extAtr5;
	}

	public void setExtAtr5(String extAtr5) {
		this.extAtr5 = extAtr5;
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

	
}
