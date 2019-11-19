package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.BankFtpConfig;

@Repository
public interface BankFtpConfigRepository extends JpaRepository<BankFtpConfig, Long>{

	BankFtpConfig findBankFtpConfigByBuIdAndBankName(String buId,String bankName);

	BankFtpConfig findBankFtpConfigByBuIdAndBankNameAndPaymentType(String buId, String bankName, String paymentType);

	BankFtpConfig findBankPaymentTypeMappingByBuIdAndBankNameAndPaymentType(String buId, String bankName,
			String paymentType);
	
	List<BankFtpConfig> deleteByBankFtpIdNotIn(List<Long> ids);

	int deleteByBankNameAndBankFtpIdNotIn(String bankName, List<Long> payMapList2);
}
