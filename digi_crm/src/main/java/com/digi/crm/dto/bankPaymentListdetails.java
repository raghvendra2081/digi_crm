package com.digi.crm.dto;

import java.util.List;

public class bankPaymentListdetails {

	private Long bankptId;
	private Long bankcommId;
	private Long bankftpId;	
	private String commType;
	private double amount;
	private double percentage;
	private String extAtr1;
	private String extAtr2;
	private String extAtr3;
	private String extAtr4;
	private String extAtr5;
	private Integer ftpEnabled;
	private String ftpIp;
	private String ftpUser;
	private String ftpPassword;
	private String buId;
	private String bankName;
	private String paymentType;
	
	public Long getBankptId() {
		return bankptId;
	}
	public void setBankptId(Long bankptId) {
		this.bankptId = bankptId;
	}
	public Long getBankcommId() {
		return bankcommId;
	}
	public void setBankcommId(Long bankcommId) {
		this.bankcommId = bankcommId;
	}
	public Long getBankftpId() {
		return bankftpId;
	}
	public void setBankftpId(Long bankftpId) {
		this.bankftpId = bankftpId;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
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
	public Integer getFtpEnabled() {
		return ftpEnabled;
	}
	public void setFtpEnabled(Integer ftpEnabled) {
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
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
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
	@Override
	public String toString() {
		return "bankPaymentListdetails [bankptId=" + bankptId + ", bankcommId=" + bankcommId + ", bankftpId="
				+ bankftpId + ", commType=" + commType + ", amount=" + amount + ", percentage=" + percentage
				+ ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3 + ", extAtr4=" + extAtr4
				+ ", extAtr5=" + extAtr5 + ", ftpEnabled=" + ftpEnabled + ", ftpIp=" + ftpIp + ", ftpUser=" + ftpUser
				+ ", ftpPassword=" + ftpPassword + ", buId=" + buId + ", bankName=" + bankName + ", paymentType="
				+ paymentType + "]";
	}

	
}
