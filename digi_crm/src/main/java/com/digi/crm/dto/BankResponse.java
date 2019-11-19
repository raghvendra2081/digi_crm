
package com.digi.crm.dto;

public class BankResponse extends BaseResponse {
	
	private String txnIds;

	public String getTxnIds() {
		return txnIds;
	}

	public void setTxnIds(String txnIds) {
		this.txnIds = txnIds;
	}

	@Override
	public String toString() {
		return "BankResponse [txnIds=" + txnIds + "]";
	}


	
	
}
