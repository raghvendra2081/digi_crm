package com.digi.crm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digi.crm.constant.PaymentConstantURL;
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
import com.digi.crm.service.PaymentLovService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(PaymentConstantURL.Payment_Listof_value_Rest_Controller)
@Api(value = "Payment list of value Rest Controller")
public class PaymentListofValueController {
	
	@Autowired
	private PaymentLovService paymentLovServiceImpl;
	
	private static final Logger LOGGGER=LoggerFactory.getLogger(PaymentListofValueController.class);

	@ApiOperation(value = "GET Payment Type List", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Get_Payment_TypeList, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public PaymentTypeResponse getPaymentTypeList(@RequestParam String buId, @RequestParam String bankName)
			throws Exception {

		return paymentLovServiceImpl.getPaymentTypeList(buId, bankName);
		

	}
	
	//Bank Configuration APIs
	@ApiOperation(value = "GET Bank List Of Value", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Get_Bank_List, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public BankLovResponse getBankLov(@RequestParam String buId)
			throws Exception {

		return paymentLovServiceImpl.getBankLov(buId);

	}
	
	//Bank Configuration APIs
	@ApiOperation(value = "GET Bank Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Get_Bank_Details, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public BankDetailResponse getBankDetails(@RequestParam String buId, @RequestParam String bankName)
			throws Exception {
		
		return paymentLovServiceImpl.getBankDetails(buId, bankName);

	}
	
	//Bank Configuration APIs
	@ApiOperation(value = "Save Bank Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Save_Bank_Details, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public BankResponse saveBankDetails(@RequestBody BankDetailRequest request)
			throws Exception {

		return paymentLovServiceImpl.saveBankDetails(request);

	}
	
	// Bank Configuration APIs
	@ApiOperation(value = "Search Bank Commission Payout Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Search_Bank_Commision_Details, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public List<BankCommissionPayoutResponse> searchBankCommPayout(@RequestParam String buId,
			@RequestParam String userId, @RequestParam(value = "BankName", required = false) String BankName,
			@RequestParam(value = "CommissionType", required = false) String CommissionType,
			@RequestParam(value = "PaymentType", required = false) String PaymentType,
			@RequestParam(value = "FromDate", required = false) String FromDate,
			@RequestParam(value = "ToDate", required = false) String ToDate) throws Exception {

		return paymentLovServiceImpl.searchBankCommPayout(buId, userId, BankName, CommissionType, PaymentType, FromDate,
				ToDate);

	}
	
	//Currency conversion APIs
	@ApiOperation(value = "Search Coversion Rate API", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Search_Conversion_Api, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public List<SearchConversionResponse> searchConversion(@RequestParam String fromCurrency, @RequestParam String toCurrency, @RequestParam String userId,@RequestParam String buId)
			throws Exception {

		return paymentLovServiceImpl.searchConversion(fromCurrency,toCurrency,userId,buId);

	}

	//Currency conversion APIs
	@ApiOperation(value = "POST method for Add conversion Rate API", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Add_Conversion_Api, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public AddConversionResponse addConversion(@RequestBody List<AddConversionRequest> addConversionRequestList)
			throws Exception {

		return paymentLovServiceImpl.addConversion(addConversionRequestList);
	}
	
	//Currency conversion APIs
	@ApiOperation(value = "Delete Coversion Rate API", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Delete_Conversion_Api, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public AddConversionResponse deleteConversion(@RequestParam Long Id,@RequestParam String userId,@RequestParam String buId)
			throws Exception {

		return paymentLovServiceImpl.deleteConversion(Id,userId,buId);

	}
	
	//Minimum Security deposit UI
	@ApiOperation(value = "Search Deposit Config Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Search_Deposit_Config, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public List<SearchDepositResponse>searchDeposit(@RequestParam String buId, @RequestParam String userId,@RequestParam (value = "AccountType", required = false) String AccountType,@RequestParam (value = "CustomerType", required = false) String CustomerType)
			throws Exception {
		
		return paymentLovServiceImpl.searchDeposit(buId, userId,AccountType,CustomerType);

	}
	
	// Minimum Security deposit UI
	@ApiOperation(value = "Add update delete security Deposit Config Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Add_Update_Delete_Security_Deposit_Config, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public SecurityDepositResponse addUpdateDeleteSecurityDepositConfig(
			@RequestBody List<SecurityDepositRequest> requestList) throws Exception {

		return paymentLovServiceImpl.addUpdateDeleteSecurityDepositConfig(requestList);

	}
	
	// Minimum Security deposit UI
	/*@ApiOperation(value = "Add update delete security Deposit Config Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Add_Update_Delete_Security_Deposit_Config, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public SecurityDepositResponse addUpdateDeleteSecurityDepositConfig(@RequestBody SecurityDepositRequest request )
			throws Exception {

		return paymentLovServiceImpl.addUpdateDeleteSecurityDepositConfig(request);

	}*/
	
	
	
	// DND Email & SMS UIs APIs
	@ApiOperation(value = "Search Customer Attribute Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Search_Customer_Attribute, method = RequestMethod.GET, produces = "application/json")  //buid,user,attr mandatory
	@CrossOrigin
	public SearchCustomerAttributeResponse searchCustomerAttribute(@RequestParam String buId,@RequestParam String userId,@RequestParam String attrName,@RequestParam (value = "msiSdn", required = false) String msiSdn,@RequestParam (value = "custCode", required = false)String custCode)
			throws Exception {

		return paymentLovServiceImpl.searchCustomerAttribute(buId,userId,attrName,msiSdn,custCode);

	}
		
	// DND Email & SMS UIs APIs
	@ApiOperation(value = "Add update delete security Customer Attribute Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Add_Update_Delete_Customer_Attribute, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public CustomerAttributeResponse addUpdateDeleteCustomerAttribute(@RequestBody CustomerAttributeRequest request )
			throws Exception {

		return paymentLovServiceImpl.addUpdateDeleteCustomerAttribute(request);

	}
	
	// DND Email & SMS UIs APIs
	@ApiOperation(value = "Bulk Save  Customer Attribute Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Bulk_Save_Customer_Attribute, method = RequestMethod.POST, produces = "application/json")//need to discuss
	@CrossOrigin
	public BulkCustomerAttributeResponse bulkSaveCustomerAttribute(@RequestBody BulkCustomerAttributeRequest request)
			throws Exception {

		return paymentLovServiceImpl.bulkSaveCustomerAttribute(request);

	}
	
	//Notification Configuration UI related APIs
	@ApiOperation(value = "Add update delete & ModifyNotificationConfig  Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Modify_Notification_Cconfig, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public ModifyNotificationConfigResponse modifyNotificationConfig(@RequestBody ModifyNotificationConfigRequest request)
			throws Exception {

		return paymentLovServiceImpl.modifyNotificationConfig(request);

	}
	
	
	// Notification Configuration UI related APIs
	@ApiOperation(value = "Search SearchNotificationConfig Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Search_Notification, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public SearchNotificationResponse searchNotification(@RequestParam String buId, @RequestParam String userId,
			@RequestParam String Module, @RequestParam String NotificationName, @RequestParam String Language,
			@RequestParam String NotificationType, @RequestParam String DeliveryMode) throws Exception {

		return paymentLovServiceImpl.searchNotification(buId, userId, Module, NotificationName, Language,
				NotificationType, DeliveryMode);

	}
	
	
		
	
}
