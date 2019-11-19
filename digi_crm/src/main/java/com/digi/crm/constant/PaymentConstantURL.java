package com.digi.crm.constant;

public interface PaymentConstantURL {

	public static final String Payment_Rest_Controller = "payments/";
	public static final String Payment_Details_URL = "indPayments";
	public static final String Save_Batch_Payment_Details_URL = "batchPayments";
	public static final String Adfjustment_Details_URL = "adjustmentAndConversion";
	public static final String Save_Adjustment_Batch_Payment_Details_URL = "batchAdjustmentAndConversion";
	public static final String Search_Custcode_msdn = "searchCustCodeMsdn";
	public static final String Get_Lookup_Api_Details = "getLookupApiDetails";
	//Payment_Listof_value_Rest_Controller
	
	public static final String Payment_Listof_value_Rest_Controller = "paymenListofValue/";
	public static final String Get_Payment_TypeList = "getPaymentTypeList";
	public static final String Get_Bank_List = "getBankList";
	public static final String Get_Bank_Details = "getBankDetails";
	public static final String Save_Bank_Details = "saveBankDetails";
	public static final String Search_Bank_Commision_Details = "searchBankCommPayout";
	
	public static final String Search_Conversion_Api = "searchConversion";
	public static final String Add_Conversion_Api = "addConversion";
	public static final String Delete_Conversion_Api = "deleteConversion";
	
	
	public static final String Search_Deposit_Config = "searchDepositConfig";
	public static final String Add_Update_Delete_Security_Deposit_Config = "addUpdateDeleteSecurityDepositConfig";
	
	public static final String Search_Customer_Attribute = "searchCustomerAttribute";
	public static final String Add_Update_Delete_Customer_Attribute = "addUpdateDeleteCustomerAttribute";
	public static final String Bulk_Save_Customer_Attribute = "bulkSaveCustomerAttribute";
	
	
	public static final String Modify_Notification_Cconfig = "modifyNotificationConfig";
	public static final String Search_Notification = "searchNotification";

}
