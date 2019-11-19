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
@Table(name = "BANK_FTP_CONFIG")
public class BankFtpConfig {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "BANK_FTP_ID")
	private Long bankFtpId;

	@Column(name = "BANK_NAME")
	private String bankName;

	@Column(name = "PAYMENT_TYPE")
	private String paymentType;

	@Column(name = "FTP_ENABLED")
	private Integer ftpEnabled;

	@Column(name = "FTP_IP")
	private String ftpIp;

	@Column(name = "FTP_USER")
	private String ftpUser;

	@Column(name = "FTP_PASSWORD")
	private String ftpPassword;

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
	
	public Long getBankFtpId() {
		return bankFtpId;
	}

	public void setBankFtpId(Long banlFtpId) {
		this.bankFtpId = banlFtpId;
	}
	@Override
	public String toString() {
		return "BankFtpConfig [banlFtpId=" + bankFtpId + ", bankName=" + bankName + ", paymentType=" + paymentType
				+ ", ftpEnabled=" + ftpEnabled + ", ftpIp=" + ftpIp + ", ftpUser=" + ftpUser + ", ftpPassword="
				+ ftpPassword + ", status=" + status + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
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
