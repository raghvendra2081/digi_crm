package com.digi.crm.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class AdjustmentDetailsRequest extends BaseRequest{
	
	private String buId;
	private String bankName;
	private String paymentType;
	private String paymentReason;
	private String userId;
	/*private String corporateId;
	private String customerType;*/
	private LocalDateTime paymentDate; //Date
	private String extAtr1;
	private String extAtr2;
	private String extAtr3;
	private String extAtr4;
	private String extAtr5;
	private String remarks;
	
	/*private String extAtr6;
	private String extAtr7;
	private String extAtr8;
	private String extAtr9;
	private String extAtr10;*/
	
	@NotNull
	private ArrayList<AdjustAccountDetails> adjustAccountDetails; //validate minimum record

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

	public String getPaymentReason() {
		return paymentReason;
	}

	public void setPaymentReason(String paymentReason) {
		this.paymentReason = paymentReason;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	/*public String getCorporateId() {
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
	}*/


	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
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
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public ArrayList<AdjustAccountDetails> getAdjustAccountDetails() {
		return adjustAccountDetails;
	}

	public void setAdjustAccountDetails(ArrayList<AdjustAccountDetails> adjustAccountDetails) {
		this.adjustAccountDetails = adjustAccountDetails;
	}

	@Override
	public String toString() {
		return "AdjustmentDetailsRequest [buId=" + buId + ", bankName=" + bankName + ", paymentType=" + paymentType
				+ ", paymentReason=" + paymentReason + ", userId=" + userId + ", paymentDate=" + paymentDate
				+ ", extAtr1=" + extAtr1 + ", extAtr2=" + extAtr2 + ", extAtr3=" + extAtr3 + ", extAtr4=" + extAtr4
				+ ", extAtr5=" + extAtr5 + ", remarks=" + remarks + ", adjustAccountDetails=" + adjustAccountDetails
				+ "]";
	}


	
	
	
}
