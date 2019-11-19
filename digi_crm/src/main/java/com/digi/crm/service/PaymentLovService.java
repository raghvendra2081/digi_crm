package com.digi.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

@Service
public interface PaymentLovService {

	
	public PaymentTypeResponse getPaymentTypeList(String buId,String bankName) throws Exception;
	public BankLovResponse getBankLov(String buId) throws Exception;	
	public BankDetailResponse getBankDetails(String buId,String bankName) throws Exception;	
	public BankResponse saveBankDetails(BankDetailRequest request)throws Exception;
	
	public List<SearchConversionResponse> searchConversion(String fromCurrency,String toCurrency,String userId,String buId) throws Exception;	
	//public AddConversionResponse addConversion(AddConversionRequest addConversionRequest)throws Exception;
	public AddConversionResponse addConversion(List<AddConversionRequest> addConversionRequestList) throws Exception;
	public AddConversionResponse deleteConversion(Long Id,String userId,String buId) throws Exception;
	
	public List<SearchDepositResponse>searchDeposit(String buId, String userId,String AccountType,String CustomerType) throws Exception;
	//public SecurityDepositResponse addUpdateDeleteSecurityDepositConfig(SecurityDepositRequest request)throws Exception;
	public SecurityDepositResponse addUpdateDeleteSecurityDepositConfig(List<SecurityDepositRequest> requestList)throws Exception;
	
	
	public SearchCustomerAttributeResponse searchCustomerAttribute(String buId, String userId,String attrName,String msiSdn,String custCode) throws Exception;
	public CustomerAttributeResponse addUpdateDeleteCustomerAttribute(CustomerAttributeRequest request)throws Exception;	
	public BulkCustomerAttributeResponse bulkSaveCustomerAttribute(BulkCustomerAttributeRequest request)throws Exception;
	

	
	public ModifyNotificationConfigResponse modifyNotificationConfig(ModifyNotificationConfigRequest request)throws Exception;	
	public SearchNotificationResponse searchNotification(String buId, String userId,String Module,String NotificationName,String Language,String NotificationType,String DeliveryMode)throws Exception;;
	
	public List<BankCommissionPayoutResponse> searchBankCommPayout(String buId, String userId, String BankName,
			String CommissionType, String PaymentType, String FromDate, String ToDate) throws Exception;


}
