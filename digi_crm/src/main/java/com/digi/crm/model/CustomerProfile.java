package com.digi.crm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "CUSTOMER_PROFILE")
public class CustomerProfile {

	/*
	 * @Id
	 * 
	 * @NotNull
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	 * "CUSTOMER_PROFILE_GENERATOR")
	 * 
	 * @SequenceGenerator(name = "CUSTOMER_PROFILE_GENERATOR", sequenceName =
	 * "CUSTOMER_PROFILE_SEQUENCE")
	 */
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;

	@Column(name = "ACCT_ID")
	private Long acctId;

	@NotNull
	@Column(name = "MSISDN")
	private String msiSdn;

	@NotNull
	@Column(name = "CUST_CODE")
	private String custCode;

	@Column(name = "CUST_ID")
	private String custId;

	@Column(name = "CONTRACT_ID")
	private String contractId;

	@NotNull
	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@NotNull
	@Column(name = "IMSI")
	private String imsi;

	@Column(name = "IMEI")
	private String imei;

	@NotNull
	@Column(name = "SIM_NO")
	private String sinNo;

	@NotNull
	@Column(name = "CIRCLE_CODE")
	private String circleCode;

	@NotNull
	@Column(name = "CATEGORY")
	private String category;

	@NotNull
	@Column(name = "SUB_CATEGORY")
	private String subCategory;

	@Column(name = "RATE_PLAN")
	private String ratePlan;

	@NotNull
	@Column(name = "RATE_PLAN_ID")
	private String ratePlanId;

	@NotNull
	@Column(name = "CORPORATE_ID")
	private String corporateId;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "ACT_DATE")
	private LocalDateTime actDate;

	@Column(name = "EXP_DATE")
	private LocalDateTime expDate;

	@Column(name = "ALT_CONTACT_NO")
	private String altContactNo;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "BILL_CYCLE") // st
	private Integer billCycle;

	@Column(name = "DEFUALT_CREDIT_LIMIT")
	private double defaultCreditLimit;

	@Column(name = "EXT_CREDIT_LIMIT")
	private double extCreditLimit;

	@Column(name = "TEMP_CREDIT_LIMIT")
	private double tempCreditLimit;

	@Column(name = "SECURITY_DEPOSIT")
	private double securityDeposit;

	@Column(name = "IR_SECURITY_DEPOSIT") // end
	private double irSecurityDeposit;

	@Column(name = "DUE_DATE_LIMIT")
	private String dueDateLimit;

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

	@Column(name = "EXT_ATR_6")
	private String extAtr6;

	@Column(name = "EXT_ATR_7")
	private String extAtr7;

	@Column(name = "EXT_ATR_8")
	private String extAtr8;

	@Column(name = "EXT_ATR_9")
	private String extAtr9;

	@Column(name = "EXT_ATR_10")
	private String extAtr10;

	@NotNull
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


	@Override
	public String toString() {
		return "CustomerProfile [ID=" + ID + ", acctId=" + acctId + ", msiSdn=" + msiSdn + ", custCode=" + custCode
				+ ", custId=" + custId + ", contractId=" + contractId + ", customerName=" + customerName + ", imsi="
				+ imsi + ", imei=" + imei + ", sinNo=" + sinNo + ", circleCode=" + circleCode + ", category=" + category
				+ ", subCategory=" + subCategory + ", ratePlan=" + ratePlan + ", ratePlanId=" + ratePlanId
				+ ", corporateId=" + corporateId + ", status=" + status + ", remarks=" + remarks + ", actDate="
				+ actDate + ", expDate=" + expDate + ", altContactNo=" + altContactNo + ", emailId=" + emailId
				+ ", billCycle=" + billCycle + ", defaultCreditLimit=" + defaultCreditLimit + ", extCreditLimit="
				+ extCreditLimit + ", tempCreditLimit=" + tempCreditLimit + ", securityDeposit=" + securityDeposit
				+ ", irSecurityDeposit=" + irSecurityDeposit + ", dueDateLimit=" + dueDateLimit + ", extAtr1=" + extAtr1
				+ ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3 + ", extAtr4=" + extAtr4 + ", extAtr5=" + extAtr5
				+ ", extAtr6=" + extAtr6 + ", extAtr7=" + extAtr7 + ", extAtr8=" + extAtr8 + ", extAtr9=" + extAtr9
				+ ", extAtr10=" + extAtr10 + ", buId=" + buId + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getAcctId() {
		return acctId;
	}

	public void setAcctId(Long acctId) {
		this.acctId = acctId;
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

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSinNo() {
		return sinNo;
	}

	public void setSinNo(String sinNo) {
		this.sinNo = sinNo;
	}

	public String getCircleCode() {
		return circleCode;
	}

	public void setCircleCode(String circleCode) {
		this.circleCode = circleCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getRatePlan() {
		return ratePlan;
	}

	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}

	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public String getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(String corporateId) {
		this.corporateId = corporateId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getActDate() {
		return actDate;
	}

	public void setActDate(LocalDateTime actDate) {
		this.actDate = actDate;
	}

	public LocalDateTime getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDateTime expDate) {
		this.expDate = expDate;
	}

	public String getAltContactNo() {
		return altContactNo;
	}

	public void setAltContactNo(String altContactNo) {
		this.altContactNo = altContactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getBillCycle() {
		return billCycle;
	}

	public void setBillCycle(Integer billCycle) {
		this.billCycle = billCycle;
	}

	public double getDefaultCreditLimit() {
		return defaultCreditLimit;
	}

	public void setDefaultCreditLimit(double defaultCreditLimit) {
		this.defaultCreditLimit = defaultCreditLimit;
	}

	public double getExtCreditLimit() {
		return extCreditLimit;
	}

	public void setExtCreditLimit(double extCreditLimit) {
		this.extCreditLimit = extCreditLimit;
	}

	public double getTempCreditLimit() {
		return tempCreditLimit;
	}

	public void setTempCreditLimit(double tempCreditLimit) {
		this.tempCreditLimit = tempCreditLimit;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public double getIrSecurityDeposit() {
		return irSecurityDeposit;
	}

	public void setIrSecurityDeposit(double irSecurityDeposit) {
		this.irSecurityDeposit = irSecurityDeposit;
	}

	public String getDueDateLimit() {
		return dueDateLimit;
	}

	public void setDueDateLimit(String dueDateLimit) {
		this.dueDateLimit = dueDateLimit;
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

	public String getExtAtr6() {
		return extAtr6;
	}

	public void setExtAtr6(String extAtr6) {
		this.extAtr6 = extAtr6;
	}

	public String getExtAtr7() {
		return extAtr7;
	}

	public void setExtAtr7(String extAtr7) {
		this.extAtr7 = extAtr7;
	}

	public String getExtAtr8() {
		return extAtr8;
	}

	public void setExtAtr8(String extAtr8) {
		this.extAtr8 = extAtr8;
	}

	public String getExtAtr9() {
		return extAtr9;
	}

	public void setExtAtr9(String extAtr9) {
		this.extAtr9 = extAtr9;
	}

	public String getExtAtr10() {
		return extAtr10;
	}

	public void setExtAtr10(String extAtr10) {
		this.extAtr10 = extAtr10;
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
