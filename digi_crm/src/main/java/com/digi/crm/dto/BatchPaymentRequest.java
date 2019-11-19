
package com.digi.crm.dto;

import java.time.LocalDateTime;

public class BatchPaymentRequest extends BaseRequest {
	
	private String buId;
	private String fileName;
	private String jobName;
	private String fileType; //
	private String userId;// createdby
	private String BankName;
	private String paymentType;
	private String paymentReason;
	private LocalDateTime paymentDate;
	private String customerType;
	private String corporateId;
	private String remarks;
	
	@Override
	public String toString() {
		return "BatchPaymentRequest [buId=" + buId + ", fileName=" + fileName + ", jobName=" + jobName + ", fileType="
				+ fileType + ", userId=" + userId + ", BankName=" + BankName + ", paymentType=" + paymentType
				+ ", paymentReason=" + paymentReason + ", paymentDate=" + paymentDate + ", customerType=" + customerType
				+ ", corporateId=" + corporateId + ", remarks=" + remarks + "]";
	}
	
	
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentReason() {
		return paymentReason;
	}
	public void setPaymentReason(String paymentReason) {
		this.paymentReason = paymentReason;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	public String getCorporateId() {
		return corporateId;
	}


	public void setCorporateId(String corporateId) {
		this.corporateId = corporateId;
	}


	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
		

}
