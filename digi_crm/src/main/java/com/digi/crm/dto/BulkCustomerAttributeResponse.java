
package com.digi.crm.dto;

public class BulkCustomerAttributeResponse extends BaseResponse {
	
	
	private Long batchId;

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	
	@Override
	public String toString() {
		return "BulkCustomerAttributeResponse [batchId=" + batchId + "]";
	}


	
}
