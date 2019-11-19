package com.digi.crm.dto;

public class ModifyNotificationConfigResponse extends BaseResponse  {

	private Long txnIds;

	public Long getTxnIds() {
		return txnIds;
	}

	public void setTxnIds(Long txnIds) {
		this.txnIds = txnIds;
	}

	@Override
	public String toString() {
		return "ModifyNotificationConfigResponse [txnIds=" + txnIds + "]";
	}
	
}
