package com.digi.crm.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.digi.crm.dto.AdjustBatchPaymentRequest;
import com.digi.crm.dto.AdjustBatchPaymentResponse;
import com.digi.crm.dto.AdjustmentDetailsRequest;
import com.digi.crm.dto.AdjustmentDetailsResponse;
import com.digi.crm.dto.BatchPaymentRequest;
import com.digi.crm.dto.BatchPaymentResponse;
import com.digi.crm.dto.CustomProfileResponse;
import com.digi.crm.dto.LookupResponse;
import com.digi.crm.dto.PaymentDetailsRequest;
import com.digi.crm.dto.PaymentDetailsResponse;

@Service
public interface PaymentService {

	public PaymentDetailsResponse savePaymentDetails(PaymentDetailsRequest paymentDetailsRequest) throws Exception;
	
	public AdjustmentDetailsResponse saveAdjustmentDetails(AdjustmentDetailsRequest adjustmentDetailsRequest) throws Exception;

	public BatchPaymentResponse saveBatchPaymentDetails(BatchPaymentRequest request) throws Exception;
	
	public AdjustBatchPaymentResponse saveAdjustBatchPayment(AdjustBatchPaymentRequest request) throws Exception;
	
	public CustomProfileResponse searchCustCodeMsisdn(String msiSdn,String custCode) throws Exception;
	
	public List<LookupResponse> getLookupApiDetails(String parentLookupValue,String lookupGroup,String lookupName,String buId) throws Exception;
	
	
}
