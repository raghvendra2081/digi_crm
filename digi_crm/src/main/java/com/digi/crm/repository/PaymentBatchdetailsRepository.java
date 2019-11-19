package com.digi.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.PaymentBatchDetails;

@Repository
public interface PaymentBatchdetailsRepository extends JpaRepository<PaymentBatchDetails, Long>{

}
