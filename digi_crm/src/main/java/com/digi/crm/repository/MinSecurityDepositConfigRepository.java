package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.CurrencyConversionDetails;
import com.digi.crm.model.MinSecurityDepositConfig;

@Repository
public interface MinSecurityDepositConfigRepository extends JpaRepository<MinSecurityDepositConfig, Long> {

	List<MinSecurityDepositConfig> findMinSecurityDepositConfigListByBuIdAndCreatedByAndStatus(String buId,
			String userId, String statusActive);

	MinSecurityDepositConfig findMinSecurityDepositConfigById(Long id);

	/*MinSecurityDepositConfig findMinSecurityDepositConfigByAccountTypeAndCustomerTypeAndBuId(String accountType,
			String customerType, String buId);*/
	
	MinSecurityDepositConfig findMinSecurityDepositConfigByAccountTypeAndCustomerTypeAndBuId(String accountType,
			String customerType, String buId);

}
