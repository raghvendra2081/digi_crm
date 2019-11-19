package com.digi.crm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digi.crm.constant.ExceptionConstant;
import com.digi.crm.constant.PayCurrency;
import com.digi.crm.constant.SourceConstant;
import com.digi.crm.constant.StatusConstant;
import com.digi.crm.dto.AddConversionRequest;
import com.digi.crm.dto.AddConversionResponse;
import com.digi.crm.dto.BankCommissionPayoutResponse;
import com.digi.crm.dto.BankDetailRequest;
import com.digi.crm.dto.BankDetailResponse;
import com.digi.crm.dto.BankLovResponse;
import com.digi.crm.dto.BankResponse;
import com.digi.crm.dto.BulkCustomerAttributeRequest;
import com.digi.crm.dto.BulkCustomerAttributeResponse;
import com.digi.crm.dto.CustomerAttributeRequest;
import com.digi.crm.dto.CustomerAttributeResponse;
import com.digi.crm.dto.ModifyNotificationConfigRequest;
import com.digi.crm.dto.ModifyNotificationConfigResponse;
import com.digi.crm.dto.PaymentTypeResponse;
import com.digi.crm.dto.SearchConversionResponse;
import com.digi.crm.dto.SearchCustomerAttributeResponse;
import com.digi.crm.dto.SearchDepositResponse;
import com.digi.crm.dto.SearchNotificationResponse;
import com.digi.crm.dto.SecurityDepositRequest;
import com.digi.crm.dto.SecurityDepositResponse;
import com.digi.crm.dto.bankPaymentListdetails;
import com.digi.crm.model.BankCommissionConfig;
import com.digi.crm.model.BankCommissionPayout;
import com.digi.crm.model.BankFtpConfig;
import com.digi.crm.model.BankMaster;
import com.digi.crm.model.BankPaymentTypeMapping;
import com.digi.crm.model.CurrencyConversionDetails;
import com.digi.crm.model.CustomerAttributes;
import com.digi.crm.model.FileLog;
import com.digi.crm.model.MinSecurityDepositConfig;
import com.digi.crm.model.NotificationTemplate;
import com.digi.crm.model.PaymentBatchDetails;
import com.digi.crm.model.PaymentTxnDetails;
import com.digi.crm.repository.BankCommissionConfigRepository;
import com.digi.crm.repository.BankCommissionPayoutRepository;
import com.digi.crm.repository.BankFtpConfigRepository;
import com.digi.crm.repository.BankMasterRepository;
import com.digi.crm.repository.BankPaymentTypeRepository;
import com.digi.crm.repository.CurrencyConversionDetailsRepository;
import com.digi.crm.repository.CustomerAttibutesRepository;
import com.digi.crm.repository.FileLogRepository;
import com.digi.crm.repository.MinSecurityDepositConfigRepository;
import com.digi.crm.repository.NotificationTemplateRepository;
import com.digi.crm.repository.PaymentBatchdetailsRepository;
import com.digi.crm.repository.PaymentTxndetailsRepository;
import com.digi.crm.service.PaymentLovService;
import com.digi.crm.service.PaymentService;

@Service
public class PaymentLovServiceImpl implements PaymentLovService {

	/*
	 * @PersistenceContext private LocalContainerEntityManagerFactoryBean
	 * entityManagerFactory;
	 */

	private static final Logger LOGGGER = LoggerFactory.getLogger(PaymentLovServiceImpl.class);

	@Autowired
	private BankPaymentTypeRepository bankPaymentTypeRepository;

	@Autowired
	private BankMasterRepository bankMasterRepository;

	@Autowired
	private BankCommissionConfigRepository bankCommissionConfigRepository;

	@Autowired
	private BankFtpConfigRepository bankFtpConfigRepository;

	@Autowired
	private CurrencyConversionDetailsRepository currencyConversionDetailsRepository;

	@Autowired
	private MinSecurityDepositConfigRepository minSecurityDepositConfigRepository;

	@Autowired
	private CustomerAttibutesRepository customerAttibutesRepository;

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private NotificationTemplateRepository notificationTemplateRepository;

	@Autowired
	private FileLogRepository fileLogRepository;

	@Autowired
	private PaymentBatchdetailsRepository paymentBatchdetailsRepository;

	@Autowired
	private PaymentTxndetailsRepository paymentTxndetailsRepository;

	@Autowired
	private BankCommissionPayoutRepository bankCommissionPayoutRepository;

	@Override
	public PaymentTypeResponse getPaymentTypeList(String buId, String bankName) throws Exception {
		PaymentTypeResponse paymentTypeResponse = new PaymentTypeResponse();
		// try {
		List<BankPaymentTypeMapping> bankPaymentTypeMappingList = bankPaymentTypeRepository
				.findBankPaymentTypeMappingListByBuIdAndBankName(buId, bankName);

		if (bankPaymentTypeMappingList.size() > 0) {
			List<String> aList = new ArrayList<String>();
			bankPaymentTypeMappingList.forEach((bankPaymentType) -> {
				aList.add(bankPaymentType.getPaymentType());

			});
			paymentTypeResponse.setPaymentType(aList);

			/*
			 * paymentTypeResponse.setStatus(StatusConstant.STATUS_SUCCESS);
			 * 
			 * } else { paymentTypeResponse.setStatus(StatusConstant.STATUS_FAILURE);
			 * paymentTypeResponse.setErrorCode(ExceptionConstant.DATA_NOT_FOUND_EC);
			 * paymentTypeResponse.setErrorDesc(ExceptionConstant.DATA_NOT_FOUND);
			 * 
			 * } } catch (Exception e) {
			 * paymentTypeResponse.setStatus(StatusConstant.STATUS_FAILURE);
			 * paymentTypeResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			 * paymentTypeResponse.setErrorDesc(e.getMessage());
			 */

		}

		return paymentTypeResponse;
	}

	@Override
	public BankLovResponse getBankLov(String buId) throws Exception {
		BankLovResponse bankLovResponse = new BankLovResponse();
		// try {
		List<BankMaster> bankMasterList = bankMasterRepository.findBankMasterByBuId(buId);

		if (bankMasterList.size() > 0) {
			List<String> bankList = new ArrayList<String>();
			bankMasterList.forEach((bankDetailName) -> {
				bankList.add(bankDetailName.getBankName());

			});
			bankLovResponse.setBankName(bankList);
			/*
			 * bankLovResponse.setStatus(StatusConstant.STATUS_SUCCESS);
			 * 
			 * } else { bankLovResponse.setStatus(StatusConstant.STATUS_FAILURE);
			 * bankLovResponse.setErrorCode(ExceptionConstant.DATA_NOT_FOUND_EC);
			 * bankLovResponse.setErrorDesc(ExceptionConstant.DATA_NOT_FOUND);
			 * 
			 * } } catch (Exception e) {
			 * bankLovResponse.setStatus(StatusConstant.STATUS_FAILURE);
			 * bankLovResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			 * bankLovResponse.setErrorDesc(e.getMessage());
			 */

		}

		return bankLovResponse;
	}

	@Override
	public BankDetailResponse getBankDetails(String buId, String bankName) throws Exception {
		BankDetailResponse bankDetailResponse = new BankDetailResponse();
		// bank master
		BankMaster bankMaster = bankMasterRepository.findBankMasterByBuIdAndBankName(buId, bankName);
		// if (null != bankMaster) {
		// bankDetailResponse.setBuId(bankMaster.getBuId());
		bankDetailResponse.setBuId(bankMaster.getBuId() != null ? bankMaster.getBuId() : SourceConstant.GP);
		bankDetailResponse.setBankName(bankMaster.getBankName());
		bankDetailResponse.setBankId(bankMaster.getBANK_ID());
		bankDetailResponse.setBankCode(bankMaster.getBankCode());
		bankDetailResponse.setBankType(bankMaster.getBankType());
		bankDetailResponse.setCurrency(bankMaster.getCurrency());
		bankDetailResponse.setIrCurrency(bankMaster.getIrCurrency());
		bankDetailResponse.setBankShortName(bankMaster.getBankShortName());
		bankDetailResponse.setStatus(StatusConstant.STATUS_ACTIVE);
		bankDetailResponse.setModifiedBy(bankMaster.getModifiedBy());
		// }
		List<bankPaymentListdetails> listdetails = new ArrayList<bankPaymentListdetails>();
		List<BankPaymentTypeMapping> bankPaymentTypeMapping1 = bankPaymentTypeRepository
				.findBankPaymentTypeMappingListByBuIdAndBankName(buId, bankName);
		for (BankPaymentTypeMapping bankPaymentTypeMapping : bankPaymentTypeMapping1) {
			bankPaymentListdetails obj = new bankPaymentListdetails();
			// if (null != bankPaymentTypeMapping) {
			obj.setBankptId(bankPaymentTypeMapping.getBankPtId());
			obj.setPaymentType(bankPaymentTypeMapping.getPaymentType());
			BankCommissionConfig bankCommissionConfig = bankCommissionConfigRepository
					.findBankCommissionConfigByBuIdAndBankNameAndPaymentType(buId, bankName,
							bankPaymentTypeMapping.getPaymentType());
			obj.setBankcommId(bankCommissionConfig.getBankCommId());
			obj.setPaymentType(bankCommissionConfig.getPaymentType());
			obj.setCommType(bankCommissionConfig.getCommType());
			obj.setAmount(bankCommissionConfig.getAmount());
			obj.setPercentage(bankCommissionConfig.getPercentage());
			obj.setExtAtr1(bankCommissionConfig.getExtAtr1());
			obj.setExtAtr2(bankCommissionConfig.getExtAtr2());
			obj.setExtAtr3(bankCommissionConfig.getExtAtr3());
			obj.setExtAtr4(bankCommissionConfig.getExtAtr4());
			obj.setExtAtr5(bankCommissionConfig.getExtAtr5());
			// }
			BankFtpConfig bankFtpConfig = bankFtpConfigRepository.findBankFtpConfigByBuIdAndBankNameAndPaymentType(buId,
					bankName, bankPaymentTypeMapping.getPaymentType());
			// if (null != bankFtpConfig) {
			obj.setBankftpId(bankFtpConfig.getBankFtpId());
			obj.setPaymentType(bankFtpConfig.getPaymentType());
			obj.setFtpEnabled(bankFtpConfig.getFtpEnabled());
			obj.setFtpIp(bankFtpConfig.getFtpIp());
			obj.setFtpUser(bankFtpConfig.getFtpUser());
			obj.setFtpPassword(bankFtpConfig.getFtpPassword());
			// }
			listdetails.add(obj);
		}
		bankDetailResponse.setPaymentType(listdetails);
		return bankDetailResponse;
	}

	@Transactional
	@Override
	public BankResponse saveBankDetails(BankDetailRequest request) throws Exception {
		// List<String> paymentTypes = new ArrayList<String>();
		StringJoiner txnIds = new StringJoiner(",");
		List<Long> payMapList = new ArrayList<Long>();
		List<Long> payMapList1 = new ArrayList<Long>();
		List<Long> payMapList2 = new ArrayList<Long>();
		BankResponse bankResponse = new BankResponse();
		// bank master
		BankMaster bankMaster;
		bankMaster = bankMasterRepository.findBankMasterByBuIdAndBankName(request.getBuId(), request.getBankName());
		if (null == bankMaster)
			bankMaster = new BankMaster();
		bankMaster.setBuId(request.getBuId() != null ? request.getBuId() : SourceConstant.GP);
		bankMaster.setBankName(request.getBankName());
		bankMaster.setBankCode(request.getBankCode());
		bankMaster.setBankType(request.getBankType());
		bankMaster.setCurrency(request.getCurrency());
		bankMaster.setIrCurrency(request.getIrCurrency());
		bankMaster.setBankShortName(request.getBankShortName());
		//bankMaster.setStatus(StatusConstant.STATUS_ACTIVE);
		bankMaster.setCreatedBy(request.getUserId());
		bankMaster.setModifiedBy(request.getModifiedBy());
		txnIds.add(bankMasterRepository.save(bankMaster).getBANK_ID().toString());
		for (bankPaymentListdetails obj : request.getPaymentType()) {
			try {
				BankPaymentTypeMapping bankPaymentTypeMapping;
				bankPaymentTypeMapping = bankPaymentTypeRepository
						.findBankPaymentTypeMappingByBuIdAndBankNameAndPaymentType(obj.getBuId(), obj.getBankName(),
								obj.getPaymentType());
				if (null == bankPaymentTypeMapping)
					bankPaymentTypeMapping = new BankPaymentTypeMapping();
				// bankPaymentTypeMapping.setBuId(SourceConstant.GP);
				bankPaymentTypeMapping.setBuId(obj.getBuId() != null ? obj.getBuId() : SourceConstant.GP);
				bankPaymentTypeMapping.setBankName(obj.getBankName());
				bankPaymentTypeMapping.setPaymentType(obj.getPaymentType());
				Long pml = bankPaymentTypeRepository.save(bankPaymentTypeMapping).getBankPtId();
				payMapList.add(pml);
				txnIds.add(pml.toString());

				// bank bankCommissionConfig
				BankCommissionConfig bankCommissionConfig;
				bankCommissionConfig = bankCommissionConfigRepository
						.findBankPaymentTypeMappingByBuIdAndBankNameAndPaymentType(obj.getBuId(), obj.getBankName(),
								obj.getPaymentType());
				if (null == bankCommissionConfig)
					bankCommissionConfig = new BankCommissionConfig();
				bankCommissionConfig.setBankName(obj.getBankName());
				bankCommissionConfig.setCommType(obj.getCommType());
				bankCommissionConfig.setAmount(obj.getAmount());
				bankCommissionConfig.setPercentage(obj.getPercentage());
				// bankCommissionConfig.setBuId(SourceConstant.GP);
				bankCommissionConfig.setBuId(obj.getBuId() != null ? obj.getBuId() : SourceConstant.GP);
				bankCommissionConfig.setExtAtr1(obj.getExtAtr1());
				bankCommissionConfig.setExtAtr2(obj.getExtAtr2());
				bankCommissionConfig.setExtAtr3(obj.getExtAtr3());
				bankCommissionConfig.setExtAtr4(obj.getExtAtr4());
				bankCommissionConfig.setExtAtr5(obj.getExtAtr5());
				bankCommissionConfig.setPaymentType(obj.getPaymentType());
				Long pm2 = bankCommissionConfigRepository.save(bankCommissionConfig).getBankCommId();
				payMapList1.add(pm2);
				txnIds.add(pm2.toString());

				// bank bankFtpConfig
				BankFtpConfig bankFtpConfig;
				bankFtpConfig = bankFtpConfigRepository.findBankPaymentTypeMappingByBuIdAndBankNameAndPaymentType(
						obj.getBuId(), obj.getBankName(), obj.getPaymentType());
				if (null == bankFtpConfig)
					bankFtpConfig = new BankFtpConfig();
				bankFtpConfig.setBankName(obj.getBankName());
				bankFtpConfig.setFtpEnabled(obj.getFtpEnabled());
				// bankFtpConfig.setBuId(SourceConstant.GP);
				bankFtpConfig.setBuId(obj.getBuId() != null ? obj.getBuId() : SourceConstant.GP);
				bankFtpConfig.setFtpIp(obj.getFtpIp());
				bankFtpConfig.setFtpUser(obj.getFtpUser());
				bankFtpConfig.setFtpPassword(obj.getFtpPassword());
				bankFtpConfig.setPaymentType(obj.getPaymentType());
				Long pm3 = (bankFtpConfigRepository.save(bankFtpConfig).getBankFtpId());
				payMapList2.add(pm3);
				txnIds.add(pm3.toString());

				bankResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				bankResponse.setErrorCode("");
				bankResponse.setErrorDesc("");
				bankResponse.setTxnIds(txnIds.toString());

			} catch (Exception e) {
				bankResponse.setStatus(StatusConstant.STATUS_FAILURE);
				bankResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
				bankResponse.setErrorDesc(e.getMessage());

			}
		}
		bankPaymentTypeRepository.deleteByBankNameAndBankPtIdNotIn(request.getBankName(), payMapList);
		bankCommissionConfigRepository.deleteByBankNameAndBankCommIdNotIn(request.getBankName(), payMapList1);
		bankFtpConfigRepository.deleteByBankNameAndBankFtpIdNotIn(request.getBankName(), payMapList2);
		return bankResponse;

	}

	@Override
	public List<SearchConversionResponse> searchConversion(String fromCurrency, String toCurrency, String userId,
			String buId) throws Exception {
		List<SearchConversionResponse> searchConversionResponseList = new ArrayList<>();
		List<CurrencyConversionDetails> currencyConversionDetailsList = currencyConversionDetailsRepository
				.findCurrencyConversionDetailsListByfromCurrencyAndToCurrencyAndCreatedByAndBuIdAndStatus(fromCurrency,
						toCurrency, userId, buId, StatusConstant.STATUS_ACTIVE);
		if (null != currencyConversionDetailsList) {
			currencyConversionDetailsList.forEach((currencyConversionDetails) -> {

				SearchConversionResponse searchConversionResponse = new SearchConversionResponse();
				searchConversionResponse.setFrom_Currency(currencyConversionDetails.getFromCurrency());
				searchConversionResponse.setTo_Currency(currencyConversionDetails.getToCurrency());
				searchConversionResponse.setRate(currencyConversionDetails.getRate());
				searchConversionResponse.setEffectiveStdate(currencyConversionDetails.getEffectiveStdate());
				searchConversionResponse.setEffectiveEnddate(currencyConversionDetails.getEffectiveEnddate());
				searchConversionResponse.setId(currencyConversionDetails.getId());
				searchConversionResponseList.add(searchConversionResponse);

			});

		}

		return searchConversionResponseList;
	}
	
	
	/* @Override
	public AddCoversionResponse addConversion(AddConversionRequest addConversionRequest) throws Exception {

		AddCoversionResponse addCoversionResponse = new AddCoversionResponse();
		CurrencyConversionDetails currencyConversionDetails;
		currencyConversionDetails = currencyConversionDetailsRepository
				.findCurrencyConversionDetailsByFromCurrencyAndToCurrencyAndBuIdAndCreatedBy(
						addConversionRequest.getFromCurrency(), addConversionRequest.getToCurrency(),
						addConversionRequest.getBuId(), addConversionRequest.getUserId());
		if (null != currencyConversionDetails) {
			if (currencyConversionDetails.getStatus().contentEquals(StatusConstant.STATUS_INACTIVE)) {
				currencyConversionDetails.setStatus(StatusConstant.STATUS_ACTIVE);
				currencyConversionDetailsRepository.save(currencyConversionDetails);
				addCoversionResponse.setTxnIds(currencyConversionDetails.getId());
				addCoversionResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				addCoversionResponse.setErrorCode("");
				addCoversionResponse.setErrorDesc("");

			} else {
				addCoversionResponse.setTxnIds(currencyConversionDetails.getId());
				// addCoversionResponse.setStatus(StatusConstant.STATUS_FAILURE);
				addCoversionResponse.setErrorCode(ExceptionConstant.STATUS_FOUND_EC);// need to set error code
				// addCoversionResponse.setErrorDesc(ExceptionConstant.STATUS_FOUND_ED);
			}

		} else {

			currencyConversionDetails = new CurrencyConversionDetails();
			currencyConversionDetails.setFromCurrency(addConversionRequest.getFromCurrency());
			currencyConversionDetails.setToCurrency(addConversionRequest.getToCurrency());
			currencyConversionDetails.setRate(addConversionRequest.getRate());
			currencyConversionDetails.setEffectiveStdate(addConversionRequest.getEffectiveStdate());
			currencyConversionDetails.setEffectiveEnddate(addConversionRequest.getEffectiveEnddate());
			currencyConversionDetails.setBuId(
					addConversionRequest.getBuId() == null ? addConversionRequest.getBuId() : SourceConstant.GP);
			currencyConversionDetails.setCreatedBy(addConversionRequest.getUserId());
			currencyConversionDetails.setStatus(StatusConstant.STATUS_ACTIVE);

			try {
				Long id = currencyConversionDetailsRepository.save(currencyConversionDetails).getId();
				addCoversionResponse.setTxnIds(id);
				addCoversionResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				addCoversionResponse.setErrorCode("");
				addCoversionResponse.setErrorDesc("");

			} catch (Exception e) {

				addCoversionResponse.setStatus(StatusConstant.STATUS_FAILURE);
				addCoversionResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
				addCoversionResponse.setErrorDesc(e.getMessage());

			}
		}
		return addCoversionResponse;
	}*/

	 

	@Override
	public AddConversionResponse addConversion(List<AddConversionRequest> addConversionRequestList) throws Exception {
		AddConversionResponse addConversionResponse = new AddConversionResponse();
		StringJoiner txnIds = new StringJoiner(",");
		try {
			if(addConversionRequestList.size()>0){
			addConversionRequestList.forEach((addConversionRequest) -> {
				CurrencyConversionDetails currencyConversionDetails;
				currencyConversionDetails = currencyConversionDetailsRepository
						.findCurrencyConversionDetailsByFromCurrencyAndToCurrencyAndBuIdAndCreatedBy(
								addConversionRequest.getFromCurrency(), addConversionRequest.getToCurrency(),
								addConversionRequest.getBuId(), addConversionRequest.getUserId());
				if (null != currencyConversionDetails) {
					if (currencyConversionDetails.getStatus().equalsIgnoreCase((StatusConstant.STATUS_INACTIVE))) {
						currencyConversionDetails.setStatus(StatusConstant.STATUS_ACTIVE);
						currencyConversionDetailsRepository.save(currencyConversionDetails);					

					}
					txnIds.add(currencyConversionDetails.getId().toString());
					System.out.println(txnIds.toString());
				} else {

					currencyConversionDetails = new CurrencyConversionDetails();
					currencyConversionDetails.setFromCurrency(addConversionRequest.getFromCurrency());
					currencyConversionDetails.setToCurrency(addConversionRequest.getToCurrency());
					currencyConversionDetails.setRate(addConversionRequest.getRate());
					currencyConversionDetails.setEffectiveStdate(addConversionRequest.getEffectiveStdate());
					currencyConversionDetails.setEffectiveEnddate(addConversionRequest.getEffectiveEnddate());
					currencyConversionDetails
							.setBuId(addConversionRequest.getBuId() == null ? addConversionRequest.getBuId()
									: SourceConstant.GP);
					currencyConversionDetails.setCreatedBy(addConversionRequest.getUserId());
					currencyConversionDetails.setStatus(StatusConstant.STATUS_ACTIVE);
					currencyConversionDetailsRepository.save(currencyConversionDetails);
					txnIds.add(currencyConversionDetails.getId().toString());

				}

			});
			if (txnIds.toString().split(",").length >=1) {

				addConversionResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				addConversionResponse.setErrorCode("");
				addConversionResponse.setErrorDesc("");
				addConversionResponse.setTxnIds(txnIds.toString());
				
				
				}
					 
			}else {
				addConversionResponse.setStatus(StatusConstant.STATUS_FAILURE);
				addConversionResponse.setErrorCode(ExceptionConstant.EMPTY_REQUEST_EC);
				addConversionResponse.setErrorDesc(ExceptionConstant.EMPTY_REQUEST_ED);
			}
		} catch (Exception e) {

			addConversionResponse.setStatus(StatusConstant.STATUS_FAILURE);
			addConversionResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			addConversionResponse.setErrorDesc(e.getMessage());

		}
		return addConversionResponse;
	}

	@Override
	public AddConversionResponse deleteConversion(Long Id, String userId, String buId) throws Exception {

		AddConversionResponse addConversionResponse = new AddConversionResponse();

		CurrencyConversionDetails currencyConversionDetails = currencyConversionDetailsRepository
				.findCurrencyConversionDetailsById(Id);

		if (null != currencyConversionDetails) {
			currencyConversionDetails.setStatus(StatusConstant.STATUS_INACTIVE);
			currencyConversionDetailsRepository.save(currencyConversionDetails);
			addConversionResponse.setTxnIds(currencyConversionDetails.getId().toString());
		} else {
			addConversionResponse.setStatus(StatusConstant.STATUS_FAILURE);
			addConversionResponse.setErrorCode(ExceptionConstant.DATA_NOT_FOUND_EC);
			addConversionResponse.setErrorDesc(ExceptionConstant.DATA_NOT_FOUND);
		}

		return addConversionResponse;
	}

	// These are for future use. Will not be used by UI for now
	@Override
	public List<SearchDepositResponse> searchDeposit(String buId, String userId, String AccountType,
			String CustomerType) throws Exception {

		List<SearchDepositResponse> searchDepositResponseList = new ArrayList<>();

		List<MinSecurityDepositConfig> minSecurityDepositConfigList = minSecurityDepositConfigRepository
				.findMinSecurityDepositConfigListByBuIdAndCreatedByAndStatus(buId, userId,
						StatusConstant.STATUS_ACTIVE);
		if (null != minSecurityDepositConfigList) {
			minSecurityDepositConfigList.forEach((minSecurityDepositConfig) -> {

				SearchDepositResponse searchDepositResponse = new SearchDepositResponse();
				searchDepositResponse.setAccountType(minSecurityDepositConfig.getAccountType());
				searchDepositResponse.setCustomerType(minSecurityDepositConfig.getCustomerType());
				searchDepositResponse.setCurrency(minSecurityDepositConfig.getCurrency());
				searchDepositResponse.setAmount(minSecurityDepositConfig.getAmount());
				searchDepositResponseList.add(searchDepositResponse);

			});

		}

		return searchDepositResponseList;
	}
	
	@Override
	public SecurityDepositResponse addUpdateDeleteSecurityDepositConfig(List<SecurityDepositRequest> requestList)
			throws Exception {
		StringJoiner txnIds = new StringJoiner(",");
		SecurityDepositResponse securityDepositResponse = new SecurityDepositResponse();
		try {
			if (requestList.size() > 0) {
				requestList.forEach((securityDepositRequest) -> {
					MinSecurityDepositConfig minSecurityDepositConfig;
					minSecurityDepositConfig = minSecurityDepositConfigRepository
							.findMinSecurityDepositConfigByAccountTypeAndCustomerTypeAndBuId(
									securityDepositRequest.getAccountType(), securityDepositRequest.getCustomerType(),
									securityDepositRequest.getBuId());

					if (null != minSecurityDepositConfig) {
						System.out.println(minSecurityDepositConfig);
						if (minSecurityDepositConfig.getStatus().contentEquals(StatusConstant.STATUS_INACTIVE)) {
							minSecurityDepositConfig.setStatus(StatusConstant.STATUS_ACTIVE);
							minSecurityDepositConfigRepository.save(minSecurityDepositConfig);
							securityDepositResponse.setTxnIds(minSecurityDepositConfig.getId().toString());
						}
						txnIds.add(minSecurityDepositConfig.getId().toString());
					} else {
						minSecurityDepositConfig = new MinSecurityDepositConfig();
						minSecurityDepositConfig
								.setBuId(securityDepositRequest.getBuId() == null ? securityDepositRequest.getBuId()
										: SourceConstant.GP);
						minSecurityDepositConfig.setCreatedBy(securityDepositRequest.getUserId());
						minSecurityDepositConfig.setAccountType(securityDepositRequest.getAccountType());
						minSecurityDepositConfig.setCustomerType(securityDepositRequest.getCustomerType());
						minSecurityDepositConfig.setAmount(securityDepositRequest.getAmount());
						minSecurityDepositConfig.setCurrency(PayCurrency.BDT);
						minSecurityDepositConfig.setStatus(StatusConstant.STATUS_ACTIVE);

						minSecurityDepositConfigRepository.save(minSecurityDepositConfig).getId();
						txnIds.add(minSecurityDepositConfig.getId().toString());
						/*
						 * securityDepositResponse.setStatus(StatusConstant.STATUS_SUCCESS);
						 * securityDepositResponse.setErrorCode("");
						 * securityDepositResponse.setErrorDesc("");
						 */

					}
				});
				if (txnIds.toString().split(",").length >= 1) {
					securityDepositResponse.setStatus(StatusConstant.STATUS_SUCCESS);
					securityDepositResponse.setErrorCode("");
					securityDepositResponse.setErrorDesc("");
					securityDepositResponse.setTxnIds(txnIds.toString());

				}
			} else {
				securityDepositResponse.setStatus(StatusConstant.STATUS_FAILURE);
				securityDepositResponse.setErrorCode(ExceptionConstant.EMPTY_REQUEST_EC);
				securityDepositResponse.setErrorDesc(ExceptionConstant.EMPTY_REQUEST_ED);

			}

		} catch (Exception e) {
			securityDepositResponse.setStatus(StatusConstant.STATUS_FAILURE);
			securityDepositResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
			securityDepositResponse.setErrorDesc(e.getMessage());

		}

		return securityDepositResponse;
	}

	/*@Override
	public SecurityDepositResponse addUpdateDeleteSecurityDepositConfig(SecurityDepositRequest request)
			throws Exception {
		SecurityDepositResponse securityDepositResponse = new SecurityDepositResponse();
		MinSecurityDepositConfig minSecurityDepositConfig;

		minSecurityDepositConfig = minSecurityDepositConfigRepository
				.findMinSecurityDepositConfigByAccountTypeAndCustomerTypeAndBuId(request.getAccountType(),
						request.getCustomerType(), request.getBuId());
		if (null != minSecurityDepositConfig) {

			if (minSecurityDepositConfig.getStatus().contentEquals(StatusConstant.STATUS_INACTIVE)) {
				minSecurityDepositConfig.setStatus(StatusConstant.STATUS_ACTIVE);
				minSecurityDepositConfigRepository.save(minSecurityDepositConfig);
				securityDepositResponse.setTxnIds(minSecurityDepositConfig.getId());
				securityDepositResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				securityDepositResponse.setErrorCode("");
				securityDepositResponse.setErrorDesc("");

			} else {
				securityDepositResponse.setTxnIds(minSecurityDepositConfig.getId());
				// securityDepositResponse.setStatus(StatusConstant.STATUS_FAILURE);
				securityDepositResponse.setErrorCode(ExceptionConstant.STATUS_FOUND_EC);// need to set error code
				// securityDepositResponse.setErrorDesc(ExceptionConstant.STATUS_FOUND_ED);
			}

		} else {
			minSecurityDepositConfig = new MinSecurityDepositConfig();
			minSecurityDepositConfig.setBuId(request.getBuId() == null ? request.getBuId() : SourceConstant.GP);
			minSecurityDepositConfig.setCreatedBy(request.getUserId());
			minSecurityDepositConfig.setAccountType(request.getAccountType());
			minSecurityDepositConfig.setCustomerType(request.getCustomerType());
			minSecurityDepositConfig.setAmount(request.getAmount());
			minSecurityDepositConfig.setCurrency(PayCurrency.BDT);
			minSecurityDepositConfig.setStatus(StatusConstant.STATUS_ACTIVE);
			try {
				Long id = minSecurityDepositConfigRepository.save(minSecurityDepositConfig).getId();
				securityDepositResponse.setTxnIds(id);
				securityDepositResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				securityDepositResponse.setErrorCode("");
				securityDepositResponse.setErrorDesc("");

			} catch (Exception e) {

				securityDepositResponse.setStatus(StatusConstant.STATUS_FAILURE);
				securityDepositResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
				securityDepositResponse.setErrorDesc(e.getMessage());

			}
		}
		return securityDepositResponse;
	}*/

	@Override
	public SearchCustomerAttributeResponse searchCustomerAttribute(String buId, String userId, String attrName,
			String msiSdn, String custCode) throws Exception {

		// any one of msisdn and custcode to be there in request

		SearchCustomerAttributeResponse searchCustomerAttributeResponse = new SearchCustomerAttributeResponse();
		CustomerAttributes customerAttributes;

		if (paymentService.searchCustCodeMsisdn(msiSdn, custCode).getStatus()
				.equalsIgnoreCase(StatusConstant.STATUS_SUCCESS)) {

			if (msiSdn != null && msiSdn.length() > 0) {
				customerAttributes = customerAttibutesRepository
						.findCustomerAttributesByBuIdAndCreatedByAndAttrNameAndMsiSdn(buId, userId, attrName, msiSdn);

			} else {
				customerAttributes = customerAttibutesRepository
						.findCustomerAttributesByBuIdAndCreatedByAndAttrNameAndCustCode(buId, userId, attrName,
								custCode);
			}

			if (null != customerAttributes) {
				searchCustomerAttributeResponse.setAttrValue(customerAttributes.getAttrValue());
				searchCustomerAttributeResponse.setMsiSdn(customerAttributes.getMsiSdn());
				searchCustomerAttributeResponse.setCreatedDate(customerAttributes.getCreatedDate());
			} else {
				searchCustomerAttributeResponse.setStatus(StatusConstant.STATUS_FAILURE);
				searchCustomerAttributeResponse.setErrorCode(ExceptionConstant.MSISDN_OR_CUSTCODE_REQUIRED_ED);
				searchCustomerAttributeResponse.setErrorDesc(ExceptionConstant.MSISDN_OR_CUSTCODE_REQUIRED_EC);
			}
		} else {
			searchCustomerAttributeResponse.setStatus(StatusConstant.STATUS_FAILURE);
			searchCustomerAttributeResponse.setErrorCode(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC);
			searchCustomerAttributeResponse.setErrorDesc(ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);
		}
		return searchCustomerAttributeResponse;
	}

	@Override
	public CustomerAttributeResponse addUpdateDeleteCustomerAttribute(CustomerAttributeRequest request)
			throws Exception {

		CustomerAttributeResponse customerAttributeResponse = new CustomerAttributeResponse();
		CustomerAttributes customerAttributes;
		// validate msisdn/custcode is present in customer profile
		if (paymentService.searchCustCodeMsisdn(request.getMsiSdn(), request.getCustCode()).getStatus()
				.equalsIgnoreCase(StatusConstant.STATUS_SUCCESS)) {

			customerAttributes = customerAttibutesRepository
					.findCustomerAttributesByBuIdAndCreatedByAndCustCodeOrMsiSdnAndAttrName(request.getBuId(),
							request.getUserId(), request.getCustCode(), request.getMsiSdn(), request.getAttrName());
			if (null != customerAttributes) {

				if (customerAttributes.getStatus().contentEquals(StatusConstant.STATUS_INACTIVE)) {
					customerAttributes.setStatus(StatusConstant.STATUS_ACTIVE);
					customerAttibutesRepository.save(customerAttributes);
					customerAttributeResponse.setTxnIds(customerAttributes.getID());
					customerAttributeResponse.setStatus(StatusConstant.STATUS_SUCCESS);
					customerAttributeResponse.setErrorCode("");
					customerAttributeResponse.setErrorDesc("");

				} else {
					customerAttributeResponse.setTxnIds(customerAttributes.getID());
					// customerAttributeResponse.setStatus(StatusConstant.STATUS_FAILURE);
					customerAttributeResponse.setErrorCode(ExceptionConstant.STATUS_FOUND_EC);// need to set error code
					// customerAttributeResponse.setErrorDesc(ExceptionConstant.STATUS_FOUND_ED);
				}

			} else {
				customerAttributes = new CustomerAttributes();
				customerAttributes.setBuId(request.getBuId() == null ? request.getBuId() : SourceConstant.GP);
				customerAttributes.setCreatedBy(request.getUserId());
				customerAttributes.setCustCode(request.getCustCode());
				customerAttributes.setMsiSdn(request.getMsiSdn());
				customerAttributes.setAttrName(request.getAttrName());
				customerAttributes.setAttrValue(request.getAttrValue());
				customerAttributes.setStatus(StatusConstant.STATUS_ACTIVE);

				try {
					Long id = customerAttibutesRepository.save(customerAttributes).getID();
					customerAttributeResponse.setTxnIds(id);
					customerAttributeResponse.setStatus(StatusConstant.STATUS_SUCCESS);
					customerAttributeResponse.setErrorCode("");
					customerAttributeResponse.setErrorDesc("");

				} catch (Exception e) {

					customerAttributeResponse.setStatus(StatusConstant.STATUS_FAILURE);
					customerAttributeResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
					customerAttributeResponse.setErrorDesc(e.getMessage());

				}
			}
		} else {
			customerAttributeResponse.setStatus(StatusConstant.STATUS_FAILURE);
			customerAttributeResponse.setErrorCode(ExceptionConstant.INVALID_MSISDN_CUST_CODE_EC);
			customerAttributeResponse.setErrorDesc(ExceptionConstant.INVALID_MSISDN_CUST_CODE_ED);
		}
		return customerAttributeResponse;
	}

	@Override
	public ModifyNotificationConfigResponse modifyNotificationConfig(ModifyNotificationConfigRequest request)
			throws Exception {

		ModifyNotificationConfigResponse modifyNotificationConfigResponse = new ModifyNotificationConfigResponse();
		NotificationTemplate notificationTemplate;
		notificationTemplate = notificationTemplateRepository
				.findNotificationTemplateByTemplateNameAndTemplateTypeAndModeOfDeliveryAndTemplateLanguageAndSourceAndBuId(
						request.getTemplateName(), request.getTemplateType(), request.getModeOfDelivery(),
						request.getTemplateLanguage(), request.getSource(), request.getBuId());
		if (null != notificationTemplate) {

			if (notificationTemplate.getStatus().contentEquals(StatusConstant.STATUS_INACTIVE)) {
				notificationTemplate.setStatus(StatusConstant.STATUS_ACTIVE);
				notificationTemplateRepository.save(notificationTemplate);
				modifyNotificationConfigResponse.setTxnIds(notificationTemplate.getNotificationTemplateId());
				modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				modifyNotificationConfigResponse.setErrorCode("");
				modifyNotificationConfigResponse.setErrorDesc("");

			} else {
				/*modifyNotificationConfigResponse.setTxnIds(notificationTemplate.getNotificationTemplateId());
				// modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_FAILURE);
				modifyNotificationConfigResponse.setErrorCode(ExceptionConstant.STATUS_FOUND_EC);// need to set error code
				// modifyNotificationConfigResponse.setErrorDesc(ExceptionConstant.STATUS_FOUND_ED);*/
				
				notificationTemplate.setNotificationSubject(request.getNotificationSubject());
				notificationTemplate.setNotificationBody(request.getNotificationBody());
				notificationTemplate.setShortCode(request.getShortCode());
				Long id = notificationTemplateRepository.save(notificationTemplate).getNotificationTemplateId();
				modifyNotificationConfigResponse.setTxnIds(id);
				modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				modifyNotificationConfigResponse.setErrorCode("");
				modifyNotificationConfigResponse.setErrorDesc("");
			}
			/*if (notificationTemplate.getStatus().contentEquals(StatusConstant.STATUS_ACTIVE)) {
				notificationTemplate.setStatus(StatusConstant.STATUS_INACTIVE);
				notificationTemplateRepository.save(notificationTemplate);
				modifyNotificationConfigResponse.setTxnIds(notificationTemplate.getNotificationTemplateId());
				modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				modifyNotificationConfigResponse.setErrorCode("");
				modifyNotificationConfigResponse.setErrorDesc("");

			} else {
				notificationTemplate.setNotificationSubject(request.getNotificationSubject());
				notificationTemplate.setNotificationBody(request.getNotificationBody());
				Long id = notificationTemplateRepository.save(notificationTemplate).getNotificationTemplateId();
				modifyNotificationConfigResponse.setTxnIds(id);
				modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				modifyNotificationConfigResponse.setErrorCode("");
				modifyNotificationConfigResponse.setErrorDesc("");
			}*/

		} else {
			notificationTemplate = new NotificationTemplate();
			notificationTemplate.setBuId(request.getBuId() == null ? request.getBuId() : SourceConstant.GP);
			notificationTemplate.setCreatedBy(request.getUserId());
			notificationTemplate.setSource(request.getSource());
			notificationTemplate.setTemplateName(request.getTemplateName());
			notificationTemplate.setTemplateType(request.getTemplateType());
			notificationTemplate.setTemplateLanguage(request.getTemplateLanguage());
			notificationTemplate.setModeOfDelivery(request.getModeOfDelivery());
			notificationTemplate.setNotificationTemplateId(request.getNotificationTemplateId());
			notificationTemplate.setStatus(StatusConstant.STATUS_ACTIVE);
			notificationTemplate.setNotificationSubject(request.getNotificationSubject());
			notificationTemplate.setNotificationBody(request.getNotificationBody());
			notificationTemplate.setShortCode(request.getShortCode());
			try {
				Long id = notificationTemplateRepository.save(notificationTemplate).getNotificationTemplateId();
				modifyNotificationConfigResponse.setTxnIds(id);
				modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_SUCCESS);
				modifyNotificationConfigResponse.setErrorCode("");
				modifyNotificationConfigResponse.setErrorDesc("");

			} catch (Exception e) {
				modifyNotificationConfigResponse.setStatus(StatusConstant.STATUS_FAILURE);
				modifyNotificationConfigResponse.setErrorCode(ExceptionConstant.UNKNOWN_ERROR_EC);
				modifyNotificationConfigResponse.setErrorDesc(e.getMessage());

			}
		}

		return modifyNotificationConfigResponse;
	}

	/*
	 * @Override public List<SearchNotificationResponse> searchNotification(String
	 * buId, String userId, String Module, String NotificationName, String Language,
	 * String NotificationType, String DeliveryMode) throws Exception {
	 * 
	 * List<SearchNotificationResponse> searchNotificationResponseList = new
	 * ArrayList<>(); List<NotificationTemplate> notificationTemplateList =
	 * notificationTemplateRepository.
	 * findNotificationTemplateListByBuIdAndCreatedByAndSourceAndTemplateNameAndTemplateLanguageAndTemplateTypeAndModeOfDeliveryAndStatus
	 * (buId,userId,Module,NotificationName,Language,NotificationType,DeliveryMode,
	 * StatusConstant.STATUS_ACTIVE); if (null != notificationTemplateList) {
	 * notificationTemplateList.forEach((notificationTemplate)->{
	 * SearchNotificationResponse searchNotificationResponse=new
	 * SearchNotificationResponse();
	 * searchNotificationResponse.setRowId(notificationTemplate.
	 * getNotificationTemplateId());
	 * searchNotificationResponse.setStatus(notificationTemplate.getStatus());
	 * searchNotificationResponse.setNotificationSubject(notificationTemplate.
	 * getNotificationSubject());
	 * searchNotificationResponse.setNotificationBody(notificationTemplate.
	 * getNotificationBody());
	 * searchNotificationResponse.setShortCode(notificationTemplate.getShortCode());
	 * searchNotificationResponseList.add(searchNotificationResponse);
	 * 
	 * });
	 * 
	 * }
	 * 
	 * return searchNotificationResponseList; }
	 */

	@Override
	public SearchNotificationResponse searchNotification(String buId, String userId, String Module,
			String NotificationName, String Language, String NotificationType, String DeliveryMode) throws Exception {

		SearchNotificationResponse searchNotificationResponse = new SearchNotificationResponse();
		NotificationTemplate notificationTemplate = new NotificationTemplate();

		notificationTemplate = notificationTemplateRepository
				.findNotificationTemplateListByBuIdAndCreatedByAndSourceAndTemplateNameAndTemplateLanguageAndTemplateTypeAndModeOfDeliveryAndStatus(
						buId, userId, Module, NotificationName, Language, NotificationType, DeliveryMode,
						StatusConstant.STATUS_ACTIVE);

		if (null != notificationTemplate) {
			// notificationTemplateList.forEach((notificationTemplate)->{

			searchNotificationResponse.setRowId(notificationTemplate.getNotificationTemplateId());
			searchNotificationResponse.setStatus(notificationTemplate.getStatus());
			searchNotificationResponse.setNotificationSubject(notificationTemplate.getNotificationSubject());
			searchNotificationResponse.setNotificationBody(notificationTemplate.getNotificationBody());
			searchNotificationResponse.setShortCode(notificationTemplate.getShortCode());
			// searchNotificationResponseList.add(searchNotificationResponse);

		}

		return searchNotificationResponse;
	}

	@Override
	public BulkCustomerAttributeResponse bulkSaveCustomerAttribute(BulkCustomerAttributeRequest request)
			throws Exception {

		StringJoiner txnIds = new StringJoiner(",");
		BulkCustomerAttributeResponse response = new BulkCustomerAttributeResponse();

		FileLog file = new FileLog();
		file.setBuId(request.getBuId() != null ? request.getBuId() : SourceConstant.GP);
		file.setCreatedBy(request.getUserId());
		file.setFileName(request.getFileName());
		file.setJobName(request.getJobName());
		file.setStatus(StatusConstant.STATUS_SUBMITTED);
		PaymentBatchDetails batchDetails = new PaymentBatchDetails();
		batchDetails.setBuId(request.getBuId() != null ? request.getBuId() : SourceConstant.GP);
		batchDetails.setCreatedBy(request.getUserId());
		batchDetails.setSource(request.getSource());
		batchDetails.setSourceTxnId(request.getSourceTxnId());
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
	public List<BankCommissionPayoutResponse> searchBankCommPayout(String buId, String userId, String BankName,
			String CommissionType, String PaymentType, String FromDate, String ToDate) throws Exception {

		List<BankCommissionPayoutResponse> bankCommissionPayoutResponseList = new ArrayList<>();
		String limit = "";
		List<BankCommissionPayout> bankCommissionPayoutList;
		if (BankName == null && CommissionType == null && PaymentType == null && FromDate == null && ToDate == null)
			bankCommissionPayoutList = bankCommissionPayoutRepository.findBankCommissionPayoutList(buId, userId,
					BankName, CommissionType, PaymentType, FromDate, ToDate);
		else {
			buId=(buId==null)?"%":buId;
			userId=(userId==null)?"%":userId;
			BankName=(BankName==null)?"%":BankName;
			CommissionType=(CommissionType==null)?"%":CommissionType;
			PaymentType=(PaymentType==null)?"%":PaymentType;
			FromDate=(FromDate==null)?"%":FromDate;
			ToDate=(ToDate==null)?"%":ToDate;
			
			System.out.println("XDs"+buId+userId+BankName+CommissionType+PaymentType+FromDate+ToDate);
			
			bankCommissionPayoutList = bankCommissionPayoutRepository.findBankCommissionPayoutListNoLimit(buId, userId,
					BankName, CommissionType, PaymentType, FromDate, ToDate);
		}

		
		
		if (null != bankCommissionPayoutList) {
			bankCommissionPayoutList.forEach((bankCommissionPayout) -> {
				BankCommissionPayoutResponse bankCommissionPayoutResponse = new BankCommissionPayoutResponse();

				bankCommissionPayoutResponse.setBankName(bankCommissionPayout.getBankName());
				bankCommissionPayoutResponse.setCommAmount(bankCommissionPayout.getCommAmount());
				bankCommissionPayoutResponse.setCommLogic(bankCommissionPayout.getCommLogic());
				bankCommissionPayoutResponse.setCommType(bankCommissionPayout.getCommType());
				bankCommissionPayoutResponse.setGenDate(bankCommissionPayout.getGenDate());
				bankCommissionPayoutResponse.setPaymentType(bankCommissionPayout.getPaymentType());
				bankCommissionPayoutResponse.setTotalCount(bankCommissionPayout.getTotalCount());
				bankCommissionPayoutResponse.setTotalAmount(bankCommissionPayout.getTotalAmount());
				bankCommissionPayoutResponseList.add(bankCommissionPayoutResponse);

			});

		}
		return bankCommissionPayoutResponseList;
	}

}
