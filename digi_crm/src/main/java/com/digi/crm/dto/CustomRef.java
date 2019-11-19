/**
 * 
 */
package com.digi.crm.dto;

import java.io.Serializable;

/**
 * @author Narendra Gangwar
 * CustomRef.java
 * Sep 20, 2019
 */
public class CustomRef implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String key;
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "CustomRef [key=" + key + ", value=" + value + "]";
	}
	
	

}
