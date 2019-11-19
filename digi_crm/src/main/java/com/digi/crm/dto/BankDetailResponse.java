
package com.digi.crm.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class BankDetailResponse implements Serializable {

	private List<bankPaymentListdetails> paymentType;
	// below Bank Master Details
	private Long bankId;
	private String bankType;
	private String currency;
	private String irCurrency;
	private String bankCode;
	private String bankShortName;
	private String status;
	private String buId;
	private String userId;
	private String modifiedBy;
	private String bankName;

	public List<bankPaymentListdetails> getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(List<bankPaymentListdetails> paymentType) {
		this.paymentType = paymentType;
	}
	public Long getBankId() {
		return bankId;
	}
	
	public void setBankId(Long bankId) {
		this.bankId = bankId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Override
	public String toString() {
		return "BankDetailResponse1 [paymentType=" + paymentType + ", bankId=" + bankId + ", bankType=" + bankType
				+ ", currency=" + currency + ", irCurrency=" + irCurrency + ", bankCode=" + bankCode
				+ ", bankShortName=" + bankShortName + ", status=" + status + ", buId=" + buId + ", userId=" + userId
				+ ", modifiedBy=" + modifiedBy + ", bankName=" + bankName + "]";
	}
}
