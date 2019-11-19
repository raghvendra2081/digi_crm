package com.digi.crm.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.CustomerAttributes;

@Repository
public interface CustomerAttibutesRepository extends JpaRepository<CustomerAttributes, Long> {

	List<CustomerAttributes> findCustomerAttributesListByStatusAndBuIdAndMsiSdnOrCustCode(String status, String buId,
			String msisdn, String custCode);

	CustomerAttributes findCustomerAttributesByBuIdAndCreatedByAndCustCodeOrMsiSdnAndAttrName(String buId,
			String userId, String custCode, String msiSdn, String attrName);

	CustomerAttributes findCustomerAttributesByBuIdAndCreatedByAndAttrNameAndMsiSdnOrCustCode(String buId,
			String userId, String attrName, String msiSdn, String custCode);

	CustomerAttributes findCustomerAttributesByBuIdAndCreatedByAndAttrNameAndMsiSdn(String buId, String userId,
			String attrName, String msiSdn);

	CustomerAttributes findCustomerAttributesByBuIdAndCreatedByAndAttrNameAndCustCode(String buId, String userId,
			String attrName, String custCode);

}
