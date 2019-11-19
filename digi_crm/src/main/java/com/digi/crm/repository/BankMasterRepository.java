package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.BankMaster;

@Repository
public interface BankMasterRepository extends JpaRepository<BankMaster, Long> {

	List<BankMaster> findBankMasterByBuId(String buId);
	
	BankMaster findBankMasterByBuIdAndBankName(String buId,String bankName);
	
	

}
