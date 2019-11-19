package com.digi.crm.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "PAYMENT_TXN_DETAILS")
public class PaymentTxnDetails {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_TXN_DETAILS_GENERATOR")
	@SequenceGenerator(name = "PAYMENT_TXN_DETAILS_GENERATOR", sequenceName = "PAYMENT_TXN_DETAILS_SEQUENCE")
	private Long ID;

	@Column(name = "JOB_ID")
	private Long jobId;

	@Column(name = "RECORD_ID")
	private Long recordId;

	@Column(name = "TXN_ID")
	private String txnId;

	@Column(name = "MSISDN")
	private String msiSdn;

	@Column(name = "CUST_CODE")
	private String custCode;

	@Column(name = "AMOUNT")
	private Double amount;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "BILLING_PAYMENT_TYPE")
	private String billingPaymentType;

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

	@Column(name = "SOURCE")
	private String source;

	@Column(name = "SOURCE_TXN_ID")
	private String sourceTxnId;

	@Column(name = "BILLING_TXN_ID")
	private String billingTxnId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "ERROR_CODE")
	private String errorCode;

	@Column(name = "ERROR_DESC")
	private String errorDesc;

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

	@Column(name = "REMARKS")
	private String Remarks;

	@Column(name = "BU_ID")
	private String buId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "MODIFIED_DATE")
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getMsiSdn() {
		return msiSdn;
	}

	public void setMsiSdn(String msiSdn) {
		this.msiSdn = msiSdn;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBillingPaymentType() {
		return billingPaymentType;
	}

	public void setBillingPaymentType(String billingPaymentType) {
		this.billingPaymentType = billingPaymentType;
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

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
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

	public String getBillingTxnId() {
		return billingTxnId;
	}

	public void setBillingTxnId(String billingTxnId) {
		this.billingTxnId = billingTxnId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
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
		return "PaymentTxnDetails [ID=" + ID + ", jobId=" + jobId + ", recordId=" + recordId + ", txnId=" + txnId
				+ ", msiSdn=" + msiSdn + ", custCode=" + custCode + ", amount=" + amount + ", currency=" + currency
				+ ", billingPaymentType=" + billingPaymentType + ", bankName=" + bankName + ", paymentType="
				+ paymentType + ", paymentReason=" + paymentReason + ", paymentDate=" + paymentDate + ", corporateId="
				+ corporateId + ", customerType=" + customerType + ", source=" + source + ", sourceTxnId=" + sourceTxnId
				+ ", billingTxnId=" + billingTxnId + ", status=" + status + ", errorCode=" + errorCode + ", errorDesc="
				+ errorDesc + ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3 + ", extAtr4="
				+ extAtr4 + ", extAtr5=" + extAtr5 + ", Remarks=" + Remarks + ", buId=" + buId + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate="
				+ modifiedDate + "]";
	}

}
