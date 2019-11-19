package com.digi.crm.dto;

public class SearchDepositResponse  {

	private String accountType;
	private String customerType;
	private double amount;
	private String currency;
	
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
	
	@Override
	public String toString() {
		return "SearchDepositResponse [accountType=" + accountType + ", customerType=" + customerType + ", amount="
				+ amount + ", currency=" + currency + "]";
	}

	
}
