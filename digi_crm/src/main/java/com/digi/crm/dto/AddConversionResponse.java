
package com.digi.crm.dto;

public class AddConversionResponse extends BaseResponse {
	
	private String txnIds;

	public String getTxnIds() {
		return txnIds;
	}

	public void setTxnIds(String txnIds) {
		this.txnIds = txnIds;
	}

	@Override
	public String toString() {
		return "AddCoversionResponse [txnIds=" + txnIds + "]";
	}

	

}
