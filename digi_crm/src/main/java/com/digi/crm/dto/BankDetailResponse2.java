
package com.digi.crm.dto;

import java.time.LocalDateTime;
import java.util.List;

public class BankDetailResponse2 extends BaseResponse{
	
	private List<String> paymentType;	
	private Long bankptId;	
	private String bankName;
	private Long bankcommId;	
	private String commType;
	private double amount;
	private String percentage;
	private String extAtr1;
	private String extAtr2;
	private String extAtr3;
	private String extAtr4;
	private String extAtr5;
	private Long bankftpId;
	private String ftpEnabled;
	private String ftpIp;
	private String ftpUser;
	private String ftpPassword;
	
	//below Bank Master Details
	private Long bankId;
	private String bankType;
	private String currency;
	private String irCurrency;
	private String bankCode;
	private String bankShortName;
	private String status;
	private String buId;
	private String createdBy;
	private LocalDateTime createdDate;
	private String modifiedBy;
	private LocalDateTime modifiedDate;
	public List<String> getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(List<String> paymentType) {
		this.paymentType = paymentType;
	}
	public Long getBankptId() {
		return bankptId;
	}
	public void setBankptId(Long bankptId) {
		this.bankptId = bankptId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Long getBankcommId() {
		return bankcommId;
	}
	public void setBankcommId(Long bankcommId) {
		this.bankcommId = bankcommId;
	}
	public String getCommType() {
		return commType;
	}
	public void setCommType(String commType) {
		this.commType = commType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
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
	public Long getBankftpId() {
		return bankftpId;
	}
	public void setBankftpId(Long bankftpId) {
		this.bankftpId = bankftpId;
	}
	public String getFtpEnabled() {
		return ftpEnabled;
	}
	public void setFtpEnabled(String ftpEnabled) {
		this.ftpEnabled = ftpEnabled;
	}
	public String getFtpIp() {
		return ftpIp;
	}
	public void setFtpIp(String ftpIp) {
		this.ftpIp = ftpIp;
	}
	public String getFtpUser() {
		return ftpUser;
	}
	public void setFtpUser(String ftpUser) {
		this.ftpUser = ftpUser;
	}
	public String getFtpPassword() {
		return ftpPassword;
	}
	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
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
		return "BankDetailResponse [paymentType=" + paymentType + ", bankptId=" + bankptId + ", bankName=" + bankName
				+ ", bankcommId=" + bankcommId + ", commType=" + commType + ", amount=" + amount + ", percentage="
				+ percentage + ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3 + ", extAtr4="
				+ extAtr4 + ", extAtr5=" + extAtr5 + ", bankftpId=" + bankftpId + ", ftpEnabled=" + ftpEnabled
				+ ", ftpIp=" + ftpIp + ", ftpUser=" + ftpUser + ", ftpPassword=" + ftpPassword + ", bankId=" + bankId
				+ ", bankType=" + bankType + ", currency=" + currency + ", irCurrency=" + irCurrency + ", bankCode="
				+ bankCode + ", bankShortName=" + bankShortName + ", status=" + status + ", buId=" + buId
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + "]";
	}

	
		}
