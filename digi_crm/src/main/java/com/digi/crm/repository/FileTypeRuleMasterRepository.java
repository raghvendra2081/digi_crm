package com.digi.crm.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digi.crm.model.FileTypeRuleMaster;

/**
 * @author Narendra Gangwar
 * FileTypeRuleMasterRepository.java
 * Sep 10, 2019
 */
public interface FileTypeRuleMasterRepository extends JpaRepository<FileTypeRuleMaster,BigInteger> {

}
