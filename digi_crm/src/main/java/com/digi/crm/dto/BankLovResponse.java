
package com.digi.crm.dto;

import java.io.Serializable;
import java.util.List;

public class BankLovResponse implements Serializable {

	private List<String> bankName;

	public List<String> getBankName() {
		return bankName;
	}

	public void setBankName(List<String> bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankLovResponse [bankName=" + bankName + "]";
	}

	
	
}
