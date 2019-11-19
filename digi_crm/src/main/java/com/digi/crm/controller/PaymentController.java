package com.digi.crm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digi.crm.constant.PaymentConstantURL;
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
import com.digi.crm.service.PaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(PaymentConstantURL.Payment_Rest_Controller)
@Api(value = "Payment Rest Controller")
public class PaymentController {

	/* Test Comment */
	@Autowired
	private PaymentService paymentServiceImpl;

	@ApiOperation(value = "POST method for Individual Payment", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Payment_Details_URL, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public PaymentDetailsResponse savePaymentDetails(@RequestBody PaymentDetailsRequest paymentDetailsRequest)
			throws Exception {

		return paymentServiceImpl.savePaymentDetails(paymentDetailsRequest);
	}

	@ApiOperation(value = "POST method for Batch Payment Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Save_Batch_Payment_Details_URL, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public BatchPaymentResponse saveBatchPaymentDetails(@RequestBody BatchPaymentRequest request) throws Exception {

		return paymentServiceImpl.saveBatchPaymentDetails(request);

	}

	@ApiOperation(value = "POST method for Adjustment Details", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Adfjustment_Details_URL, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public AdjustmentDetailsResponse saveAdjustmentDetails(
			@RequestBody AdjustmentDetailsRequest adjustmentDetailsRequest) throws Exception {

		return paymentServiceImpl.saveAdjustmentDetails(adjustmentDetailsRequest);
	}

	@ApiOperation(value = "POST method for Adjustment Batch Payment", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Save_Adjustment_Batch_Payment_Details_URL, method = RequestMethod.POST, produces = "application/json")
	@CrossOrigin
	public AdjustBatchPaymentResponse saveAdjustBatchPayment(@RequestBody AdjustBatchPaymentRequest request)
			throws Exception {

		return paymentServiceImpl.saveAdjustBatchPayment(request);

	}

	//To be moved to Common.war
	@ApiOperation(value = "GET Search method for CustCode and Msisdn", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Search_Custcode_msdn, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public CustomProfileResponse searchCustCodeMsisdn(@RequestParam(value = "msiSdn", required = false) String msiSdn,
			@RequestParam(value = "custCode", required = false) String custCode) throws Exception {
	
		return paymentServiceImpl.searchCustCodeMsisdn(msiSdn, custCode);

		
	}
	
	//To be moved to Common.war
	@ApiOperation(value = "Get method for get lookup api", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 404, message = ""), @ApiResponse(code = 201, message = "") })
	@RequestMapping(value = PaymentConstantURL.Get_Lookup_Api_Details, method = RequestMethod.GET, produces = "application/json")
	@CrossOrigin
	public List<LookupResponse> getLookupApiDetails(@RequestParam (value ="parentLookupValue", required = false) String parentLookupValue, @RequestParam String lookupGroup, @RequestParam  String lookupName, @RequestParam  String buId)
			throws Exception {
       
		return paymentServiceImpl.getLookupApiDetails(parentLookupValue,lookupGroup,lookupName,buId);

	}
	

	
}
