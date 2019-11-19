
package com.digi.crm.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BankMasterDto implements Serializable {
	private Long bankId;
	private String bankName;
	private String bankType;
	private String currency;
	private String irCurrency;
	private String bankCode;
	private String bankShortName;
	private String extAtr1;
	private String extAtr2;
	private String extAtr3;
	private String extAtr4;
	private String extAtr5;
	private String status;
	private String buId;
	private String createdBy;
	private LocalDateTime createdDate;
	private String modifiedBy;
	private LocalDateTime modifiedDate;

	@Override
	public String toString() {
		return "BankMasterDto [bankId=" + bankId + ", bankName=" + bankName + ", bankType=" + bankType + ", currency="
				+ currency + ", irCurrency=" + irCurrency + ", bankCode=" + bankCode + ", bankShortName="
				+ bankShortName + ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3
				+ ", extAtr4=" + extAtr4 + ", extAtr5=" + extAtr5 + ", status=" + status + ", buId=" + buId
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getIrCurrency() {
		return irCurrency;
	}
	public void setIrCurrency(String irCurrency) {
		this.irCurrency = irCurrency;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankShortName() {
		return bankShortName;
	}
	public void setBankShortName(String bankShortName) {
		this.bankShortName = bankShortName;
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
