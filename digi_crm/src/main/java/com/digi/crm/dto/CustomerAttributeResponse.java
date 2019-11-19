package com.digi.crm.dto;

public class CustomerAttributeResponse extends BaseResponse {

	private long txnIds;
	
	public long getTxnIds() {
		return txnIds;
	}

	public void setTxnIds(long txnIds) {
		this.txnIds = txnIds;
	};
	

	@Override
	public String toString() {
		return "CustomerAttributeResponse [txnIds=" + txnIds + "]";
	}

	
}
