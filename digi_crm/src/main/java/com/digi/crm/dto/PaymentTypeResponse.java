
package com.digi.crm.dto;

import java.io.Serializable;
import java.util.List;

public class PaymentTypeResponse implements Serializable {

	private List<String> paymentType;

	public List<String> getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(List<String> paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "PaymentTypeResponse [paymentType=" + paymentType + "]";
	}

	
}
