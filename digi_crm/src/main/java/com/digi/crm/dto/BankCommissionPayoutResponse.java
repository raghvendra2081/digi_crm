
package com.digi.crm.dto;

import java.io.Serializable;

public class BankCommissionPayoutResponse implements Serializable {

	private String bankName;
	private String commType;
	private String paymentType;
	private String commLogic;
	private Double commAmount;
	private String genDate;
	private int totalCount;
	private Double totalAmount;
	
	@Override
	public String toString() {
		return "BankCommissionPayoutResponse [bankName=" + bankName + ", commType=" + commType + ", paymentType="
				+ paymentType + ", commLogic=" + commLogic + ", commAmount=" + commAmount + ", genDate=" + genDate
				+ ", totalCount=" + totalCount + ", totalAmount=" + totalAmount + "]";
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCommType() {
		return commType;
	}
	public void setCommType(String commType) {
		this.commType = commType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCommLogic() {
		return commLogic;
	}
	public void setCommLogic(String commLogic) {
		this.commLogic = commLogic;
	}
	public Double getCommAmount() {
		return commAmount;
	}
	public void setCommAmount(Double commAmount) {
		this.commAmount = commAmount;
	}
	public String getGenDate() {
		return genDate;
	}
	public void setGenDate(String genDate) {
		this.genDate = genDate;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
