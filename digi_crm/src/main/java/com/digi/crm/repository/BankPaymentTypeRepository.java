package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.BankPaymentTypeMapping;

@Repository
public interface BankPaymentTypeRepository extends JpaRepository<BankPaymentTypeMapping, Long>{

	List<BankPaymentTypeMapping> findBankPaymentTypeMappingListByBuIdAndBankName(String buId, String bankName);
	
	BankPaymentTypeMapping findBankPaymentTypeMappingByBuIdAndBankName(String buId,String bankName);

	BankPaymentTypeMapping findBankPaymentTypeMappingByBuIdAndBankNameAndPaymentType(String buId, String bankName,
			String paymentType);
	
	List<BankPaymentTypeMapping> deleteByBankPtIdNotIn(List<Long> ids);

	int deleteByBankNameAndBankPtIdNotIn(String bankName, List<Long> payMapList);
}
