package com.digi.crm.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digi.crm.model.FileTypeRuleAttribute;

/**
 * @author Narendra Gangwar
 * FileTypeRuleAttributeRepository.java
 * Sep 10, 2019
 */
public interface FileTypeRuleAttributeRepository  extends JpaRepository<FileTypeRuleAttribute,BigInteger> {

	List<FileTypeRuleAttribute> findFileTypeRuleAttributeListByfileType(String filetype);
	
	List<FileTypeRuleAttribute> findFileTypeRuleAttributeListByfileTypeAndBuIdAndStatus(String filetype,String buId,String status);
	
}
