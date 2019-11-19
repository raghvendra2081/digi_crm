
package com.digi.crm.dto;

public class SecurityDepositRequest {
	
	private String buId;
	private String userId;
	private String accountType;
	private String customerType;
	private double amount;
	private String currency;  //Always sent BDT
	
	
	@Override
	public String toString() {
		return "SecurityDepositRequest [buId=" + buId + ", userId=" + userId + ", accountType=" + accountType
				+ ", customerType=" + customerType + ", amount=" + amount + ", currency=" + currency + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
