package com.digi.crm.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "PAYMENT_BATCH_DETAILS")
public class PaymentBatchDetails implements Serializable {
 
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;

	@NotNull
	@Column(name = "JOB_ID")
	private long jobId;


	@Column(name = "BANK_NAME")
	private String bankName;

	
	@Column(name = "PAYMENT_TYPE")
	private String paymentType;


	@Column(name = "PAYMENT_REASON")
	private String paymentReason;


	@Column(name = "PAYMENT_DATE")
	private LocalDateTime paymentDate;

	@Column(name = "CORPORATE_ID")
	private String corporateId;

	@Column(name = "CUSTOMER_TYPE")
	private String customerType;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "SOURCE_TXN_ID")
	private String sourceTxnId;

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

	@NotNull
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

	/*@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "JOB_ID", referencedColumnName = "ID")
	private FileLog fileLog;

	public FileLog getFileLog() {
		return fileLog;
	}

	public void setFileLog(FileLog fileLog) {
		this.fileLog = fileLog;
	}*/
	
	

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
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

	public String getPaymentReason() {
		return paymentReason;
	}

	public void setPaymentReason(String paymentReason) {
		this.paymentReason = paymentReason;
	}

	public String getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(String corporateId) {
		this.corporateId = corporateId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceTxnId() {
		return sourceTxnId;
	}

	public void setSourceTxnId(String sourceTxnId) {
		this.sourceTxnId = sourceTxnId;
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

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "PaymentBatchDetails [ID=" + ID + ", jobId=" + jobId + ", bankName=" + bankName + ", paymentType="
				+ paymentType + ", paymentReason=" + paymentReason + ", paymentDate=" + paymentDate + ", corporateId="
				+ corporateId + ", customerType=" + customerType + ", remarks=" + remarks + ", source=" + source
				+ ", sourceTxnId=" + sourceTxnId + ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3="
				+ extAtr3 + ", extAtr4=" + extAtr4 + ", extAtr5=" + extAtr5 + ", buId=" + buId + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + "]";
	}

	

}
