package com.digi.crm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digi.crm.constant.ExceptionConstant;
import com.digi.crm.constant.PayCurrency;
import com.digi.crm.constant.PayTypeConstant;
import com.digi.crm.constant.SourceConstant;
import com.digi.crm.constant.StatusConstant;
import com.digi.crm.dto.AccountDetails;
import com.digi.crm.dto.AdjustAccountDetails;
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
import com.digi.crm.exception.PaymentTxnException;
import com.digi.crm.model.CustomerProfile;
import com.digi.crm.model.FileLog;
import com.digi.crm.model.LookUpMaster;
import com.digi.crm.model.PaymentBatchDetails;
import com.digi.crm.model.PaymentTxnDetails;
import com.digi.crm.repository.CustomerProfileRepository;
import com.digi.crm.repository.FileLogRepository;
import com.digi.crm.repository.LookupMasterRepository;
import com.digi.crm.repository.PaymentBatchdetailsRepository;
import com.digi.crm.repository.PaymentTxndetailsRepository;
import com.digi.crm.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentTxndetailsRepository paymentTxndetailsRepository;

	@Autowired
	private FileLogRepository fileLogRepository;
	
	@Autowired
	private PaymentBatchdetailsRepository paymentBatchdetailsRepository;

	@Autowired
	private CustomerProfileRepository customerProfileRepository;

	@Autowired
	private LookupMasterRepository lookupMasterRepository;
	
	private static final Logger LOGGGER=LoggerFactory.getLogger(PaymentServiceImpl.class);

	@Override
	public PaymentDetailsResponse savePaymentDetails(PaymentDetailsRequest paymentDetailsRequest) {

		PaymentDetailsResponse paymentDetailsResponse = new PaymentDetailsResponse();

		StringJoiner txnIds = new StringJoiner(",");

		if (paymentDetailsRequest.getAccountDetails().size() > 0) {
			try {
				for (AccountDetails accountDetail : paymentDetailsRequest.getAccountDetails()) {
					PaymentTxnDetails paymentTxnDetails = new PaymentTxnDetails();
					paymentTxnDetails.setSource(paymentDetailsRequest.getSourceSystem());
					paymentTxnDetails.setSourceTxnId(paymentDetailsRequest.getSourceTxnId());
					paymentTxnDetails.setBuId(paymentDetailsRequest.getBuId() != null ? paymentDetailsRequest.getBuId()
							: SourceConstant.GP);
					paymentTxnDetails.setBankName(paymentDetailsRequest.getBankName());
					paymentTxnDetails.setPaymentType(paymentDetailsRequest.getPaymentType());
					paymentTxnDetails.setPaymentReason(paymentDetailsRequest.getPaymentReason());
					paymentTxnDetails.setCreatedBy(paymentDetailsRequest.getUserId());
					paymentTxnDetails.setCorporateId(paymentDetailsRequest.getCorporateId());
					paymentTxnDetails.setCustomerType(paymentDetailsRequest.getCustomerType());
					paymentTxnDetails.setPaymentDate(paymentDetailsRequest.getPaymentDate());
					paymentTxnDetails.setExtAtr1(paymentDetailsRequest.getExtAtr1());
					paymentTxnDetails.setExtAtr2(paymentDetailsRequest.getExtAtr2());
					paymentTxnDetails.setExtAtr3(paymentDetailsRequest.getExtAtr3());
					paymentTxnDetails.setExtAtr4(paymentDetailsRequest.getExtAtr4());
					paymentTxnDetails.setExtAtr5(paymentDetailsRequest.getExtAtr5());

					// BSCS_PaymentType
					/*if (paymentDetailsRequest.getBillingPaymentType().equalsIgnoreCase(PayTypeConstant.LOCAL_SD)
							|| (paymentDetailsRequest.getBillingPaymentType().equalsIgnoreCase(PayTypeConstant.IR_SD)))
						paymentTxnDetails.setBillingPaymentType(PayCurrency.CE2DP);
					else if (paymentDetailsRequest.getBillingPaymentType()
							.equalsIgnoreCase(PayTypeConstant.LOCAL_PAYMENT)
							|| (paymentDetailsRequest.getBillingPaymentType()
									.equalsIgnoreCase(PayTypeConstant.IR_PAYMENT)))
						paymentTxnDetails.setBillingPaymentType(PayCurrency.CE2CO);*/

					// status-SBMITTED
					paymentTxnDetails.setStatus(StatusConstant.STATUS_SUBMITTED);

					// BCS-TXN-ID
					if (SourceConstant.SCRATCH_CARD.equalsIgnoreCase(paymentDetailsRequest.getSourceSystem()))
						paymentTxnDetails
								.setBillingTxnId(SourceConstant.SC + "-" + paymentDetailsRequest.getSourceTxnId());
					else if (SourceConstant.ERS.equalsIgnoreCase(paymentDetailsRequest.getSourceSystem()))
						paymentTxnDetails.setBillingTxnId(
								SourceConstant.ERS + "-" + paymentDetailsRequest.getSourceTxnId().substring(0, 1)
										+ LocalDate.now().getYear() + "-" + paymentDetailsRequest.getSourceTxnId());
					else if (SourceConstant.RMS.equalsIgnoreCase(paymentDetailsRequest.getSourceSystem()))
						paymentTxnDetails
								.setBillingTxnId(SourceConstant.RMS + "-" + paymentDetailsRequest.getSourceTxnId());
					else if (SourceConstant.BANK.equalsIgnoreCase(paymentDetailsRequest.getSourceSystem()))
						paymentTxnDetails.setBillingTxnId(paymentDetailsRequest.getBankName().substring(0, 2) + "-"
								+ paymentDetailsRequest.getSourceTxnId());
					else if (SourceConstant.CCPS.equalsIgnoreCase(paymentDetailsRequest.getSourceSystem()))
						paymentTxnDetails.setBillingTxnId(
								paymentDetailsRequest.getBankName().substring(0, 2) + "-" + LocalDateTime.now());

					// validate msisdn/custcode is present
					if (null != accountDetail.getMsisdn() || null != accountDetail.getCustCode()) {
						// Checking Status MSISDN /Custcode Exists in DB or Not

						if (!(StatusConstant.STATUS_SUCCESS.equalsIgnoreCase(
								searchCustCodeMsisdn(accountDetail.getMsisdn(), accountDetail.getCustCode())
										.getStatus()))) {
							throw new PaymentTxnException(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC,
									ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);
						}
						// pt contains local then BDT else TK2
						if (paymentTxnDetails.getPaymentType().startsWith(PayTypeConstant.LOCAL))
							paymentTxnDetails.setCurrency(PayCurrency.BDT);
						else if (paymentTxnDetails.getPaymentType().startsWith(PayTypeConstant.IR))
							paymentTxnDetails.setCurrency(PayCurrency.TK2);
						else
							paymentTxnDetails.setCurrency(accountDetail.getCurrency());
						paymentTxnDetails.setMsiSdn(accountDetail.getMsisdn());
						paymentTxnDetails.setAmount(accountDetail.getAmount());
						paymentTxnDetails.setCustCode(accountDetail.getCustCode());
						txnIds.add(paymentTxndetailsRepository.save(paymentTxnDetails).getID().toString());

					} else {
						throw new PaymentTxnException(ExceptionConstant.MSISDN_OR_CUSTCODE_REQUIRED_EC,
								ExceptionConstant.MSISDN_OR_CUSTCODE_REQUIRED_ED);

					}

				}
				paymentDetailsResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				paymentDetailsResponse.setErrorCode("");
				paymentDetailsResponse.setErrorDesc("");
				// Add Txn Id
				paymentDetailsResponse.setTxnIds(txnIds.toString());

				if (paymentDetailsRequest.getAccountDetails().size() <= 1) {
					if (SourceConstant.SCRATCH_CARD == paymentDetailsRequest.getSourceSystem()
							|| SourceConstant.RMS == paymentDetailsRequest.getSourceSystem()) {
						///// source is CIMS,RMS then call ESB API

					}
				}

			} catch (PaymentTxnException paymentTxnException) {
				paymentDetailsResponse.setStatus(StatusConstant.STATUS_FAILURE);
				paymentDetailsResponse.setErrorCode(paymentTxnException.getErrorCode());
				paymentDetailsResponse.setErrorDesc(paymentTxnException.getMessage());
				LOGGGER.error(paymentTxnException.toString());
				
			} catch (Exception e) {
				paymentDetailsResponse.setStatus(StatusConstant.STATUS_FAILURE);
				paymentDetailsResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
				paymentDetailsResponse.setErrorDesc(e.getMessage());
				

			}
		} else {
			paymentDetailsResponse.setStatus(StatusConstant.STATUS_FAILURE);
			paymentDetailsResponse.setErrorCode(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC);
			paymentDetailsResponse.setErrorDesc(ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);
		}

		return paymentDetailsResponse;
	}

	@Override
	public AdjustmentDetailsResponse saveAdjustmentDetails(AdjustmentDetailsRequest adjustmentDetailsRequest) {

		AdjustmentDetailsResponse adjustmentDetailsResponse = new AdjustmentDetailsResponse();

		StringJoiner txnIds = new StringJoiner(",");

		try {
			for (AdjustAccountDetails adjustAccountDetails : adjustmentDetailsRequest.getAdjustAccountDetails()) {

				PaymentTxnDetails paymentTxnDetails = new PaymentTxnDetails();
				paymentTxnDetails.setSource(adjustmentDetailsRequest.getSourceSystem());
				paymentTxnDetails.setSourceTxnId(adjustmentDetailsRequest.getSourceTxnId());
				paymentTxnDetails.setBuId(adjustmentDetailsRequest.getBuId() != null ? adjustmentDetailsRequest.getBuId()
						: SourceConstant.GP);
				paymentTxnDetails.setBankName(adjustmentDetailsRequest.getBankName());
				paymentTxnDetails.setPaymentType(adjustmentDetailsRequest.getPaymentType());
				paymentTxnDetails.setPaymentReason(adjustmentDetailsRequest.getPaymentReason());
				paymentTxnDetails.setCreatedBy(adjustmentDetailsRequest.getUserId());
				
				//Hardcode-ID
				paymentTxnDetails.setCorporateId("1");
				paymentTxnDetails.setCustomerType("Individual");
				//Set to default-Current Date
				paymentTxnDetails.setPaymentDate(adjustmentDetailsRequest.getPaymentDate());
				
				paymentTxnDetails.setExtAtr1(adjustmentDetailsRequest.getExtAtr1());
				paymentTxnDetails.setExtAtr2(adjustmentDetailsRequest.getExtAtr2());
				paymentTxnDetails.setExtAtr3(adjustmentDetailsRequest.getExtAtr3());
				paymentTxnDetails.setExtAtr4(adjustmentDetailsRequest.getExtAtr4());
				paymentTxnDetails.setExtAtr5(adjustmentDetailsRequest.getExtAtr5());

				// validate msisdn/custcode is present && //Validate other MSISDN
				if (null != adjustAccountDetails.getMsisdn() || null != adjustAccountDetails.getCustCode() ||  null != adjustAccountDetails.getOthmsisdn()) {
					
					if (!(StatusConstant.STATUS_SUCCESS.equalsIgnoreCase(
							searchCustCodeMsisdn(adjustAccountDetails.getMsisdn(), adjustAccountDetails.getCustCode())
									.getStatus()))) {
						throw new PaymentTxnException(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC,
								ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);
					}
					// pt contains local then BDT else TK2
					if (paymentTxnDetails.getPaymentType().equalsIgnoreCase(PayTypeConstant.LOCAL))
						paymentTxnDetails.setCurrency(PayCurrency.BDT);
					else if (paymentTxnDetails.getPaymentType().equalsIgnoreCase(PayTypeConstant.IR))
						paymentTxnDetails.setCurrency(PayCurrency.TK2);
					else
						paymentTxnDetails.setCurrency(adjustAccountDetails.getCurrency());

					paymentTxnDetails.setMsiSdn(adjustAccountDetails.getMsisdn());
					paymentTxnDetails.setAmount(adjustAccountDetails.getAmount());
					paymentTxnDetails.setCustCode(adjustAccountDetails.getCustCode());
					txnIds.add(paymentTxndetailsRepository.save(paymentTxnDetails).getID().toString());

				} else {
					throw new PaymentTxnException(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC,
							ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);

				}

			}
			adjustmentDetailsResponse.setStatus(StatusConstant.STATUS_SUCCESS);
			adjustmentDetailsResponse.setErrorCode("");
			adjustmentDetailsResponse.setErrorDesc("");
			// Add Txn Id
			adjustmentDetailsResponse.setTxnIds(txnIds.toString());
			if (SourceConstant.SCRATCH_CARD == adjustmentDetailsRequest.getSourceSystem()
					|| SourceConstant.RMS == adjustmentDetailsRequest.getSourceSystem()) {
				///// source is CIMS,RMS then call ESB API

			}

		} catch (PaymentTxnException paymentTxnException) {
			adjustmentDetailsResponse.setStatus(StatusConstant.STATUS_FAILURE);
			adjustmentDetailsResponse.setErrorCode(paymentTxnException.getErrorCode());
			adjustmentDetailsResponse.setErrorDesc(paymentTxnException.getMessage());
		} catch (Exception e) {
			adjustmentDetailsResponse.setStatus(StatusConstant.STATUS_FAILURE);
			adjustmentDetailsResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			adjustmentDetailsResponse.setErrorDesc(e.getMessage());

		}

		return adjustmentDetailsResponse;
	}

	@Override
	public BatchPaymentResponse saveBatchPaymentDetails(BatchPaymentRequest request) throws Exception {
		StringJoiner txnIds = new StringJoiner(",");
		
		BatchPaymentResponse response = new BatchPaymentResponse();
		FileLog file = new FileLog();
		file.setBuId(request.getBuId());
		file.setFileName(request.getFileName());
		file.setJobName(request.getJobName());
		file.setCreatedBy(request.getUserId());
		file.setStatus(StatusConstant.STATUS_SUBMITTED);
		PaymentBatchDetails batchDetails = new PaymentBatchDetails();
		batchDetails.setBankName(request.getBankName());
		batchDetails.setPaymentType(request.getPaymentType());
		batchDetails.setPaymentReason(request.getPaymentReason());
		batchDetails.setPaymentDate(request.getPaymentDate());
		batchDetails.setCustomerType(request.getCustomerType());
		batchDetails.setCorporateId(request.getCorporateId());
		batchDetails.setRemarks(request.getRemarks());
		//batchDetails.setBuId(request.getBuId());
		batchDetails.setBuId(request.getBuId() != null ? request.getBuId()
				: SourceConstant.GP);
		batchDetails.setCreatedBy(request.getUserId());		
		try {
			Long id = fileLogRepository.save(file).getID();
			batchDetails.setJobId(id);
			paymentBatchdetailsRepository.save(batchDetails);
			response.setBatchId(id);
			response.setStatus(StatusConstant.STATUS_SUCCESS);
			response.setErrorCode("");
			response.setErrorDesc("");

		} catch (Exception e) {

			response.setStatus(StatusConstant.STATUS_FAILURE);
			response.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			response.setErrorDesc(e.getMessage());

		}

		return response;
	}

	@Override
	public AdjustBatchPaymentResponse saveAdjustBatchPayment(AdjustBatchPaymentRequest request) throws Exception {
		AdjustBatchPaymentResponse response = new AdjustBatchPaymentResponse();
		FileLog file = new FileLog();
		file.setBuId(request.getBuId());
		file.setFileName(request.getFileName());
		file.setJobName(request.getJobName());
		file.setCreatedBy(request.getUserId());

		PaymentBatchDetails batchDetails = new PaymentBatchDetails();
		batchDetails.setBankName(request.getBankName());
		batchDetails.setPaymentReason(request.getPaymentReason());
		batchDetails.setPaymentDate(request.getPaymentDate());
		//batchDetails.setCustomerType(request.getCustomerType());
		//batchDetails.setCorporateId(request.getCorporateId());
		batchDetails.setRemarks(request.getRemarks());
		batchDetails.setBuId(request.getBuId() != null ? request.getBuId()
				: SourceConstant.GP);		
		batchDetails.setCreatedBy(request.getUserId());
		try {
			Long id = fileLogRepository.save(file).getID();
			batchDetails.setJobId(id);
			paymentBatchdetailsRepository.save(batchDetails);	
			response.setBatchId(id);
			response.setStatus(StatusConstant.STATUS_SUCCESS);
			response.setErrorCode("");
			response.setErrorDesc("");

		} catch (Exception e) {

			response.setStatus(StatusConstant.STATUS_FAILURE);
			response.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			response.setErrorDesc(e.getMessage());

		}

		return response;
	}

	@Override
	public CustomProfileResponse searchCustCodeMsisdn(String msiSdn, String custCode) throws Exception {
		CustomProfileResponse customerProfileResponse = new CustomProfileResponse();

		try {

			if (null != msiSdn || null != custCode) {

				CustomerProfile custprofilelist = customerProfileRepository
						.findCustomerProfileBymsiSdnOrCustCode(msiSdn, custCode);

				if (null != custprofilelist) {
					customerProfileResponse.setCustCode(custprofilelist.getCustCode());
					customerProfileResponse.setMsisdn(custprofilelist.getMsiSdn());
					customerProfileResponse.setStatus(StatusConstant.STATUS_SUCCESS);
					customerProfileResponse.setId(custprofilelist.getID().toString());

				} else {

					customerProfileResponse.setCustCode(custprofilelist.getCustCode());
					customerProfileResponse.setMsisdn(custprofilelist.getMsiSdn());
					customerProfileResponse.setStatus(StatusConstant.STATUS_FAILURE);
					customerProfileResponse.setErrorCode(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC);
					customerProfileResponse.setErrorDesc(ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);

				}
			} else {
				customerProfileResponse.setStatus(StatusConstant.STATUS_FAILURE);
				customerProfileResponse.setErrorCode(ExceptionConstant.MSISDN_OR_CUSTCODE_REQUIRED_EC);
				customerProfileResponse.setErrorDesc(ExceptionConstant.MSISDN_OR_CUSTCODE_REQUIRED_ED);
			}

		} catch (Exception e) {
			customerProfileResponse.setStatus(StatusConstant.STATUS_FAILURE);
			customerProfileResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			customerProfileResponse.setErrorDesc(e.getMessage());

		}

		return customerProfileResponse;

	}

	

	@Override
	public List<LookupResponse> getLookupApiDetails(String parentLookupValue, String lookupGroup, String lookupName,
			String buId) throws Exception {
		
		
		List<LookupResponse> responseList = new ArrayList<LookupResponse>();
		// try {
		List<LookUpMaster> lookUpMasterList = lookupMasterRepository
				.findLookUpMasterListByParentLookupValueOrLookupGroupAndLookupNameAndBuId(parentLookupValue,
						lookupGroup, lookupName, buId);

		if (null != lookUpMasterList) {
			lookUpMasterList.forEach((lm)->{
				
				responseList.add(new LookupResponse(lm.getLookupValue(),lm.getLookupdisplayValue()));
				
			});
			
			// response.setStatus(StatusConstant.STATUS_SUCCESS);
			
			/*
			 * } else { response.setStatus(StatusConstant.STATUS_FAILURE);
			 * response.setLookupdisplayValue(lookUpMaster.getLookupdisplayValue());
			 * response.setLookupValue(lookUpMaster.getLookupValue());
			 * 
			 * } } catch (Exception e) { response.setStatus(StatusConstant.STATUS_FAILURE);
			 * response.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			 * response.setErrorDesc(e.getMessage());
			 */
		}
		return responseList;

	}

	
	 
	}
