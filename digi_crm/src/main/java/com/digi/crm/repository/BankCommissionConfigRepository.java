package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.BankCommissionConfig;

@Repository
public interface BankCommissionConfigRepository extends JpaRepository<BankCommissionConfig, Long> {
	
	BankCommissionConfig findBankCommissionConfigByBuIdAndBankName(String buId,String bankName);

	BankCommissionConfig findBankCommissionConfigByBuIdAndBankNameAndPaymentType(String buId, String bankName, String paymentType);

	BankCommissionConfig findBankPaymentTypeMappingByBuIdAndBankNameAndPaymentType(String buId, String bankName,
			String paymentType);
	
	
	List<BankCommissionConfig> deleteByBankCommIdNotIn(List<Long> ids);

	int deleteByBankNameAndBankCommIdNotIn(String bankName, List<Long> payMapList1);
	

}
