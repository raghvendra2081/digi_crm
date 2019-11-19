package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.CustomerProfile;
import com.digi.crm.model.FileTypeRuleAttribute;

@Repository
public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Long>{
	
	CustomerProfile findCustomerProfileBymsiSdnOrCustCode(String custCode,String msiSdn);
	

}
