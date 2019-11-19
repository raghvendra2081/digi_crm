package com.digi.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Narendra Gangwar
 * CcpsApplication.java
 * Sep 10, 2019
 */
@SpringBootApplication
public class CcpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcpsApplication.class, args);
	
		System.out.println(System.getProperty("user.dir") );
		
	}

}
