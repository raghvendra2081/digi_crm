package com.digi.crm.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digi.crm.model.JobMaster;

/**
 * @author Narendra Gangwar
 * JobMasterRepository.java
 * Sep 10, 2019
 */
public interface JobMasterRepository extends JpaRepository<JobMaster,BigInteger> {
	
	JobMaster findJobMasterListByjobName(String jobName);
	
	JobMaster findJobMasterListByjobNameAndBuIdAndStatus(String jobName,String buId,String status);

}
