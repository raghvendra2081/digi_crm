/**
 * 
 */
package com.digi.crm.exception;

/**
 * @author Narendra Gangwar
 * PaymentTxnException.java
 * Sep 23, 2019
 */
public class PaymentTxnException extends Throwable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String message="PaymentTxnException Occured";
	private String errorCode="";
	
	public PaymentTxnException(String message, String errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "PaymentTxnException [message=" + message + ", errorCode=" + errorCode + "]";
	}
	
	

}
