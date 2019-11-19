package com.digi.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.PaymentTxnDetails;

@Repository
public interface PaymentTxndetailsRepository extends JpaRepository<PaymentTxnDetails, Long>{
	
	//PaymentTxnDetails save(PaymentTxnDetails paymentTxnDetails);

}
