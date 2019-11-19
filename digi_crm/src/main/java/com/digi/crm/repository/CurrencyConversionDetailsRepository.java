package com.digi.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digi.crm.model.CurrencyConversionDetails;

@Repository
public interface CurrencyConversionDetailsRepository extends JpaRepository<CurrencyConversionDetails, Long>{

	List<CurrencyConversionDetails> findCurrencyConversionDetailsListByfromCurrencyAndToCurrencyAndCreatedByAndBuIdAndStatus(
			String fromCurrency, String toCurrency, String userId, String buId, String status);

	CurrencyConversionDetails findCurrencyConversionDetailsById(Long Id);

	CurrencyConversionDetails findCurrencyConversionDetailsByFromCurrencyAndToCurrencyAndBuIdAndCreatedBy(String fromCurrency,
			String toCurrency, String buId, String userId);

	
}
